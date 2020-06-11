package br.com.exemplo.secao15;
//Atributos est�ticos
/*
 Atributos est�ticos s�o atributos, onde os valores s�o compartilhados
 entre as instancias da classe.
 
 Para utilizar um atributos est�tico, colocamos o nome da classe junto ao atributo

 NomeDaClaase.atributo
 */
public class Programa34 {

	public static void main(String[] args) {
	Conta c1 = new Conta("Agelina Jolie");
	
	System.out.println(c1.getNumero());
	System.out.println(c1.getCliente());
	
    Conta c2 = new Conta("Felicity Jones");
	
	System.out.println(c2.getNumero());
	System.out.println(c2.getCliente());
	
    Conta c3 = new Conta("Maria da Gra�a");
	
	System.out.println(c3.getNumero());
	System.out.println(c3.getCliente());
	
	System.out.println(Conta.contador);
	
	Conta.contador = 42;
	
	System.out.println(Conta.contador);
	
    Conta c4 = new Conta("Outro cliente");
	
	System.out.println(c4.getNumero());
	System.out.println(c4.getCliente());
	}

}
