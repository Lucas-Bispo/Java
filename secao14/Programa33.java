package br.com.exemplo.secao14;
/*
 Interfaces s�o conhecidas como contratos
 
 *Uma empresa criou um contrato com regras para definir a cria��o 
de um produto/servi�o

 *O joao, decidiu implementar um produto/servi�o baseado neste contrato
 A Maria, tamb�m decidiu implementar um produto/servi�o baseado no mesmo contrato
 
 Quem implementar o contra � obrigado a seguir as regras
  *Contrato
  O bolo precisa ser de chocolate;
  O bolo deve ter cobertura
  O bolo deve ser recheado
  */
public class Programa33 {

	public static void main(String[] args) {
		Ventilador vent = new Ventilador();
		System.out.println("A marca do ventilador � " + vent.MARCA);
		vent.desligar(); // N�o deve imprimir a menssagem
		vent.ligar();//deve imprimir a menssagem
		vent.desligar();//deve imprimir a menssagem

	}

}
