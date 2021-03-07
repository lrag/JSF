package com.curso.bbean;

import java.util.Locale;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.context.FacesContext;
import javax.validation.constraints.Min;

import com.curso.modelo.Usuario;

@ManagedBean(name = "idiomaBB")
public class IdiomaBB {

	@Min(value=5, message="{mensaje}")
	private int dato;
	
	@ManagedProperty(value = "#{usuario}")
	private Usuario usuario;

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public String cambiarIdioma(String idioma) {

		usuario.setIdioma(idioma);
		FacesContext.getCurrentInstance().getViewRoot().setLocale(new Locale(idioma));

		return null;

	}

	public void setDato(int dato) {
		this.dato = dato;
	}

	public int getDato() {
		return dato;
	}
	
	

}
