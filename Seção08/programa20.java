package br.com.exemplo.secao08;
import java.util.Scanner;

//Criando funções
/*FaÃ§a um programa que receba diversas frutras do usuÃ¡rio
 * e no final imprima ao contrÃ¡rio.O programa deve solicitar quantas 
 * frutas ele quer informar */
public class programa20 {
	static String fruta[];
	static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int qtd;

		System.out.println("Informe a quantidade de frutas para cadastrar ");
		qtd = Integer.parseInt(teclado.nextLine());
		//definindo o tamanho do vetor.
		cadastrar_dados(qtd);

		mostrar_dados(qtd);

		teclado.close();
	}
	/*Uma funÃ§Ã£o deve ter o seguinte:
	a)Tipo de retorno (tipo de dado que a funÃ§Ã£o vai retornar)
	b)Nome - corresponde a aÃ§Ã£o que a funÃ§Ã£o realiza
	c)ParÃ¢metro/argumentos de entrada(opcional)
	d)Retorno(opcional - depende do tipo de retorno)*/
	static void cadastrar_dados(int quantidade){//funÃ§Ã£o com parÃ¢metro
		
		fruta = new String[quantidade];
		
		for(int i = 0; i < quantidade; i++) {
			
			System.out.println("informe a " + (i + 1) +" fruta");
			fruta[i] = teclado.nextLine();
		}

	}
	static void mostrar_dados(int quantidade){
		
		for(int i = (quantidade - 1); i >= 0; i--) {
			System.out.println(fruta[i]);
		}

	}

}
