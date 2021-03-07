package com.curso.controlador;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.context.FacesContext;

import com.curso.modelo.Vehiculo;

@ManagedBean(name="vehiculosBB")
public class VehiculosBB {

	@ManagedProperty(value="#{vehiculo}")
	private Vehiculo vehiculo;

	public Vehiculo getVehiculo() {
		return vehiculo;
	}

	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}

	public String vaciar(){
		vehiculo.setMarca("");
		vehiculo.setModelo("");
		vehiculo.setPotencia(0);
		return null;
	}
	
	public String insertar(){
		
		if(Validador.validar(vehiculo, FacesContext.getCurrentInstance(), "formulario")){
			System.out.println("/-------------------\\");
			System.out.println("| OK!               |");
			System.out.println("\\-------------------/");
		}
		
		return null;
	}
	
}
