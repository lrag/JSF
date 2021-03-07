package com.curso.bbean;

import javax.el.ELResolver;
import javax.faces.application.NavigationHandler;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

@ManagedBean
//No ponemos scope -> request
public class PruebasBB {
	
	//Para nevegar
	public void metodoActionListener(ActionEvent e){
		
		//Para navegar a saco
		FacesContext fCtx = FacesContext.getCurrentInstance();
		NavigationHandler nh = fCtx.getApplication().getNavigationHandler();
		nh.handleNavigation(fCtx, "otraPagina", null);
		
	}
	
	//Para acceder a otras BB
	public String metodoQueAccedeAOtraBB(){
		
		//Para acceder a saco
		FacesContext fCtx = FacesContext.getCurrentInstance();
		ELResolver el = fCtx.getApplication().getELResolver(); //.getVariableResolver();
		el.getValue(fCtx.getELContext(), "otraBB", null);
		
		return null;
	}
	
	//Para acceder a los recursos del contenedor de servlets
	public String metodoServletContext(){
		
		FacesContext fCtx = FacesContext.getCurrentInstance();
		//fCtx.getExternalContext().
		
		return null;
	}
	
	
}
