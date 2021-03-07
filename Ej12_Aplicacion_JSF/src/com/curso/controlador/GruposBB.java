package com.curso.controlador;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.model.SelectItem;

import com.curso.modelo.Grupo;
import com.curso.negocio.GestorGrupos;

@ManagedBean(name="gruposBB")
public class GruposBB {

	@EJB
	private GestorGrupos gg;
	
	public List<Grupo> getListaGrupos(){
		return gg.listarTodos();
	}
	
	public List<SelectItem> getListaGruposSI(){
		List<Grupo> lista = gg.listarTodos();
		List<SelectItem> listaSI = new ArrayList<SelectItem>();
		listaSI.add(new SelectItem("","Seleccione"));
		for(Grupo g: lista){
			SelectItem si = new SelectItem(g.getIdGrupo(), g.getNombre());
			listaSI.add(si);
		}
		return listaSI;
	}
	
}
