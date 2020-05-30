package br.com.exemplo.secao12;
//Classe base,generica, m�e,pai;
//Agora como classe abstrata
/*
 Desta forma s�o impedidas a cri��o de objetos desta classe
 uma classe abstrata pode ser 
 -Atributo
 -m�todos
 -m�todos abstratos 
 
 *M�todos abstratos 
  - S�o m�todos, que n�o possuem implementa��o, possuem apenas declara��es
  e obrigatoriamente as classes que herdarem desta classe com com m�todos abstrato,
  precisa implementar estes m�todos*/
public abstract class Pessoa {
	private String nome;
	private int ano_nascimento;
	private String email;
	
	public Pessoa() {}
	
	public Pessoa(String nome, int ano_nascimento,String email) {
		this.nome = nome;
		this.ano_nascimento = ano_nascimento;
		this.email = email;
	}
	public String getNome() {
		return this.nome;
	}
    public void setNome(String nome) {
    	this.nome = nome;
    }
    public int getAno_nascimento() {
		return this. ano_nascimento;
	}
    public void setAno_nascimento(int ano_nascimento) {
    	this. ano_nascimento =  ano_nascimento;
    }
    public String getEmail() {
		return this.email;
	}
    public void setEmail(String email) {
    	this.email = email;
    }
    //Overriding/Sobre escrita de m�todos
    public String toString() {
    	return "Nome" + this.nome + "Ano nascimento" + this.ano_nascimento ;
    }
    //Overloading / Sobrecarga de m�todos
    public void menssagem() {
    	System.out.println("MENSSAGEM");
    }
    public void menssagem(String msg) {
    	System.out.println(msg);
    }
    public void menssagem(String msg,int num) {
    	System.out.println(msg + num);
    }
    //Declara��o de m�todo abstrato
    public abstract void outra_menssagem(String texto);
    
}
