package br.com.exemplo.secao06;
//operações matemáticas
public class programa15 {

	@SuppressWarnings("unused")//Decoretor, remover os avisos de todas variáveis que não foram usadas.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 5, num2 = 9, res;
		//soma
		float res2;
		res = num1 + num2;
		
		System.out.println("A soma de "+ num1 + "+" + num2 + "é" + res );
		//subtração
		
		res = num1 - num2;
		System.out.println("A subtração de " + num1 + " + " + num2 + " é " + res );
		
		//multiplicação 
		res = num1 * num2;
		System.out.println("A multiplicação " + num1 + " + " + num2 + " é " + res);
		
		//divisão
		res = num1 / num2;//cast
		System.out.println("A divisão " + num1 + " + " + num2 + " é " + res);
		
		//divisão real
		res2 = (float)num1 / (float)num2;//cast
		System.out.println("A divisão " + num1 + " + " + num2 + " é " + res);
        /*Módulo
         * Se o resto do módulo da variável por 2 for 0, a variável
         * é par. Se o resto for 1, a variável é impar.
         * */
		res = num1 % 2;
		System.out.println("O resto da divisão de " + num1 + "por 2 é " + res);
		
		res = num1 % 3;
		System.out.println(num2 + "Num dois é divisível por 3 ? " + res);
		
	}

}
