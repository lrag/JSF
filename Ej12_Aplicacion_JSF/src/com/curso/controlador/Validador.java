package com.curso.controlador;

import java.util.Set;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.validation.ConstraintViolation;
import javax.validation.Path;
import javax.validation.Validation;
import javax.validation.Validator;

public class Validador {

	public static boolean validar(Object obj, FacesContext fCtx, String formulario){
		
		boolean ok = true;
		Validator validador = Validation.buildDefaultValidatorFactory().getValidator();
		
		Set<ConstraintViolation<Object>> constraintViolations = validador.validate(obj);  
		for(ConstraintViolation<Object> constraintViolation : constraintViolations){
			ok = false;
			Path propiedad = constraintViolation.getPropertyPath();  
			String mensaje = constraintViolation.getMessage(); 
			fCtx.addMessage(formulario+":"+propiedad, new FacesMessage(mensaje));
		}
		return ok;		
	}
	
}
