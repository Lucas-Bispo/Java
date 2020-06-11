package br.com.exemplo.secao22;

import java.util.ArrayList;
import java.util.List;

public class Programa78 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Curso> cursos = new ArrayList<Curso>();
    	
    	cursos.add(new Curso("Programa��o para Leigos",170));
    	cursos.add(new Curso("Aloritmos e l�gica de Programa��o: Essencial",200));
    	cursos.add(new Curso("Programa��o em C: Essencial",125));
    	cursos.add(new Curso("Programa��o em java: Essencial",0));
    	cursos.add(new Curso("Programa��o em Python: Essencial",0));
    	cursos.add(new Curso("Banco de dados: Essencial",0));
    	
    	int soma = cursos.stream()
    			.filter(c -> c.getAlunos() >= 100)
    			.mapToInt(Curso::getAlunos)//Permite fazer c�lculos
    			.sum();
    	System.out.println("Asoma de todos os cursos com mais de 100 alunos � " + soma);
	}

}
