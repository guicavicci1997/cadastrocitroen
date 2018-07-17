package br.com.cadastrocitroen.models;

import java.util.Date;

public class Produto {
	
	private String nome;
	private String sobrenome;
	private Date dataNascimento;
	private long rendaMensal;
	
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
		return "Produto [nome=" + nome + ", sobrenome=" + sobrenome + ", dataNascimento=" + dataNascimento
				+ ", rendaMensal=" + rendaMensal + "]";
	}

}
