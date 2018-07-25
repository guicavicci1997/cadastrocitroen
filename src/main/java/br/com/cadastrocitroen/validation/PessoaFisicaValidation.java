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
		System.out.println("Entrando no metodo validates");
		ValidationUtils.rejectIfEmpty(errors, "nome", "field.required.pessoaFisica.nome");
		ValidationUtils.rejectIfEmpty(errors, "sobrenome", "field.required.pessoaFisica.sobrenome");
		
	}

}
