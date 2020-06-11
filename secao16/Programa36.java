package br.com.exemplo.secao16;
//Tratamento exece��es com try/catch
/*
 Ultilizamos o try para tentar realizar algo, gerelmente realizar aquilo que 
 pode acarretar em uum problema 
 
  Utilizamos o cash para capturar o erro e com isso oferecer ao usu�rio do sistema
  uma menssagem adequada.
   */
public class Programa36 {

	public static void main(String[] args) {
		int numeros[] = new int[5];
		
		for(int i = 0; i < numeros.length; i++) {
			numeros[i] = i + 3 * 2;
		}
		for(int i = 0; i <= numeros.length; i++) {
			try {//tente fazer isso
			     System.out.println(numeros[i]);
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("Voc� est� tentando acessar uma posi��o do array que n�o existe. ");
			}finally {//Complemento 
				System.out.println("Continua o processo...");
			}
		}

	}

}
