package br.com.cadastrocitroen.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import br.com.cadastrocitroen.controller.HomeController;
import br.com.cadastrocitroen.dao.PessoaFisicaDAO;

@EnableWebMvc
@ComponentScan (basePackageClasses = {HomeController.class, PessoaFisicaDAO.class})
public class AppWebConfiguration {

	@Bean
	public InternalResourceViewResolver InternalResourceViewResolver() {
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/views/");
		resolver.setSuffix(".jsp");
		return resolver;
		
	}
}
