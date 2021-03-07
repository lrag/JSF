package com.curso.bbean;

import javax.faces.bean.ManagedBean;

@ManagedBean(name = "otraBean")
public class OtraBean {

	private String dato = "HOLA";

	public String getDato() {
		return dato;
	}

	public void setDato(String dato) {
		this.dato = dato;
	}

}
