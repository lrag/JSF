package com.curso.validadores;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

import com.curso.modelo.CuentaBancaria;

@FacesValidator(value="validadorCuentaBancaria")
public class ValidadorCuentaBancaria implements Validator{

	@Override
	public void validate(FacesContext fCtx, UIComponent componente, Object objeto)
			throws ValidatorException {
		CuentaBancaria cb = (CuentaBancaria) objeto;
		int dc = Integer.parseInt(cb.getDc());
		if(dc<10){
			throw new ValidatorException(new FacesMessage("D.C. incorrecto."));
		}		
	}
}
