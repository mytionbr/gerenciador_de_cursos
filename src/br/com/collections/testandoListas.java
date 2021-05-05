package br.com.collections;

import java.util.ArrayList;

public class testandoListas {
	public static void main(String[] args) {
		
		String curso1 = "Java 8";
		String curso2 = "PHP 5";
		String curso3 = "HTML5";
		
		ArrayList<String> cursos = new ArrayList<>();
		cursos.add(curso1);
		cursos.add(curso2);
		cursos.add(curso3);
		
		cursos.forEach(curso ->{
			System.out.println(curso);
		});
		
		
		for(String curso : cursos) {
			System.out.println(curso);
		}
		System.out.println(cursos);
		
		for(int i = 0; cursos.size() > i ; i++) {
			System.out.println(cursos.get(i));
		}
	}
}
