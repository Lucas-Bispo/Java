package br.com.exemplo.secao22;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Programa73 {

	public static void main(String[] args) {
		List<String> palavras = new ArrayList<String>();

		palavras.add("Geek");
		palavras.add("University");
		palavras.add("Java");
		palavras.add("Angelina");
		palavras.add("Playstation 4");
		palavras.add("OutLast 2");
		
		palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
		
		Consumer<String> consumer = s -> System.out.println(s);
		palavras.forEach(consumer);

	}

}
