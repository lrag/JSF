package com.curso.bbean;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

import com.curso.modelo.Cliente;
import com.curso.modelo.CuentaBancaria;

@ManagedBean(name = "clientesBB")
@RequestScoped
public class ClientesBB implements Serializable {

	private static final long serialVersionUID = 1L;

	@ManagedProperty(value = "#{listaClientes}")
	private List<Cliente> listaClientes;

	public void setListaClientes(List<Cliente> listaClientes) {
		this.listaClientes = listaClientes;
	}

	@ManagedProperty(value = "#{cliente}")
	private Cliente cliente;

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public String insertarCliente() {
		System.out.println("============================");
		System.out.println("Insertando el cliente:" + cliente.getNombre());
		listaClientes.add(cliente);
		System.out.println(listaClientes);
		return "listadoClientes";
	}
	
	//
	public String vaciarCliente(){
		cliente.setNombre("");
		cliente.setDireccion("");
		cliente.setTelefono(0);
		cliente.setCuentaBancaria(null);
		return null;
	}

}




