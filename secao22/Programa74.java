package br.com.exemplo.secao22;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class Programa74 {

	public static void main(String[] args) {
		
        List<String> palavras = new ArrayList<String>();
		
		palavras.add("Geek");
		palavras.add("University");
		palavras.add("Java");
		palavras.add("Angelina");
		palavras.add("Playstation 4");
		palavras.add("OutLast 2");
		
		/*Function<String, Integer> tamanho = new Function<String, Integer>(){

			@Override
			public Integer apply(String s) {
				
				return s.length();
			}
		};
		Comparator<String> comparador = Comparator.comparing(tamanho);
		palavras.sort(comparador);	
		System.out.println(palavras);*/

		
		/*Comparator<String> comparador = Comparator.comparing(new Function<String, Integer>(){

			@Override
			public Integer apply(String s) {
				
				return s.length();
			}
		});
		
		palavras.sort(comparador);	
		System.out.println(palavras);*/
		
		//palavras.sort(Comparator.comparing(s -> s.length()));
		
		
		//Method reference, forma 1
		palavras.sort(Comparator.comparing(String::length));
		 System.out.println(palavras);
		//Method reference, forma 2
		 Function<String, Integer> tamanho = String::length;
		 //Function<String, Integer> tamanho = s -> s.length(); lambda
		 Comparator<String> comparador = Comparator.comparing(tamanho);
		 palavras.sort(comparador);
		 System.out.println(palavras);
		 
		 //forma 3
		 
		 palavras.forEach(System.out::println);

	}

}
