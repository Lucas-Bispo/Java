package br.com.exemplo.secao19;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// listas

/*  Colection (Cole��es)
 * 
 * Java possui diverssar classes/interfaces que facilitam muito o trabalho quando
 * trata de cole��es de dados. essas classes/interfaces s�o chamadas de COLLECTION(cole��es)
 * 
 * Aceitam repeti��o de valores
 * tem tamanho infinito (depende da mem�ria)
 * Pode colocar qualquer tipo de dado desde quando n�o o especifique-o
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
