package br.com.exemplo.secao18;
//Trabalhando com string
/*
 * Em java, as strings s�o imut�veis, ou seja , n�o mudam.
 * 
 * */
public class Programa41 {

	public static void main(String[] args) {
		String curso = "Programa��o em Java: Essencial";
		
		//String nova = curso.replace("Java", "Python");//Altera na string, se encontrar, a primeira palavra pela segunda.
		curso = curso.toLowerCase();//conver mai�sculas para min�sculas
		
		
		System.out.println(curso);
		//System.out.println(nova);
		
		curso = curso.toUpperCase();
		
		System.out.println(curso);
		
		System.out.println(curso.charAt(12));
		
		for(int i = 0; i < curso.length(); i++) {
			System.out.println(curso.charAt(i));
		}
		

	}

}
