package br.com.exemplo.secao21;

import java.util.Stack;

//Pilhas - Implementadas
public class Programa61 {

	public static void main(String[] args) {
		Stack<String> nomes = new Stack<String>();
		
		System.out.println(nomes);
		nomes.push("Angelina");
		nomes.push("Felicity");
		System.out.println(nomes);
		
		String ret = nomes.peek();
		System.out.println(ret);
		System.out.println(nomes);
		
		String r1 = nomes.pop();
		System.out.println(r1);
		System.out.println(nomes);
	}

}
