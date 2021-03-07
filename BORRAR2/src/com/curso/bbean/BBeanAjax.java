package com.curso.bbean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.model.SelectItem;

@ManagedBean(name = "bbeanAjax")
@ViewScoped
public class BBeanAjax implements Serializable{

	private static final long serialVersionUID = 1L;

	private List<String> palabras = new ArrayList<String>();

	private String dato;
	private String palabra;

	public String getDato() {
		return dato;
	}

	public void setDato(String dato) {
		this.dato = dato;
	}

	public String getPalabra() {
		return palabra;
	}

	public void setPalabra(String palabra) {
		this.palabra = palabra;
	}

	public List<String> getPalabras() {
		return palabras;
	}

	public String actualizarPanel() {
		dato = "Jake & Finn";
		return null;
	}

	public String addPalabra() {
		palabras.add(palabra);
		System.out.println(palabras);
		return null;
	}
	
	////////////////////////////////////////////////////////////////
	
	public String comunidad = "";
	public String provincia;

	public String getComunidad() {
		return comunidad;
	}

	public void setComunidad(String comunidad) {
		this.comunidad = comunidad;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	
	public List<SelectItem> getComunidades(){
		List<SelectItem> comunidades = new ArrayList<SelectItem>();
		comunidades.add(new SelectItem("Seleccione"));
		comunidades.add(new SelectItem("Madrid"));
		comunidades.add(new SelectItem("Valencia"));
		comunidades.add(new SelectItem("Castilla y León"));
		return comunidades;
	}
	
	public List<SelectItem> getProvincias(){
		List<SelectItem> provincias = new ArrayList<SelectItem>();
		provincias.add(new SelectItem("Seleccione"));

		if(comunidad.equals("Madrid")){
			provincias.add(new SelectItem("Madrid"));
		} else if(comunidad.equals("Valencia")){
			provincias.add(new SelectItem("Alicante"));
			provincias.add(new SelectItem("Valencia"));
			provincias.add(new SelectItem("Castellón"));
		} else if(comunidad.equals("Castilla y León")){
			provincias.add(new SelectItem("Ávila"));
			provincias.add(new SelectItem("Salamanca"));
			provincias.add(new SelectItem("Zamora"));
			provincias.add(new SelectItem("León"));
			provincias.add(new SelectItem("Palencia"));
			provincias.add(new SelectItem("Burgos"));
			provincias.add(new SelectItem("Soria"));
			provincias.add(new SelectItem("Segovia"));
			provincias.add(new SelectItem("Valladolid"));
		} 
		return provincias;
	}
	
	////////////////////////////////////////////////////////////////

	private double kilometros;

	public double getKilometros() {
		return kilometros;
	}

	public void setKilometros(double kilometros) {
		this.kilometros = kilometros;
	}
	
	public double getMillasNauticas(){
		return kilometros/1.852;
	}
	
}



