package br.com.collections.model;

public class Aula implements Comparable<Aula>{
	
	private double duracao;
	private String nome;
	
	
	public Aula(double duracao, String nome) {
		this.duracao = duracao;
		this.nome = nome;
	}
	
	public double getDuracao() {
		return duracao;
	}
	public void setDuracao(double duracao) {
		this.duracao = duracao;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	

	@Override
	public String toString() {
		return "Aula [duracao=" + duracao + ", nome=" + nome + "]";
	}

	@Override
	public int compareTo(Aula aula) {
		return this.nome.compareTo(aula.getNome());
	}
	
	
}
