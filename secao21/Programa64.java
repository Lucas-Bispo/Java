package br.com.exemplo.secao21;
//Conjuntos
/*
 * Uma das caracteristicsa de conjuntos � a n�o aceita��o de elementos
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
		conjunto.adiciona("J�lia");
		conjunto.adiciona("Fabiana");
		conjunto.adiciona("Felicity");//N�o entra repetido
		
		conjunto.remove("J�lia");
		
		System.out.println(conjunto);
	

	}

}
