package br.com.exemplo.secao06;
//opera��es matem�ticas
public class programa15 {

	@SuppressWarnings("unused")//Decoretor, remover os avisos de todas vari�veis que n�o foram usadas.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 5, num2 = 9, res;
		//soma
		float res2;
		res = num1 + num2;
		
		System.out.println("A soma de "+ num1 + "+" + num2 + "�" + res );
		//subtra��o
		
		res = num1 - num2;
		System.out.println("A subtra��o de " + num1 + " + " + num2 + " � " + res );
		
		//multiplica��o 
		res = num1 * num2;
		System.out.println("A multiplica��o " + num1 + " + " + num2 + " � " + res);
		
		//divis�o
		res = num1 / num2;//cast
		System.out.println("A divis�o " + num1 + " + " + num2 + " � " + res);
		
		//divis�o real
		res2 = (float)num1 / (float)num2;//cast
		System.out.println("A divis�o " + num1 + " + " + num2 + " � " + res);
        /*M�dulo
         * Se o resto do m�dulo da vari�vel por 2 for 0, a vari�vel
         * � par. Se o resto for 1, a vari�vel � impar.
         * */
		res = num1 % 2;
		System.out.println("O resto da divis�o de " + num1 + "por 2 � " + res);
		
		res = num1 % 3;
		System.out.println(num2 + "Num dois � divis�vel por 3 ? " + res);
		
	}

}
