package br.com.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import br.com.collections.model.Aula;
import br.com.collections.model.Curso;
import br.com.collections.model.Pessoa;

public class TestandoMap {
	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa("Joaquin", 50);
		Curso curso = new Curso("Java", "ifnadijfndsiun", pessoa);
		
		Aula aula1 = new Aula(7.00, "Aula 1: aprendendo orientação a objetos");
		Aula aula2 = new Aula(7.00, "Aula 2: aprendendo a biblioteca das Collections");
		Aula aula3 = new Aula(7.00, "Aula 3: aprendendo a biblioteca das Collections");
		Aula aula4 = new Aula(17.00, "Aula 4: aprendendo a biblioteca das Collections");
		Aula aula5 = new Aula(7.00, "Aula 5: aprendendo a biblioteca das Collections");
		Aula aula6 = new Aula(7.00, "Aula 6: aprendendo a biblioteca das Collections");
		Aula aula7 = new Aula(7.00, "Aula 7: aprendendo a biblioteca das Collections");
		
		List<Aula> aulas = new ArrayList<Aula>();
		aulas.addAll(Arrays.asList(aula1,aula2,aula3,aula4,aula5,aula6,aula7));
		
		curso.setAulas(aulas);
		
		System.out.println(curso.buscaAula("Aula 4: aprendendo a biblioteca das Collections").getDuracao());
		
	}
}
