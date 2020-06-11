package br.com.exemplo.secao19;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

//Mapas - Map
/*
 * Os mapas são representados em Java pela interface Map
 * e mapeia elementos utilizando o conceito de chave/valor
 * 
 * Mapas são como se foosem/representassem 3 coleções
 *    - Coleção de chaves:
 *    - Coleção de valores:
 *    - Coleção de associações:
 * */
public class Programas50 {

	public static void main(String[] args) {
		Map<Integer, String> pessoas = new HashMap<Integer, String>();
		
		pessoas.put(21,"Felicity Jonnes");
		pessoas.put(31,"Maria Antonieta");
		pessoas.put(41,"Agelina Jolie");
		
		//coleção de chaves
		System.out.println("Chaves: " + pessoas.keySet());
		
		//Coleção de valores
		System.out.println("Valores: " + pessoas.values());
		
		//Coleções de associações
		System.out.println("Associação: " + pessoas.entrySet());
		
		//forma 1
		//Disponibilizando a partir da Java 8
		pessoas.keySet().forEach(idade ->{
			System.out.println(pessoas.get(idade));
		});
		//forma 2
		//Iterar na coção de chaves
		Set<Integer> chaves = pessoas.keySet();
		for(Integer idade: chaves) {
			System.out.println(idade);
		}
		//Iterar na coleção de valores
		//forma 1
		Collection<String> valores = pessoas.values();
		for(String nome: valores) {
			System.out.println(nome);
		}
		//Forma 2 
		pessoas.values().forEach(nome -> {
			System.out.println(nome);
		});
		//Iterar a coleção de associação
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
