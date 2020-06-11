package br.com.exemplo.secao21;

import java.util.LinkedList;
import java.util.Queue;

public class Programa63 {

	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<String>();
		System.out.println(fila);
		
		fila.add("Agelina");//inserir
		fila.add("Maria");//inserir
		fila.add("Felicity");//inserir
		
		System.out.println(fila);
		
		String ret = fila.poll();
		
		System.out.println(ret);
		
		System.out.println(fila);

	}

}
