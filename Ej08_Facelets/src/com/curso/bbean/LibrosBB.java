package com.curso.bbean;

import javax.faces.bean.ManagedBean;

import com.curso.modelo.Libro;

@ManagedBean
public class LibrosBB {

	private Libro libro;

	public Libro getLibro() {
		return libro;
	}

	public void setLibro(Libro libro) {
		this.libro = libro;
	}
	
	public String insertar() {
		System.out.println("Insertando libro:"+libro);
		return null;
	}
	
	
}
