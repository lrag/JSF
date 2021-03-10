package com.curso.bbean;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;

import com.curso.modelo.entidad.Cliente;
import com.curso.modelo.negocio.GestorClientes;

@ManagedBean(name = "clientesBB")
@RequestScoped
public class ClientesBB implements Serializable {

	private static final long serialVersionUID = 1L;

	@ManagedProperty(value = "#{gestorClientes}")
	private GestorClientes gestorClientes;

	@ManagedProperty(value = "#{cliente}")
	private Cliente cliente;

	public ClientesBB() {
		super();
	}

	public GestorClientes getGestorClientes() {
		return gestorClientes;
	}

	public void setGestorClientes(GestorClientes gestorClientes) {
		this.gestorClientes = gestorClientes;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<Cliente> getListaClientes() {
		return gestorClientes.listar();
	}

	public String seleccionarCliente(int idCliente) {
		System.out.println("============================");
		System.out.println("Seleccionando el cliente:" + idCliente);

		Cliente c = gestorClientes.buscar(idCliente);
		// Esto si cliente es una managed property y queremos sustituirla por la nuestra
		System.out.println("HABER KE PASA:");
		HttpServletRequest rq = (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext()
				.getRequest();
		rq.setAttribute("cliente", c);
		cliente = c;

		return "verFormulario";
	}

	public String insertarCliente() {
		System.out.println("============================");
		System.out.println("Insertando el cliente:" + cliente.getNombre());
		gestorClientes.insertarCliente(cliente);
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
