package br.com.exemplo.secao22;

import java.util.ArrayList;
import java.util.List;

public class Programa77 {

	public static void main(String[] args) {
       
		List<Curso> cursos = new ArrayList<Curso>();
    	
    	cursos.add(new Curso("Programação para Leigos",170));
    	cursos.add(new Curso("Aloritmos e lógica de Programação: Essencial",200));
    	cursos.add(new Curso("Programação em C: Essencial",125));
    	cursos.add(new Curso("Programação em java: Essencial",0));
    	cursos.add(new Curso("Programação em Python: Essencial",0));
    	cursos.add(new Curso("Banco de dados: Essencial",0));
    	
    	cursos.stream()
    	.filter(c -> c.getAlunos() >= 100)
    	.map(Curso::getAlunos)
    	.forEach(System.out::println);

	}

}
