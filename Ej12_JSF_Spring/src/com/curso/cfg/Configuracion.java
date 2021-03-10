package com.curso.cfg;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan( basePackages = "com.curso.modelo" )
public class Configuracion {

	public Configuracion() {
		super();
		System.out.println("Creando una instancia de Configuración");
	}
	
}
