package br.com.cadastrocitroen.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.cadastrocitroen.models.PessoaFisica;

@Repository
@Transactional
public class PessoaFisicaDAO {
	
	@PersistenceContext
	private EntityManager manager;
	
	public void gravar(PessoaFisica pf) {
		manager.persist(pf);
		
	}

	public List<PessoaFisica> listar() {
		return manager.createQuery("select pf from PessoaFisica pf", PessoaFisica.class).getResultList();
				
		
	}

}