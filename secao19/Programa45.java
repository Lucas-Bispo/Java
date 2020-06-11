package br.com.exemplo.secao19;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// listas

/*  Colection (Coleções)
 * 
 * Java possui diverssar classes/interfaces que facilitam muito o trabalho quando
 * trata de coleções de dados. essas classes/interfaces são chamadas de COLLECTION(coleções)
 * 
 * Aceitam repetição de valores
 * tem tamanho infinito (depende da memória)
 * Pode colocar qualquer tipo de dado desde quando não o especifique-o
 * */
public class Programa45 {
	
	public static void main(String[] args) {
	    List<String> nomes = new ArrayList<String>();//linkdlist	
	    nomes.add("Maria");
	    nomes.add("Felicty");
	    nomes.add("Agelina");
	    nomes.add("geek");
	    nomes.add("Maria");
	    
	    //nomes.add(44);
	    //nomes.add(true);
	    //nomes.add(12.4);
	    //nomes.add('e');
	    
	    //System.out.println(nomes.size());
	    
	   // for(int i = 0; i< nomes.size(); i++) {
	    //	System.out.println(nomes.get(i));
	    //}
	    Collections.sort(nomes);
	    
	    for (Object nome : nomes) {
			System.out.println(nome);
		}
	
	}

}
