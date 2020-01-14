package com.marcos.IoC.servicio;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
@Scope("prototype")
public class ComponenteNombres {

	
	private int numeroNombres = 20;
	
	
	
	
	
	
	public String[] getNombres() {
		
		String[] nombres = {"Paco","Juan","Maria"};
		
		return nombres;
	}
}
