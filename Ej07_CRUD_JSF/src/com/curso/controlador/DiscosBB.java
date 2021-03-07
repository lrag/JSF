package com.curso.controlador;

import java.util.List;

import javax.ejb.EJB;
import javax.faces.application.ViewHandler;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.component.UIViewRoot;
import javax.faces.context.FacesContext;

import com.curso.modelo.Disco;
import com.curso.negocio.GestorDiscosLocal;

@ManagedBean(name="discosBB")
public class DiscosBB {

	@EJB
	private GestorDiscosLocal gd;

	
	@ManagedProperty(value="#{disco}")
	private Disco disco;

	public void setDisco(Disco disco) {
		this.disco = disco;
	}
	
	public List<Disco> getListaDiscos(){
		return gd.listarTodos();
	}
	
	public String insertarDisco(){
		gd.insertarDisco(disco);	
		return null;
	}
	
	public String modificarDisco(){
		gd.modificarDisco(disco);
		return null;
	}
	
	public String borrarDisco(){
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
		//Oh dios mio
		FacesContext fCtx = FacesContext.getCurrentInstance();
		UIViewRoot arbol = fCtx.getViewRoot();
		String id = arbol.getViewId();
		ViewHandler vh = fCtx.getApplication().getViewHandler();
		UIViewRoot nuevoArbol = vh.createView(fCtx, id);
		fCtx.setViewRoot(nuevoArbol);
		//Oh dios mio!
				
		return null;
	}
	
}
