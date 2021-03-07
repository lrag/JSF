package com.curso.modelo;

import java.io.Serializable;
import java.util.Date;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "cliente")
// Si no ponemos 'name' toma por defecto el nombre de la clase
@RequestScoped
// Es tontería ponerlo puesto que es el scope por defecto
public class Cliente implements Serializable {

	private static final long serialVersionUID = 1L;

	private int idCliente;
	private String nombre;
	private String direccion;
	private long telefono;
	private Date fechaAlta;

	private CuentaBancaria cuentaBancaria;

	public Cliente() {
		super();
	}

	public Cliente(int idCliente, String nombre, String direccion, long telefono, Date fechaAlta) {
		super();
		this.idCliente = idCliente;
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
		this.fechaAlta = fechaAlta;
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

	public CuentaBancaria getCuentaBancaria() {
		return cuentaBancaria;
	}

	public void setCuentaBancaria(CuentaBancaria cuentaBancaria) {
		this.cuentaBancaria = cuentaBancaria;
	}

	public Date getFechaAlta() {
		return fechaAlta;
	}

	public void setFechaAlta(Date fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

}
