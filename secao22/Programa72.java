package br.com.exemplo.secao22;

import java.util.ArrayList;
import java.util.List;

public class Programa72 {

	public static void main(String[] args) {
		List<String> palavras = new ArrayList<String>();

		palavras.add("Geek");
		palavras.add("University");
		palavras.add("Java");
		palavras.add("Angelina");
		palavras.add("Playstation 4");
		palavras.add("OutLast 2");

		// forma 1
		/*
		 * palavras.sort((s1, s2) -> { if(s1.length() < s2.length()) { return -1; }
		 * if(s1.length() > s2.length()) { return 1; } return 0;
		 * 
		 * });
		 */
		palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));

	}

}
