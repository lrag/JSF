package com.curso.modelo.entidad;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

public class Cliente implements Serializable{

	private static final long serialVersionUID = 1L;

	private int idCliente;
	private String nombre;
	private String direccion;
	private long telefono;

	public Cliente() {
		super();
	}

	public Cliente(int idCliente, String nombre, String direccion, long telefono) {
		super();
		this.idCliente = idCliente;
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public long getTelefono() {
		return telefono;
	}

	public void setTelefono(long telefono) {
		this.telefono = telefono;
	}

	@Override
	public String toString() {
		return "Cliente [idCliente=" + idCliente + ", nombre=" + nombre + ", direccion=" + direccion + ", telefono="
				+ telefono + "]";
	}

}