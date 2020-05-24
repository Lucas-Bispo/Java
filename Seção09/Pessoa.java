package br.com.exemplo.secao09;
//classes
/*
 * O nome das classes inicia com letras maiusculas 
 * O nome n�o deve conter: Acentua��o, caracteres especiais, espa�o.
 * Nas classes java, n�o eciste a implemanta��o da fun��o main()
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
 * S�o as caracteristicas da classe/molde/modelo de dados:
 * Podemos entender atributos como vari�veis da classe;
 * Uma outra forma de nomenclatura para os atributos s�o estados ;
 * Atributos s�o nomeados em letras min�sculas para os atributos, sem espa�os 
 * sem caracteres especiais, sem acentua��o.
 * 
 * M�todos 
 * 
 * Podemos entender os m�todos como a��o que � realizada por um objeto da classe
 * */
public class Pessoa {
	String nome,email;
	int ano_nascimento;
	
	//construtor vaio
	public Pessoa() {}
		
	public Pessoa (String nome, String email, int ano_nascimento) {
		//this . se refere ao objeto e o = nome � do par�metro;
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
