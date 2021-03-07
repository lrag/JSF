package com.curso.controlador;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.model.SelectItem;

@ManagedBean(name = "ajaxBB")
@ViewScoped
public class AjaxBB implements Serializable {

	private static final long serialVersionUID = 1L;

	public String realizarTarea() {
		System.out.println("=============================");
		System.out.println("Realizando la tarea");
		return null;
	}

	// ///////////////////////////////////////////////////////

	private String dato;

	public String getDato() {
		return dato;
	}

	public void setDato(String dato) {
		this.dato = dato;
	}

	public String modificarTexto() {
		dato = "Te digo trigo por no llamarte Rodrigo";
		return null;
	}

	// ///////////////////////////////////////////////////////

	private List<String> listaPalabras = new ArrayList<String>();

	public List<String> getListaPalabras() {
		return listaPalabras;
	}

	private String palabra;

	public String getPalabra() {
		return palabra;
	}

	public void setPalabra(String palabra) {
		this.palabra = palabra;
	}

	public String addPalabra() {
		listaPalabras.add(palabra);
		return null;
	}

	/////////////////////////////////////////////////////////

	private String comunidad;
	private String provincia;

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

	public List<SelectItem> getListaComunidadesSI() {
		List<SelectItem> comunidades = new ArrayList<SelectItem>();
		comunidades.add(new SelectItem("", "Seleccione..."));
		comunidades.add(new SelectItem("Madrid"));
		comunidades.add(new SelectItem("Valencia"));
		comunidades.add(new SelectItem("Castilla y León"));
		return comunidades;
	}

	public List<SelectItem> getListaProvinciasSI() {
		List<SelectItem> provincias = new ArrayList<SelectItem>();
		provincias.add(new SelectItem("", "Seleccione..."));

		if ("Madrid".equals(comunidad)) {
			provincias.add(new SelectItem("Madrid"));
		} else if ("Valencia".equals(comunidad)) {
			provincias.add(new SelectItem("Alicante"));
			provincias.add(new SelectItem("Valencia"));
			provincias.add(new SelectItem("Castellón"));
		} else if ("Castilla y León".equals(comunidad)) {
			provincias.add(new SelectItem("Ávila"));
			provincias.add(new SelectItem("Salamanca"));
			provincias.add(new SelectItem("Zamora"));
			provincias.add(new SelectItem("León"));
			provincias.add(new SelectItem("Burgos"));
			provincias.add(new SelectItem("Palencia"));
			provincias.add(new SelectItem("Soria"));
			provincias.add(new SelectItem("Segovia"));
			provincias.add(new SelectItem("Valladolid"));
		}
		return provincias;
	}

	/////////////////////////////////////////////////////////
	private int kilometros;

	public int getKilometros() {
		return kilometros;
	}

	public void setKilometros(int kilometros) {
		this.kilometros = kilometros;
	}
	
	public double getMillasNauticas(){
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("GET MILLAS!");
		return kilometros/1.852;
	}

}
