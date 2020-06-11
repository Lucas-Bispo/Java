package br.com.exemplo.secao22;

import java.util.ArrayList;
import java.util.List;

//Streams
/*
 Strams - são fluxos de dados/objetos utilizamos para que possamos
 trabalhar com esses dados de forma mais criteriosa.
 
 Quando trabalhamos com Stream, os métodos aplicados a está não 
 afeta a coleção original
 */
public class Programa76 {

	public static void main(String[] args) {
        
		List<Curso> cursos = new ArrayList<Curso>();
    	
    	cursos.add(new Curso("Programação para Leigos",170));
    	cursos.add(new Curso("Aloritmos e lógica de Programação: Essencial",200));
    	cursos.add(new Curso("Programação em C: Essencial",125));
    	cursos.add(new Curso("Programação em java: Essencial",0));
    	cursos.add(new Curso("Programação em Python: Essencial",0));
    	cursos.add(new Curso("Banco de dados: Essencial",0));
		
    	//cursos.stream().filter(c -> c.getAlunos() >= 100).forEach(c -> System.out.println(c.getNome()));
    	cursos.stream().filter(c-> c.getAlunos() >= 100).forEach(System.out::println);

	}

}
