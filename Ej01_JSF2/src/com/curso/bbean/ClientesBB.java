package com.curso.bbean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

import com.curso.modelo.Cliente;


//Clases de acceso p?blico
//Constructor por defecto de acceso p?blico
//Serializable

//Si no se indica el nombre de la bean se utiliza el nombre de la clase en camelCase
@ManagedBean(name = "clientesBB")
//Por defecto el ?mbito es request
@RequestScoped
public class ClientesBB implements Serializable {

	private static final long serialVersionUID = 1L;

	@ManagedProperty(value = "#{cliente}")
	private Cliente cliente;

	@ManagedProperty(value = "#{listaClientes}")
	private List<Cliente> listaClientes;
	
	public ClientesBB() {
		super();
		System.out.println("Instanciando ClientesBB");
		//Aqui dentro cliente y listaClientes son nulos
	}

	@PostConstruct
	public void inicializar() {
		System.out.println("PostConstruct!");
		//Aqui dentro cliente y listaClientes ya no son nulos
	}

	@PreDestroy
	public void finalizar() {
		System.out.println("PreDestroy!");
		//Liberar cualquier recurso (raro de ver)
	}
		
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
		//POST-REDIRECT-GET
		return "pagina.xhtml?faces-redirect=true";
	}

}




