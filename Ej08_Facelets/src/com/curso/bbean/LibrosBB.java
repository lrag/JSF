package com.curso.bbean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import com.curso.modelo.Libro;

@ManagedBean(name="librosBB")
@RequestScoped
public class LibrosBB {

	private Libro libro = new Libro();

	public Libro getLibro() {
		return libro;
	}

	public void setLibro(Libro libro) {
		this.libro = libro;
	}
	
	public String insertar() {
		System.out.println("Insertando el libro:"+libro);
		return null;
	}
	
	public String modificar() {
		System.out.println("Modificando el libro:"+libro);
		return null;
	}
	
	public String borrar() {
		System.out.println("Borrando el libro:"+libro);
		return null;
	}
	
	public String vaciar() {
		libro = new Libro();
		return null;
	}
		
}
