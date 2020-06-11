package br.com.exemplo.secao22;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

//Classes anônimas
/*
 Ultilizamos classes anônimas quando temos interfaces com um ou 
 poucos métodos e não precisamos reaproveitar o código.
 
 *Ou seja, se não precisar reaproveitar a classe em um outro lugar 
 do nosso sistema e esta classe que eu devereia criar iria apenas implementar 
 uma interface com um ou poucos métodos, podemos ultilizar o conceito de 
 classe anônima.
 */
public class Programa69 {

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
		
		Consumer<String> consumidor = new Consumer<String>() {//new em classe sem nome

			@Override
			public void accept(String s) {
				System.out.println(s);
			}
			
		};
		
		palavras.forEach(consumidor);

	}

}
