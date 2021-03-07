package com.curso.controlador;

import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.context.FacesContext;

import com.curso.modelo.Disco;
import com.curso.modelo.Grupo;
import com.curso.negocio.GestorDiscos;

@ManagedBean(name="discosBB")
public class DiscosBB {

	@EJB
	private GestorDiscos gd;

	
	@ManagedProperty(value="#{disco}")
	private Disco disco;

	public void setDisco(Disco disco) {
		this.disco = disco;
	}
	
	public List<Disco> getListaDiscos(){
		System.out.println("DiscosBB...");
		return gd.listarTodos();
	}
	
	public String insertarDisco(){

		if(Validador.validar(disco, FacesContext.getCurrentInstance(), "formulario"))
			gd.insertarDisco(disco);	
		return null;
	}
	
	public String modificarDisco(){
		if(Validador.validar(disco, FacesContext.getCurrentInstance(), "formulario"))
			gd.modificarDisco(disco);
		return null;
	}
	
	public String borrarDisco(){
		if(Validador.validar(disco, FacesContext.getCurrentInstance(), "formulario"))
			gd.borrarDisco(disco);
		return null;
	}
	
	public String seleccionarDisco(int idDisco){
		Disco dAux = gd.buscarDisco(idDisco);
		disco.setIdDisco(dAux.getIdDisco());
		disco.setTitulo(dAux.getTitulo());
		disco.setGrupo(dAux.getGrupo());
		disco.setFecha(dAux.getFecha());
		return null;
	}
	
	public String vaciar(){
		disco.setIdDisco(0);
		disco.setTitulo("");
		disco.setGrupo(new Grupo());
		disco.setFecha(null);
		return null;
	}
	
}
