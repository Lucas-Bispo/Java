package br.com.exemplo.secao21;
//Conjuntos
/*
 * Uma das caracteristicsa de conjuntos é a não aceitação de elementos
 * repetidos.
 * Gera performance
 * */
public class Programa64 {

	public static void main(String[] args) {
		Conjunto conjunto = new Conjunto();
		
		System.out.println(conjunto);
		
		conjunto.adiciona("Agelina");
		conjunto.adiciona("Felicity");
		conjunto.adiciona("Gabriela");
		conjunto.adiciona("Júlia");
		conjunto.adiciona("Fabiana");
		conjunto.adiciona("Felicity");//Não entra repetido
		
		conjunto.remove("Júlia");
		
		System.out.println(conjunto);
	

	}

}
