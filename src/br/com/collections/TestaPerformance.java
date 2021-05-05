package br.com.collections;

import java.util.ArrayList;
import java.util.Collection;

public class TestaPerformance {
	public static void main(String[] args) {
		
		Collection<Integer> numeros = new ArrayList<Integer>();
		
		long inicio = System.currentTimeMillis();
		
		for (int i = 0; i<10000;i++) {
			numeros.add(i);
		}
		
		for (Integer n : numeros) {
			numeros.contains(n);
			System.out.println(n);
		}
		long fim = System.currentTimeMillis();
		
		long tempo = fim - inicio;
		
		System.out.println(tempo);
		
	}
}
