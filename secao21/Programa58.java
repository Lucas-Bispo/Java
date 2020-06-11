package br.com.exemplo.secao21;

import java.util.LinkedList;
import java.util.List;

public class Programa58 {

	public static void main(String[] args) {
		List<String> lista = new LinkedList<String>();
		
		System.out.println(lista.size());
		
		lista.add("Felicity");
		lista.add("Angelina");
		
		lista.add(0, "maria");
		
		System.out.println(lista);

	}

}
