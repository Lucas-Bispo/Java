package br.com.exemplo.secao20;
//Simulação da geração de relatório + barra de tarefa
//sem a utilização de threads
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
