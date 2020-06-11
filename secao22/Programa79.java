package br.com.exemplo.secao22;

import java.util.ArrayList;
import java.util.List;

public class Programa79 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        List<Curso> cursos = new ArrayList<Curso>();
    	
    	cursos.add(new Curso("Programação para Leigos",170));
    	cursos.add(new Curso("Aloritmos e lógica de Programação: Essencial",200));
    	cursos.add(new Curso("Programação em C: Essencial",125));
    	cursos.add(new Curso("Programação em java: Essencial",0));
    	cursos.add(new Curso("Programação em Python: Essencial",0));
    	cursos.add(new Curso("Banco de dados: Essencial",0));
    	
    	cursos.stream()
		.filter(c -> c.getAlunos() >= 100)
		//.findAny()//Pega qualquer um de acordo com o filtro
		.findFirst()
		.ifPresent(System.out::println);//Se encontrar algum curso

	}

}
