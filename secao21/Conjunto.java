package br.com.exemplo.secao21;

import java.util.LinkedList;
import java.util.List;

public class Conjunto{
	
	//pode usar array pq usa a mesma interface
	private LinkedList<LinkedList<String>> tabela = new LinkedList<LinkedList<String>>();
	
	public Conjunto() {
		for (int i = 0; i < 26; i++) {
			tabela.add(new LinkedList<String>());
		}
	}
	private int calculaIndice(String nome) {
		return nome.toLowerCase().charAt(0) % 26;	
	}
	
	public void adiciona(String nome) {
		//1 - verifica se o nome esta na lista
		if (!contem(nome)) {
			
		// 1 - Cakcukando o indice do nome
		int indice = calculaIndice(nome);
		//2 Pegando a lista de acordo com o índice
		List<String> lista = tabela.get(indice);
		//3 - Adiciona o nome lista correta
		lista.add(nome);
		}
	}
	private boolean contem(String nome) {
		// 1 - Calculando o indice do nome
		int indice = calculaIndice(nome);
		// 2 - Buscamos na tabela específica do índice o nome
		return tabela.get(indice).contains(nome);
	}
	public void remove(String nome) {
		//1 - verificamos se o nome existe em alguma lista
		if (contem(nome)) {
			//Calculamos o índice do nome
			int indece = calculaIndice(nome);
			//3 - pegamos a lista especíca do nome
			List<String> lista = tabela.get(indece);
			//4 - Removemos da lista
			lista.remove(nome);
		}
	}
	
	@Override
	public String toString() {
		return tabela.toString();
	}
		

}
