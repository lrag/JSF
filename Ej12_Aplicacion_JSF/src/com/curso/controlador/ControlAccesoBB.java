package com.curso.controlador;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

import com.curso.modelo.Usuario;

@ManagedBean(name="controlAccesoBB")
public class ControlAccesoBB {
	
	@ManagedProperty(value="#{usuario}")
	private Usuario usuario;

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	public String login(){
		
		if(usuario.getLogin().equals("a") && usuario.getPw().equals("a")){
			usuario.setIdUsuario(5);
			return "seguro/discos";			
		} else {
			return "login";
		}
				
	}

}
