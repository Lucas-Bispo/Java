package br.com.exemplo.secao22;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Programa66 {

	public static void main(String[] args) {
		List<String> palavras = new ArrayList<String>();
		
		Comparator<String> comparador = new ComparadorPorTamanho();
		
		palavras.add("Geek");
		palavras.add("University");
		palavras.add("Java");
		palavras.add("Angelina");
		palavras.add("Playstation 4");
		palavras.add("OutLast 2");
		
		palavras.sort(comparador);
		
		System.out.println(palavras);

	}

}
