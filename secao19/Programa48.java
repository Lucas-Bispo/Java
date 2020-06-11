package br.com.exemplo.secao19;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

//Conjuntos
/*
 * Os conjuntos são implementados com a interface Set,e uma das 
 * classes que implementam esta interface é a HashSet
 * 
 *  A maioria das coleções possuem os mesmos métodos já conhecidos
 *  e ultilizados com as listas, mas o comportamento desses objetos
 *  é um pouco diferente.
 *  
 *  Caracteristicas dos conjuntos, não aceita valor repetido.
 *  ordem de inserção não respeitada
 *  Realiza semi-ordeção 
 *  e não aceita ordenação
 *  Não possui índice*/
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
				System.out.println("O nome não pode ser repetido.");
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
