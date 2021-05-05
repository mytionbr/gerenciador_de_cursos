package br.com.collections.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Curso implements Comparable<Curso>{

	
	private String nome;
	private String descricao;
	private Pessoa instrutor;
	private List<Aula> aulas = new ArrayList<Aula>();
	private int duração;
	private Map<String, Aula> mapaDeAulas = new HashMap<>();
	
	
	
	public Curso(String nome, String descricao, Pessoa instrutor) {
		this.nome = nome;
		this.descricao = descricao;
		this.instrutor = instrutor;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Pessoa getInstrutor() {
		return instrutor;
	}
	public void setInstrutor(Pessoa instrutor) {
		this.instrutor = instrutor;
	}
	public List<Aula> getAulas() {
		return Collections.unmodifiableList(aulas);
	}
	public void setAulas(List<Aula> aulas) {
		this.aulas = aulas;
		aulas.forEach(aula ->{
			this.mapaDeAulas.put(aula.getNome(), aula);
		});
	}
	public void adicionaAula(Aula aula) {
		this.aulas.add(aula);
		this.mapaDeAulas.put(aula.getNome(), aula);
	}
	public Aula buscaAula(String nome) {
		return this.mapaDeAulas.get(nome);
	}
	public Double tempoTotal() {
		return this.aulas.stream().mapToDouble(Aula::getDuracao).sum();
	}
	
	public boolean estaFeita(Aula aula) {
		return this.aulas.contains(aula);
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((aulas == null) ? 0 : aulas.hashCode());
		result = prime * result + ((descricao == null) ? 0 : descricao.hashCode());
		result = prime * result + duração;
		result = prime * result + ((instrutor == null) ? 0 : instrutor.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Curso other = (Curso) obj;
		if (aulas == null) {
			if (other.aulas != null)
				return false;
		} else if (!aulas.equals(other.aulas))
			return false;
		if (descricao == null) {
			if (other.descricao != null)
				return false;
		} else if (!descricao.equals(other.descricao))
			return false;
		if (duração != other.duração)
			return false;
		if (instrutor == null) {
			if (other.instrutor != null)
				return false;
		} else if (!instrutor.equals(other.instrutor))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Curso [nome=" + nome + ", descricao=" + descricao + ", instrutor=" + instrutor + ", aulas=" + aulas
				+ "]";
	}
	@Override
	public int compareTo(Curso curso) {
		return this.nome.compareTo(curso.getNome());
	}
	
	
	
}
