package br.com.exemplo.secao18;

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Programa43 {

	public static void main(String[] args) {

		try {
		Scanner ler = new Scanner(new FileInputStream("Saida.txt"));
		while(ler.hasNextLine()) {
			String linha = ler.nextLine();
			System.out.println(linha);
		}
		ler.close();
		
		}catch(FileNotFoundException e) {
			System.out.println("Arquivo não encontrado.");
		}
	}

}
