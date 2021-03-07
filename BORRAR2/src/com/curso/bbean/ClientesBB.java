package com.curso.bbean;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.component.UIViewRoot;
import javax.faces.component.html.HtmlInputText;
import javax.faces.context.FacesContext;
import javax.validation.ConstraintViolation;
import javax.validation.Valid;
import javax.validation.Validation;

import com.curso.modelo.Cliente;

@ManagedBean(name = "clientesBB")
@RequestScoped
public class ClientesBB implements Serializable {

	private static final long serialVersionUID = 1L;

	private HtmlInputText cajaNombre;
	
	
	public HtmlInputText getCajaNombre() {
		return cajaNombre;
	}

	public void setCajaNombre(HtmlInputText cajaNombre) {
		this.cajaNombre = cajaNombre;
	}

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

	public String vaciar(){
		FacesContext fCtx = FacesContext.getCurrentInstance();
		UIViewRoot raiz = fCtx.getViewRoot();
		HtmlInputText caja = (HtmlInputText) raiz.findComponent("formuario:nombre");
		cajaNombre.setValue("AAAA");
		return null;
	}
	
	public String insertarCliente() {
		System.out.println("============================");
		cajaNombre.setValue("AAAA");

		System.out.println("Insertando el cliente:" + cliente.getNombre());
		listaClientes.add(cliente);
		System.out.println(listaClientes.size());
		
		Set<ConstraintViolation<Cliente>> constraintViolations = Validation.buildDefaultValidatorFactory().getValidator().validate(cliente);  
		for(ConstraintViolation<Cliente> constraintViolation : constraintViolations){   
			System.out.println(constraintViolation.getPropertyPath());   
			System.out.println(constraintViolation.getMessage()); 
		}		
		
		
		return null;
	}
}
