package br.com.exemplo.secao18;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;
// Escrita em arquivo 2, adiciona e se o arquivo n�o existir, � criado.
public class Programa44 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		try {
			/*Desta forma, toda vez que o programa for executado
			 * o arquivo ser� reconhecido e toda a informa��o, se pr�-existente,
			 * ser� exclu�da, recomen�ando o arquivo zerado*/
		PrintStream escrever = new PrintStream(new FileOutputStream("Saida.txt", true));
		for(int i = 0; i < 5; i++ ) {
		System.out.println("Escreva algo");
		String msg = teclado.nextLine();
		escrever.println(msg);
		}
		escrever.close();
		}catch(FileNotFoundException e) {
		
			System.out.println("N�o foi possivel criar o arquivo");
		}
		
		teclado.close();

	}

}
