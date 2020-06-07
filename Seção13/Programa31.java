package br.com.exemplo.secao13;

import br.com.exemplo.secao12.Aluno;

public class Programa31{
	
	public static void main(String[] args) {
		Aluno maria = new Aluno("Maria", 1996, "@", "545446");
		System.out.println(maria);
		maria.outra_menssagem("Meu nome é " + maria.getNome());
	}
}
