package br.com.exemplo.secao22;

import java.util.Comparator;

/*
A gente est� criando nosso pr�prio comparador de objetos (Strings)
para que seja poss�vel, desta forma, ordenar a string pelo seu tamanho ao
inv�s de ordem alf�betica. 
 */
public class ComparadorPorTamanho implements Comparator<String>{
	
	public int compare(String s1,String s2) {
		
		if(s1.length() < s2.length()) {
			return -1;
		}
		if(s1.length() > s2.length()) {
			return 1;
		}
		return 0;
		
	}

}
