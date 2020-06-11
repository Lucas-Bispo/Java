package br.com.exemplo.secao22;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Programa80 {

	public static void main(String[] args) {
		
		List<Curso> cursos = new ArrayList<Curso>();
    	
    	cursos.add(new Curso("Programação para Leigos",170));
    	cursos.add(new Curso("Aloritmos e lógica de Programação: Essencial",200));
    	cursos.add(new Curso("Programação em C: Essencial",125));
    	cursos.add(new Curso("Programação em java: Essencial",0));
    	cursos.add(new Curso("Programação em Python: Essencial",0));
    	cursos.add(new Curso("Banco de dados: Essencial",0));
    	
    	/*List<Curso> resultado = cursos.stream()
    			.filter(c -> c.getAlunos() >= 100)
    			.collect(Collectors.toList());
    	resultado.forEach(System.out::println);*/
    	
    	cursos.stream()
    	    .filter(c -> c.getAlunos() >= 100)
    	    .collect(Collectors.toMap(
    	    	     c -> c.getNome(),
    	    	     c -> c.getAlunos()))
    	    .forEach((nome,alunos) -> System.out.println(nome + "tem" + alunos + " alunos"));
    	

	}

}
