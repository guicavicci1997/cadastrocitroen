package br.com.cadastrocitroen.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.cadastrocitroen.dao.PessoaFisicaDAO;
import br.com.cadastrocitroen.models.PessoaFisica;

@Controller
@RequestMapping("/pf")
public class PessoaFisicaController {
	
	@Autowired
	private PessoaFisicaDAO pfDAO;

	@RequestMapping("/form")
	public ModelAndView form() {
	ModelAndView modelAndView = new ModelAndView("pf/form");
	return modelAndView;
		
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public ModelAndView gravar(PessoaFisica pf, RedirectAttributes redirectAtrributes) {
		System.out.println(pf);
		
		if(pf.getNome() == null && pf.getNome().isEmpty())
		{
		return form();
		}
			
		redirectAtrributes.addFlashAttribute("sucesso", "Pessoa Cadastrada com sucesso!");
		return new ModelAndView("redirect:pf");
		
	}
	
	@RequestMapping(method=RequestMethod.GET)
	public ModelAndView listar() {
		
		List<PessoaFisica> pf = pfDAO.listar();
		ModelAndView modelAndView = new ModelAndView("pf/lista");
		modelAndView.addObject("pf", pf);
		return modelAndView;
	}
}
