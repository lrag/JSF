package com.curso.bbean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;

import com.curso.modelo.Cliente;

@ManagedBean(name = "clientesBB")
@RequestScoped
public class ClientesBB implements Serializable {

	private static final long serialVersionUID = 1L;

	@ManagedProperty(value = "#{listaClientes}")
	private List<Cliente> listaClientes;

	@ManagedProperty(value = "#{cliente}")
	private Cliente cliente;
	
	public ClientesBB() {
		super();
	}

	public void setListaClientes(List<Cliente> listaClientes) {
		this.listaClientes = listaClientes;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public String seleccionarCliente(int idCliente) {		
		System.out.println("============================");
		System.out.println("Seleccionando el cliente:"+idCliente);
		
		//Esto tendría que estár en la lógica de negocio!
		for(Cliente cAux: listaClientes) {
			if(cAux.getIdCliente()==idCliente) {
				System.out.println(cAux);
				//Esto solo si hicieramos aqui el new del cliente y no fuera una managed property
				//cliente = cAux;
				
				//Eso si clietne es una managed property
				//cliente.setIdCliente(cAux.getIdCliente());
				//cliente.setNombre(cAux.getNombre());
				//cliente.setDireccion(cAux.getDireccion());
				//cliente.setTelefono(cAux.getTelefono());
				
				//Esto si cliente es una managed property y queremos sustituirla por la nuestra
				System.out.println("HABER KE PASA:");
				HttpServletRequest rq = (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest();
				rq.setAttribute("cliente", cAux);	
				cliente = cAux;
				
				break;
			}
		}		
		
		return "verFormulario";
	}
	
	public String insertarCliente() {		
		System.out.println("============================");
		System.out.println("Insertando el cliente:" + cliente.getNombre());
		listaClientes.add(cliente);
		System.out.println(listaClientes);
		//
		//return "listadoClientes?faces-redirect=true";
		//		
		return "verListado";
	}
	
	public String vaciarFormulario() {
		
		cliente.setIdCliente(0);
		cliente.setNombre(null);
		cliente.setDireccion(null);
		cliente.setTelefono(0);		
		
		return null;
	}

}
