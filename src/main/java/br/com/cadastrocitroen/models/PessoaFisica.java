package br.com.cadastrocitroen.models;

import java.util.Date;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PessoaFisica {
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private String nome;
	private String sobrenome;
	private Date dataNascimento;
	private long rendaMensal;
	
	@ElementCollection
	private List<ModelosVeiculos> modelosVeiculos;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public long getRendaMensal() {
		return rendaMensal;
	}
	public void setRendaMensal(long rendaMensal) {
		this.rendaMensal = rendaMensal;
	}
	@Override
	public String toString() {
		return "PessoaFisica [nome=" + nome + ", sobrenome=" + sobrenome + ", dataNascimento=" + dataNascimento
				+ ", rendaMensal=" + rendaMensal + "]";
	}

}
