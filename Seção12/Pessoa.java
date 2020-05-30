package br.com.exemplo.secao12;
//Classe base,generica, mãe,pai;
//Agora como classe abstrata
/*
 Desta forma são impedidas a crição de objetos desta classe
 uma classe abstrata pode ser 
 -Atributo
 -métodos
 -métodos abstratos 
 
 *Métodos abstratos 
  - São métodos, que não possuem implementação, possuem apenas declarações
  e obrigatoriamente as classes que herdarem desta classe com com métodos abstrato,
  precisa implementar estes métodos*/
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
    //Overriding/Sobre escrita de métodos
    public String toString() {
    	return "Nome" + this.nome + "Ano nascimento" + this.ano_nascimento ;
    }
    //Overloading / Sobrecarga de métodos
    public void menssagem() {
    	System.out.println("MENSSAGEM");
    }
    public void menssagem(String msg) {
    	System.out.println(msg);
    }
    public void menssagem(String msg,int num) {
    	System.out.println(msg + num);
    }
    //Declaração de método abstrato
    public abstract void outra_menssagem(String texto);
    
}
