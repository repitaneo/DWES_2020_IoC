package com.marcos.IoC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.marcos.IoC.servicio.ComponenteNombres;

@Controller
public class MasRutas {
	
	@Autowired
	ComponenteNombres componenteNombres;
		
	
	@GetMapping("/singleton2")
	@ResponseBody
	public String rutaSingleton() {
	
		
		return componenteNombres.toString();
	}	
	
}
