package com.curso.modelo;

import java.io.Serializable;

public class CuentaBancaria implements Serializable {

	private static final long serialVersionUID = 1L;
	private String banco;
	private String sucursal;
	private String dc;
	private String cuenta;

	public CuentaBancaria() {
		super();
	}

	public CuentaBancaria(String banco, String sucursal, String dc,
			String cuenta) {
		super();
		this.banco = banco;
		this.sucursal = sucursal;
		this.dc = dc;
		this.cuenta = cuenta;
	}

	public String getBanco() {
		return banco;
	}

	public void setBanco(String banco) {
		this.banco = banco;
	}

	public String getSucursal() {
		return sucursal;
	}

	public void setSucursal(String sucursal) {
		this.sucursal = sucursal;
	}

	public String getDc() {
		return dc;
	}

	public void setDc(String dc) {
		this.dc = dc;
	}

	public String getCuenta() {
		return cuenta;
	}

	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	public String toString(){
		return banco+sucursal+dc+cuenta;
	}
	
}
