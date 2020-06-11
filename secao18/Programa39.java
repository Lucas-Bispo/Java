package br.com.exemplo.secao18;

import br.com.exemplo.secao11.Cliente;
import br.com.exemplo.secao11.Conta;

//Object: A mãe de todas as classes
/*
 *A classe Object, faz parte do pacote java.lang*/
public class Programa39 {

	public static void main(String[] args) {
		Cliente cli1 = new Cliente(18,"Agelina","Rua 1, 234");
		Cliente cli2 = new Cliente(39,"Felicity","Rua 2, 5544");
		
		Conta c1 = new Conta(1,200,300,cli1);
		Conta c2 = new Conta(2,200,300,cli2);
		
		Caixa prateleira = new Caixa();
		
		System.out.println(c1);//por padrão a instância imprime com toString();
		System.out.println(c2);
		
		if(c1.equals(cli1)) {//c2/
			System.out.println("São a mesma conta.");
		}else {
			System.out.println("São contas diferentes.");
		}
		prateleira.adicionar(c1);
		prateleira.adicionar(c2);
		
		//Conta conta = prateleira.pegar(0);
		
		System.out.println(((Conta)prateleira.pegar(0)).getSaldo());//cast
		
		prateleira.adicionar(cli1);
		
		System.out.println(((Cliente)prateleira.pegar(2)).getNome());
		
		if((Object)cli1 instanceof Conta) {// C1
			System.out.println("O objeto é do tipo conta");
		}else {
			System.out.println("O objeto NÃO é do tipo conta");
		}
		
	}

}
