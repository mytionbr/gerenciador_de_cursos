package br.com.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

import br.com.collections.model.Pessoa;

public class TestaPessoaComparable {
	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa("wlfredo", 23);
		Pessoa pessoa2 = new Pessoa("zreno", 19);
		
		ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
		pessoas.addAll(Arrays.asList(pessoa1,pessoa2));
		pessoas.sort(Comparator.comparing(Pessoa::getIdade));
		//Collections.sort(pessoas,Comparator.comparing(Pessoa::getIdade));
		
		
		
		System.out.println(pessoas);
	}
}
