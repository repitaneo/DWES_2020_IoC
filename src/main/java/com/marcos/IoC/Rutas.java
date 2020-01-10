package com.marcos.IoC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.marcos.IoC.beans.Autor.AutorBean;

@Controller
public class Rutas {

	
	@Autowired
	AutorBean juan;
	
	@Autowired
	AutorBean maria;
	
	@Autowired
	@Qualifier("juan")
	AutorBean pedro;	
	
	
	@GetMapping("/")
	@ResponseBody
	public String rutaInicial() {
	
		pedro.setEdad(99);
		
		return juan+"<br>"+maria+"<br>"+pedro;
	}
}
