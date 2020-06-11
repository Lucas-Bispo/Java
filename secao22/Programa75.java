package br.com.exemplo.secao22;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

//Revis�o

/*
 Classes an�nimas
 Lambnas
 Method Refereces 
 */
public class Programa75 {
	
	
    public static void main(String[] args) {
    	
    	List<Curso> cursos = new ArrayList<Curso>();
    	
    	cursos.add(new Curso("Programa��o para Leigos",170));
    	cursos.add(new Curso("Aloritmos e l�gica de Programa��o: Essencial",200));
    	cursos.add(new Curso("Programa��o em C: Essencial",125));
    	cursos.add(new Curso("Programa��o em java: Essencial",0));
    	cursos.add(new Curso("Programa��o em Python: Essencial",0));
    	cursos.add(new Curso("Banco de dados: Essencial",0));
    	
    	cursos.sort(Comparator.comparing(Curso::getAlunos));
    	
    	cursos.forEach(System.out::println);
    }
}
