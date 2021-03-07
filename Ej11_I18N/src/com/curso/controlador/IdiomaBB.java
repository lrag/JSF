package com.curso.controlador;

import java.util.Locale;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.context.FacesContext;

import com.curso.modelo.Usuario;

@ManagedBean(name = "idiomaBB")
public class IdiomaBB {

	@ManagedProperty(value = "#{usuario}")
	private Usuario usuario;

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public String cambiarIdioma(String idioma) {

		FacesContext.getCurrentInstance().getViewRoot().setLocale(new Locale(idioma));
		usuario.setIdioma(idioma);
		
		return null;
	}

}
