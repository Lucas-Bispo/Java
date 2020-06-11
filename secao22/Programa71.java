package br.com.exemplo.secao22;

//Lambdas
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
/*
 Expressões lambdas, são funções anônimas
 
 Atalho do Eclipse para indentação do código -> CTRL + SHIFT + F
 */

public class Programa71 {

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
		// Expressões lambda 1
		/*
		 * palavras.forEach((String s) -> { System.out.println(s); });
		 */
		// Expressões lambda 2
		palavras.forEach(s -> System.out.println(s));

	}

}
