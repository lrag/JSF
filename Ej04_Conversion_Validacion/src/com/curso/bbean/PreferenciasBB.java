package com.curso.bbean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class PreferenciasBB {

	private String formatoFecha = "dd/MM/yyyy";

	public String getFormatoFecha() {
		return formatoFecha;
	}

	public void setFormatFecha(String formatoFecha) {
		this.formatoFecha = formatoFecha;
	}
	
}
