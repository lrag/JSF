package com.curso.bbean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

import com.curso.modelo.Cliente;


//Clases de acceso público
//Constructor por defecto de acceso público
//Serializable

//Si no se indica el nombre de la bean se utiliza el nombre de la clase en camelCase
@ManagedBean(name = "clientesBB_Bis")
//Por defecto el ámbito es request
@RequestScoped
public class ClientesBB_Bis implements Serializable {

	private static final long serialVersionUID = 1L;

	//@ManagedProperty(value = "#{cliente}")
	private Cliente cliente = new Cliente();

	@ManagedProperty(value = "#{listaClientes}")
	private List<Cliente> listaClientes;
	
	public ClientesBB_Bis() {
		super();
		System.out.println("Instanciando ClientesBB");
	}

	public void setListaClientes(List<Cliente> listaClientes) {
		this.listaClientes = listaClientes;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public Cliente getCliente() {
		return cliente;
	}

	public String insertarCliente() {
		System.out.println("============================");
		System.out.println("Insertando el cliente:" + cliente.getNombre());
		listaClientes.add(cliente);
		System.out.println(listaClientes);
		//POST-REDIRECT-GET
		return "pagina_Bis.xhtml?faces-redirect=true";
	}

}




