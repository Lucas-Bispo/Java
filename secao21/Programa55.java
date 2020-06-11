package br.com.exemplo.secao21;
//Armazenamento seuquencial
public class Programa55 {

	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Angelina");
		Aluno a2 = new Aluno("Felicity");
		
		Vetor lista = new Vetor();
		
		System.out.println("Total de alunos:" + lista.tamanho());
		
		lista.adiciona(a1);
		
		System.out.println("Total de alunos:" + lista.tamanho());
		
		lista.adiciona(a2);
		
		System.out.println("Total de alunos:" + lista.tamanho());
		
		System.out.println(lista);
		
		System.out.println(lista.contem(a1));
		
		try {
		    System.out.println(lista.pega(101));
		}catch(IllegalArgumentException e) {
		    System.out.println("O aluno da posi��o 101 n�o existe");
		    System.out.println(e.getMessage());
		}
		Aluno a3 = new Aluno("Maria");
		try {
		lista.adiciona(1,a3);
		}catch(IllegalArgumentException e) {
		 System.out.println("A posi��o 101 � inv�lida");
		}
		System.out.println(lista);
		

	}

}
