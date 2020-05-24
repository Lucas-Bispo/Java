package br.com.exemplo.secao09;
//classes
/*
 * O nome das classes inicia com letras maiusculas 
 * O nome não deve conter: Acentuação, caracteres especiais, espaço.
 * Nas classes java, não eciste a implemantação da função main()
 * Toda classe Java possui a seguinte forma:
 * O nome da classe Java possui a seguinte forma
 * Tudo que estiver dentro das chaves faz parte da classe
 * 
 * 
 * public class nome{
 * 
 * }
 * 
 * Atribitutos 
 * São as caracteristicas da classe/molde/modelo de dados:
 * Podemos entender atributos como variáveis da classe;
 * Uma outra forma de nomenclatura para os atributos são estados ;
 * Atributos são nomeados em letras minúsculas para os atributos, sem espaços 
 * sem caracteres especiais, sem acentuação.
 * 
 * Métodos 
 * 
 * Podemos entender os métodos como ação que é realizada por um objeto da classe
 * */
public class Pessoa {
	String nome,email;
	int ano_nascimento;
	
	//construtor vaio
	public Pessoa() {}
		
	public Pessoa (String nome, String email, int ano_nascimento) {
		//this . se refere ao objeto e o = nome é do parâmetro;
		this.nome = nome;
		this.email = email;
		this.ano_nascimento = ano_nascimento;
	}
	void imprime_informacoes() {
		System.out.println("nome " + this.nome);
		System.out.println("E-MAIL" + this.email);
		System.out.println("Ano de Nascimento " + this.ano_nascimento);
		
	}
	

}
