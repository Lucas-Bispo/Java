package br.com.exemplo.secao16;

import java.io.IOException;
import java.util.Scanner;

public class Programa38 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe o n1: ");
		int n1 = teclado.nextInt();
		
		System.out.println("informe o n2: ");
		int n2 = teclado.nextInt();
		teclado.close();
		
		try {
		     System.out.println(divisao(n1, n2));
		//}catch(ArithmeticException e) {
			//System.out.println("Não conseguir dividir os valores.");	
		//}
		}catch(Exception e) {
			System.out.println("Ocorreu outra exceção.");
		}

	}
	public static int divisao(int n1, int n2) throws IOException{
		return n1 / n2;
	}

}
