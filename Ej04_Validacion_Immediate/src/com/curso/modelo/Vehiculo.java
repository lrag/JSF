package com.curso.modelo;

import java.util.Date;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.jws.Oneway;
import javax.validation.constraints.Future;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

@ManagedBean(name = "vehiculo")
@RequestScoped
public class Vehiculo {

	@Min(value=0)
	private int idVehiculo;
	@NotNull
	@NotEmpty
	@Size(max=5, message="QUE NO!")
	private String marca;
	@NotEmpty
	@Size(max=5)
	private String modelo;
	@Min(value=0)
	@Max(5000)
	private int potencia;
	//@Future
	@Past
	private Date fechaAlta;

	public Vehiculo() {
		super();
	}

	public Vehiculo(int idVehiculo, String marca, String modelo, int potencia,
			Date fechaAlta) {
		super();
		this.idVehiculo = idVehiculo;
		this.marca = marca;
		this.modelo = modelo;
		this.potencia = potencia;
		this.fechaAlta = fechaAlta;
	}

	public int getIdVehiculo() {
		return idVehiculo;
	}

	public void setIdVehiculo(int idVehiculo) {
		this.idVehiculo = idVehiculo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public Date getFechaAlta() {
		return fechaAlta;
	}

	public void setFechaAlta(Date fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	@Override
	public String toString() {
		return "Vehiculo [idVehiculo=" + idVehiculo + ", marca=" + marca
				+ ", modelo=" + modelo + ", potencia=" + potencia
				+ ", fechaAlta=" + fechaAlta + "]";
	}

}
