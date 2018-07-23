package br.com.cadastrocitroen.validation;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import br.com.cadastrocitroen.models.PessoaFisica;

public class PessoaFisicaValidation implements Validator{
	
	@Override
	public boolean supports(Class<?> clazz) {
		return PessoaFisica.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		PessoaFisica pf = (PessoaFisica) target;
		System.out.println("Entrando no metodo validates");
		ValidationUtils.rejectIfEmpty(errors, "nome", "field.required");
		ValidationUtils.rejectIfEmpty(errors, "sobrenome", "field.required.pf.nome");
		
	}

}
