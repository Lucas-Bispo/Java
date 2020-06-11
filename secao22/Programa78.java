package br.com.exemplo.secao22;

import java.util.ArrayList;
import java.util.List;

public class Programa78 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Curso> cursos = new ArrayList<Curso>();
    	
    	cursos.add(new Curso("Programação para Leigos",170));
    	cursos.add(new Curso("Aloritmos e lógica de Programação: Essencial",200));
    	cursos.add(new Curso("Programação em C: Essencial",125));
    	cursos.add(new Curso("Programação em java: Essencial",0));
    	cursos.add(new Curso("Programação em Python: Essencial",0));
    	cursos.add(new Curso("Banco de dados: Essencial",0));
    	
    	int soma = cursos.stream()
    			.filter(c -> c.getAlunos() >= 100)
    			.mapToInt(Curso::getAlunos)//Permite fazer cálculos
    			.sum();
    	System.out.println("Asoma de todos os cursos com mais de 100 alunos é " + soma);
	}

}
