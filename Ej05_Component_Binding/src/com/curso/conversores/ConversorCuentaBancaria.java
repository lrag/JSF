package com.curso.conversores;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;
import javax.faces.convert.FacesConverter;

import com.curso.modelo.CuentaBancaria;

//Si usamos forClass el conversor se aplica automáticamente a aquellos campos
//que esten 'mapeados' contra un objeto del tipo indicado
//@FacesConverter(forClass=com.curso.modelo.CuentaBancaria.class)
//Si usamos value le asignamos al conversor un id que luego deberemos usar en el
//campo
@FacesConverter(value="conversorCuentaBancaria")
public class ConversorCuentaBancaria implements Converter {

	@Override
	public Object getAsObject(FacesContext fCtx, UIComponent componente, String valor)
			throws ConverterException {
		
		if(valor.length()!=20)
			throw new ConverterException(new FacesMessage("20 dígitos, por favor"));
		
		String banco = valor.substring(0, 4);
		String sucursal = valor.substring(4,8);
		String dc = valor.substring(8,10);
		String cuenta = valor.substring(10);
		
		CuentaBancaria cb = new CuentaBancaria(banco,sucursal,dc,cuenta);
		
		return cb;
	}

	@Override
	public String getAsString(FacesContext fCtx, UIComponent componente, Object cuentaBancaria)
			throws ConverterException {
		String txt = "";
		if(cuentaBancaria!=null)
			txt = cuentaBancaria.toString();
		return txt;
	}

}
