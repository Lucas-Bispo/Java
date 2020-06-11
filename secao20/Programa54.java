package br.com.exemplo.secao20;
//Thread Sincronizada
/*
 * O sincronismo ocorre pois durante a execução de método a thread
 * executa um look(bloqueio) da função para qur outra thead 
 * só possa execula- la pós a finalização 
 * 
 * */

import br.com.exemplo.secao11.Cliente;
import br.com.exemplo.secao11.Conta;

public class Programa54 {

	public static void main(String[] args) throws InterruptedException {
		Cliente cli1 = new Cliente(37,"Angelina Jolie", "Rua1");
		Conta c1 = new Conta(1, 200, 300, cli1);
		
		FazDeposito acao = new FazDeposito(c1);
		Thread t1 = new Thread(acao);
		Thread t2 = new Thread(acao);
		
		t1.start();
		t2.start();
		t1.join();//esta avisando que t1 deve se juntar a um sincronizador
		t2.join();//Sincronização encontrada na classe conta, (Depositar)
		
		System.out.println(c1);


	}

}
