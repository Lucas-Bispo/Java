package br.com.exemplo.secao22;

public interface Teste {
	int valor = 9;
	public String menssagem();
	
	default void meu_metodo() {
		System.out.println("Default method...");
	}
	

}
