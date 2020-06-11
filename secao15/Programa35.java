package br.com.exemplo.secao15;
//M�todos est�ticos
/*
 U m�todo est�tico, n�o depende de uma inst�ncia da classe
 para ser utilizado.
 
 *Pode-se ultilizar conforme:
 NomeDa Classe.metodo();*/
public class Programa35 {

	public static void main(String[] args) {
		Conta c1 = new Conta("Meu cliente");
		
		System.out.println("N�mero da conta: " + c1.getNumero());
		System.out.println("Cliente: " + c1.getCliente());
		
		System.out.println("A pr�xima conta ser�: " + Conta.proximaConta());

	}

}
