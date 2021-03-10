package com.curso.bbean;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.component.UIViewRoot;
import javax.faces.component.html.HtmlCommandButton;
import javax.faces.component.html.HtmlPanelGroup;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

import com.curso.modelo.Cliente;

@ManagedBean(name = "clientesBB")
@RequestScoped
public class ClientesBB implements Serializable {

	private static final long serialVersionUID = 1L;

	// Component binding
	private HtmlPanelGroup panel;

	@ManagedProperty(value = "#{listaClientes}")
	private List<Cliente> listaClientes;

	@ManagedProperty(value = "#{cliente}")
	private Cliente cliente;

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public HtmlPanelGroup getPanel() {
		return panel;
	}

	public void setPanel(HtmlPanelGroup panel) {
		this.panel = panel;
	}

	public void setListaClientes(List<Cliente> listaClientes) {
		this.listaClientes = listaClientes;
	}

	public String insertarCliente() {
		System.out.println("============================");
		System.out.println("Insertando el cliente:" + cliente.getNombre());
		listaClientes.add(cliente);
		System.out.println(listaClientes);
		return "listadoClientes";
	}

	//
	public String vaciarCliente() {		
		
		System.out.println("VACIAR");
		
		cliente.setNombre("");
		cliente.setDireccion("");
		cliente.setTelefono(0);
		cliente.setCuentaBancaria(null);
		return null;
	}

	public void ocultarMostrarPanel(ActionEvent e) {
		// En el evento viene el componente que lo ha lanzado
		HtmlCommandButton boton = (HtmlCommandButton) e.getComponent();
		if(boton.getValue().equals("Ocultar")) {
			boton.setValue("Mostrar");
		} else {
			boton.setValue("Ocultar");
		}
		
		//Método gran fajador
		FacesContext fCtx = FacesContext.getCurrentInstance();
		UIViewRoot raiz = fCtx.getViewRoot(); //Pedimos la raíz del arbol
		//Si un componentente con id está dentro de un contenedor que tambien lo tiene 
		//el hijo recibe el id del padre con el formato 'idpadre:idhijo'
		//HtmlPanelGroup panel = (HtmlPanelGroup)	raiz.findComponent("formulario:panel");
		//panel.setRendered(!panel.isRendered());
				
		// Fino estilista
		panel.setRendered(!panel.isRendered());	
	
		
	}


}
