package com.marcos.IoC.servicio;

import org.springframework.stereotype.Service;

@Service
public class ComponenteNombres {

	
	private int numeroNombres = 20;
	
	
	
	
	
	
	public String[] getNombres() {
		
		String[] nombres = {"Paco","Juan","Maria"};
		
		return nombres;
	}
}
