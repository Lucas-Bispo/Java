package br.com.exemplo.secao22;

//Lambdas
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
/*
 Express�es lambdas, s�o fun��es an�nimas
 
 Atalho do Eclipse para indenta��o do c�digo -> CTRL + SHIFT + F
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
		// Express�es lambda 1
		/*
		 * palavras.forEach((String s) -> { System.out.println(s); });
		 */
		// Express�es lambda 2
		palavras.forEach(s -> System.out.println(s));

	}

}
