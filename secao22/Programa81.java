package br.com.exemplo.secao22;
// Stream + Thred (Paralelismo)

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*
 �til, quando estamos trabalhando com milh�es/bi de dados.
 
 N�o � recomendado para a quantidade pequena de dados
 */
public class Programa81 {

	public static void main(String[] args) {
		List<Curso> cursos = new ArrayList<Curso>();
    	
    	cursos.add(new Curso("Programa��o para Leigos",170));
    	cursos.add(new Curso("Aloritmos e l�gica de Programa��o: Essencial",200));
    	cursos.add(new Curso("Programa��o em C: Essencial",125));
    	cursos.add(new Curso("Programa��o em java: Essencial",0));
    	cursos.add(new Curso("Programa��o em Python: Essencial",0));
    	cursos.add(new Curso("Banco de dados: Essencial",0));
    	
    	/*List<Curso> resultado = cursos.stream()
    			.filter(c -> c.getAlunos() >= 100)
    			.collect(Collectors.toList());
    	resultado.forEach(System.out::println);*/
    	
    	cursos.parallelStream()
    	    .filter(c -> c.getAlunos() >= 100)
    	    .collect(Collectors.toMap(
    	    	     c ->c.getNome(),
    	    	     c ->c.getAlunos()))
    	    .forEach((nome,alunos) -> System.out.println(nome + "tem" + alunos + " alunos"));


	}

}
