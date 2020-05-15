package br.com.exemplo.secao06;

public class programa13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Tipos de dados alfanuméricos.

		//tipos primitivos
		char letra = 'a';//aceita números
		char letra2 = 97;
		System.out.println("letra2 " +  letra2);
		
		letra2 = (char) (letra2 + 1); //cast


		System.out.println("letra1 " +  letra);
		System.out.println("letra2 " +  letra2);

		//Tipos não primitivos
		Character letra3 = 'A';
		String nome = "lucas";

		System.out.println("letra3 " +letra3);

		System.out.println("char/Character " + Character.SIZE + "bits");

		System.out.println("char/Character" +Character.MIN_VALUE);
		System.out.println("char/Character" +Character.MAX_VALUE);
		//GAMBIARRA PARA SABER O TAMANHO DE UMA STRING.

		System.out.println("Nome "+ nome);

		System.out.println("Tamanho sa string:" + nome.length());

		

	}

}
