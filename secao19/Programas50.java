package br.com.exemplo.secao19;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

//Mapas - Map
/*
 * Os mapas s�o representados em Java pela interface Map
 * e mapeia elementos utilizando o conceito de chave/valor
 * 
 * Mapas s�o como se foosem/representassem 3 cole��es
 *    - Cole��o de chaves:
 *    - Cole��o de valores:
 *    - Cole��o de associa��es:
 * */
public class Programas50 {

	public static void main(String[] args) {
		Map<Integer, String> pessoas = new HashMap<Integer, String>();
		
		pessoas.put(21,"Felicity Jonnes");
		pessoas.put(31,"Maria Antonieta");
		pessoas.put(41,"Agelina Jolie");
		
		//cole��o de chaves
		System.out.println("Chaves: " + pessoas.keySet());
		
		//Cole��o de valores
		System.out.println("Valores: " + pessoas.values());
		
		//Cole��es de associa��es
		System.out.println("Associa��o: " + pessoas.entrySet());
		
		//forma 1
		//Disponibilizando a partir da Java 8
		pessoas.keySet().forEach(idade ->{
			System.out.println(pessoas.get(idade));
		});
		//forma 2
		//Iterar na co��o de chaves
		Set<Integer> chaves = pessoas.keySet();
		for(Integer idade: chaves) {
			System.out.println(idade);
		}
		//Iterar na cole��o de valores
		//forma 1
		Collection<String> valores = pessoas.values();
		for(String nome: valores) {
			System.out.println(nome);
		}
		//Forma 2 
		pessoas.values().forEach(nome -> {
			System.out.println(nome);
		});
		//Iterar a cole��o de associa��o
		//forma 1
		Set<Entry<Integer, String>> associacoes = pessoas.entrySet();
		for(Entry<Integer, String> associacao: associacoes) {
			System.out.println(associacao.getKey() + " - " + associacao.getValue());
		}
		//forma 2 
		pessoas.entrySet().forEach(associacao ->{
			System.out.println(associacao.getKey() + " - " + associacao.getValue());
		
		});
	}

}
