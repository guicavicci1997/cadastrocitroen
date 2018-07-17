package br.com.cadastrocitroen.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.cadastrocitroen.dao.PessoaFisicaDAO;
import br.com.cadastrocitroen.models.PessoaFisica;

@Controller
public class PessoaFisicaController {
	
	@Autowired
	private PessoaFisicaDAO pfDAO;

	@RequestMapping("/pf/form")
	public String form() {
		
		return "pf/form";
		
	}
	
	@RequestMapping("/pf")
	public String gravar(PessoaFisica pf) {
		System.out.println(pf);
		pfDAO.gravar(pf);
			
		return "/pf/ok";
		
	}
}
