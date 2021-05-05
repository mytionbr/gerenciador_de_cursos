package br.com.collections;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

import br.com.collections.model.Aula;
import br.com.collections.model.Curso;
import br.com.collections.model.Pessoa;

public class Testando {
	public static void main(String[] args) {
		Aula aula1 = new Aula(12.00,"Java 1");
		Aula aula2 = new Aula(10.00,"Php 1");
		
		Pessoa pessoa = new Pessoa("Joaquin",24);
		
		Curso curso = new Curso("Curso de programação", "insdicndicndi", pessoa);
		List<Aula> aulas =  new LinkedList<Aula>();
		aulas.addAll(Arrays.asList(aula1,aula2));
		aulas.sort(Comparator.comparing(Aula::getDuracao));
				
		curso.setAulas(aulas);
		
		curso.getAulas().forEach(aula ->{
			System.out.println(aula);
		});
		System.out.println(curso.tempoTotal());
		
	}
}
