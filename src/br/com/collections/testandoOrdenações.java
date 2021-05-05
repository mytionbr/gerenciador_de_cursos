package br.com.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class testandoOrdenações {
	
	public static void main(String[] args) {
		ArrayList<String> letters = new ArrayList<String>();
		letters.addAll(Arrays.asList("N","A","C","B"));
		
		Collections.sort(letters);
		
		System.out.println(letters);
		          
	}
}
