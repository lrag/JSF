package com.curso.modelo.negocio;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.modelo.entidad.Cliente;

@Service
public class GestorClientes {

	//@Autowired
	//private ClienteDao clienteDao;
		
	public List<Cliente> clientes = new ArrayList<>();
	
	public GestorClientes() {
		super();
		System.out.println("Instanciando GestorClientes");
	}

	public void insertarCliente(Cliente cliente) {
		cliente.setIdCliente( (int) Math.round(Math.random()*10_000) );
		clientes.add(cliente);		
	}
	
	public Cliente buscar(int idCliente) {
		for(Cliente cAux: clientes) {
			if(cAux.getIdCliente()==idCliente) {
				return cAux;
			}
		}
		return null;
	}

	public List<Cliente> listar() {
		return clientes;
	}
	
}
