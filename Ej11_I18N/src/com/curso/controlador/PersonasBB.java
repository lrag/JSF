package com.curso.controlador;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

@ManagedBean(name="personasBB")
public class PersonasBB {
	
	public String insertar(){
		
		FacesContext.getCurrentInstance().addMessage("", new FacesMessage("msg.mensaje_insertarPersona"));
		
		return null;
	}

}
