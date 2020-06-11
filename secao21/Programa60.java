package br.com.exemplo.secao21;
//Pilha
/*
 * São estruturas de dados onde o elemento que está visivél/disponivel
 * é o que está sempre no topo.
 * 
 * Os elementos, ao seres adicionados em uma pilha, são adicionados
 * sempre no topo.
 * 
 * Para remover elementos de pilha, só podemos remover o topo.
 * 
 * */
public class Programa60 {

	public static void main(String[] args) {
		Pilha pilha = new Pilha();
		
		System.out.println(pilha);
		
		pilha.insere("Angelina");
		pilha.insere("Felicity");
		
		System.out.println(pilha);
		
		String ret = pilha.pegaTopo()	;
		System.out.println(ret);
		
		
		String r1 = pilha.remove();
		System.out.println(r1);
		
		System.out.println(pilha);
		
		pilha.remove();
		System.out.println(pilha.vazia());
	}

}
