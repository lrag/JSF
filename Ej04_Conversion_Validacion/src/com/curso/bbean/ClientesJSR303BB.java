package com.curso.bbean;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.validation.Valid;

import com.curso.modelo.Cliente;
import com.curso.modelo.ClienteJSR303;
import com.curso.modelo.CuentaBancaria;

@ManagedBean(name = "clientesJSR303BB")
@RequestScoped
public class ClientesJSR303BB implements Serializable {

	private static final long serialVersionUID = 1L;

	@ManagedProperty(value = "#{listaClientesJSR303}")
	private List<ClienteJSR303> listaClientes;

	public void setListaClientes(List<ClienteJSR303> listaClientes) {
		this.listaClientes = listaClientes;
	}

	//@Valid 
	@ManagedProperty(value = "#{clienteJSR303}")
	private ClienteJSR303 cliente;

	public ClienteJSR303 getCliente() {
		return cliente;
	}
	
	public void setCliente(ClienteJSR303 cliente) {
		this.cliente = cliente;
	}

	public String insertarCliente() {
		System.out.println("============================JSR303");
		System.out.println("Insertando el cliente:" + cliente);
		listaClientes.add(cliente);
		System.out.println(listaClientes);
		return "listadoClientesJSR303";
	}
	
	//
	public String vaciarCliente(){
		System.out.println("============================VACIAR");
		cliente.setNombre("");
		cliente.setDireccion("");
		cliente.setTelefono(0);
		cliente.setCuentaBancaria(null);
		return null;
	}
	
	public String navegar() {
		System.out.println("============================NAVEGAR");
		return "listadoClientesJSR303";
	}

}




