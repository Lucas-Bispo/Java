package br.com.exemplo.secao14;
/*
 Interfaces são conhecidas como contratos
 
 *Uma empresa criou um contrato com regras para definir a criação 
de um produto/serviço

 *O joao, decidiu implementar um produto/serviço baseado neste contrato
 A Maria, também decidiu implementar um produto/serviço baseado no mesmo contrato
 
 Quem implementar o contra é obrigado a seguir as regras
  *Contrato
  O bolo precisa ser de chocolate;
  O bolo deve ter cobertura
  O bolo deve ser recheado
  */
public class Programa33 {

	public static void main(String[] args) {
		Ventilador vent = new Ventilador();
		System.out.println("A marca do ventilador é " + vent.MARCA);
		vent.desligar(); // Não deve imprimir a menssagem
		vent.ligar();//deve imprimir a menssagem
		vent.desligar();//deve imprimir a menssagem

	}

}
