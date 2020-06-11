package br.com.exemplo.secao19;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

//Conjuntos
/*
 * Os conjuntos s�o implementados com a interface Set,e uma das 
 * classes que implementam esta interface � a HashSet
 * 
 *  A maioria das cole��es possuem os mesmos m�todos j� conhecidos
 *  e ultilizados com as listas, mas o comportamento desses objetos
 *  � um pouco diferente.
 *  
 *  Caracteristicas dos conjuntos, n�o aceita valor repetido.
 *  ordem de inser��o n�o respeitada
 *  Realiza semi-orde��o 
 *  e n�o aceita ordena��o
 *  N�o possui �ndice*/
public class Programa48 {

	public static void main(String[] args) {
		Set<String> nomes = new HashSet<String>();
		boolean res;
		//nomes.add("Maria");
		//nomes.add("Felicity");
		//nomes.add("Angelina");
		//nomes.add("geek");
		//nomes.add("felicity");
		
		Scanner teclado = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			System.out.println("Informe o " + (i + 1) + "/5 nome: ");
			String nome = teclado.nextLine();
			res = nomes.add(nome);
			if(!res) {
				System.out.println("O nome n�o pode ser repetido.");
				i--;
			}
		}
		System.out.println("No conjunto nomes temos " + nomes.size() + " elementos");
		
		for (String nome : nomes) {
			System.out.println(nome);
		}
		teclado.close();
		
		//System.out.println(nomes.add("Pedro"));
		
		//System.out.println(nomes.contains("Felicity"));
		
		//for(String nome: nomes) {
			//System.out.println(nome);
		//}

	}

}
