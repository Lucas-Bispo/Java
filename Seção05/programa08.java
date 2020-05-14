package br.com.exemplo.secao05;
import java.util.Scanner;
public class programa08 {

	public static void main( String[] args) {
		// TODO Auto-generated method stub
	
		
		int idade = 1;
		String nome;
		
		Scanner teclado = new Scanner(System.in);
		
		do{
			System.out.println("Informe seu nome:");
			nome = teclado.nextLine();
			
			System.out.print("Informe sua idade:");
			//idade = teclado.nextInt(); //bug
			idade = Integer.parseInt(teclado.nextLine());
			if(idade > 0) {
			System.out.println(nome + " tem " + idade + " anos");
			}
	    }while(idade > 0);
		teclado.close();
	}

}
