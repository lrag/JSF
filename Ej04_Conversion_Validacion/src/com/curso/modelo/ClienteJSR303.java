package com.curso.modelo;

import java.io.Serializable;
import java.util.Date;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

@ManagedBean(name = "clienteJSR303")
@RequestScoped
public class ClienteJSR303 implements Serializable {

	private static final long serialVersionUID = 1L;

	private int idCliente;
	@NotNull
	@NotBlank
	private String nombre;
	@NotNull
	@NotBlank
	@Size(min=8)
	private String direccion;
	@Min(0)
	private long telefono;
	@Past
	private Date fechaAlta;

	private CuentaBancaria cuentaBancaria;

	public ClienteJSR303() {
		super();
	}

	public ClienteJSR303(int idCliente, String nombre, String direccion, long telefono, Date fechaAlta) {
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

	@Override
	public String toString() {
		return "ClienteJSR303 [idCliente=" + idCliente + ", nombre=" + nombre + ", direccion=" + direccion
				+ ", telefono=" + telefono + ", fechaAlta=" + fechaAlta + ", cuentaBancaria=" + cuentaBancaria + "]";
	}
	
}
