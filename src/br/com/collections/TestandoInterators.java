package br.com.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestandoInterators {
	public static void main(String[] args) {
		Set<String> nomes = new HashSet<>();
		nomes.add("a");
		nomes.add("b");
		nomes.add("c");
		
		Iterator<String> iterator = nomes.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
