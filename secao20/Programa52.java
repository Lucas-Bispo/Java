package br.com.exemplo.secao20;
//Simula��o da gera��o de relat�rio + barra de tarefa
//sem a utiliza��o de threads
public class Programa52 {

	public static void main(String[] args) {
		
		BarraDeprogresso barra = new BarraDeprogresso();
		Thread t1 = new Thread(barra);
		t1.start();
		
		GeraRelatorio relatorio = new GeraRelatorio();
		Thread t2 = new Thread(relatorio);
		t2.start();
		
	}

}
