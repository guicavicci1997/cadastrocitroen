package br.com.cadastrocitroen.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.cadastrocitroen.models.Produto;

@Controller
public class PessoaFisicaController {

	@RequestMapping
	public String form() {
		
		return "pf/form";
		
	}
	
	@RequestMapping("/pf")
	public String gravar(Produto produto) {
		System.out.println(produto);
			
		return "ok";
		
	}
}
