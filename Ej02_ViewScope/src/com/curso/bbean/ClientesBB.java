package com.curso.bbean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

import com.curso.modelo.Cliente;

@ManagedBean(name = "clientesBB")
@RequestScoped
public class ClientesBB implements Serializable {

	private static final long serialVersionUID = 1L;

	//Se inyecta desde 'View scope'
	@ManagedProperty(value = "#{listaClientes}")
	private List<Cliente> listaClientes;

	//Se inyecta desde 'request scope'
	@ManagedProperty(value = "#{cliente}")
	private Cliente cliente;

	public void setListaClientes(List<Cliente> listaClientes) {
		this.listaClientes = listaClientes;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public String insertarCliente() {
		System.out.println("============================");
		System.out.println("Insertando el cliente:" + cliente.getNombre());
		listaClientes.add(cliente);
		System.out.println(listaClientes);
		//return "formulario.xhtml";
		return null;
	}

}
