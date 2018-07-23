package br.com.cadastrocitroen.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.cadastrocitroen.dao.PessoaFisicaDAO;
import br.com.cadastrocitroen.models.PessoaFisica;
import br.com.cadastrocitroen.validation.PessoaFisicaValidation;

@Controller
@RequestMapping("/pf")
public class PessoaFisicaController {
	
	@Autowired
	private PessoaFisicaDAO pfDAO;
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		
		binder.addValidators(new PessoaFisicaValidation());
		
	}

	@RequestMapping("/form")
	public ModelAndView form() {
	ModelAndView modelAndView = new ModelAndView("pf/form");
	return modelAndView;
		
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public ModelAndView gravar(@Valid PessoaFisica pf, BindingResult result, RedirectAttributes redirectAtrributes) {
		if(result.hasErrors()) {
			return form();
		}
		System.out.println(pf);
		
		pfDAO.gravar(pf);
		redirectAtrributes.addFlashAttribute("message", "Pessoa Cadastrada com sucesso!");
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
