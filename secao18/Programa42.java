package br.com.exemplo.secao18;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

//Escrevendo em arquivos
public class Programa42 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		try {
			/*Desta forma, toda vez que o programa for executado
			 * o arquivo será reconhecido e toda a informação, se pré-existente,
			 * será excluída, recomençando o arquivo zerado*/
		PrintStream escrever = new PrintStream("Saida.txt");
		for(int i = 0; i < 5; i++ ) {
		System.out.println("Escreva algo");
		String msg = teclado.nextLine();
		escrever.println(msg);
		}
		escrever.close();
		}catch(FileNotFoundException e) {
		
			System.out.println("Não foi possivel criar o arquivo");
		}
		
		teclado.close();

	}

}
