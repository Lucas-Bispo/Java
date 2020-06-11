package br.com.exemplo.secao21;

public class Aluno {
	public String nome;
	
	public Aluno(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return this.nome;
	}
	@Override
	public boolean equals(Object obj) {
		Aluno outro = (Aluno) obj;
		return outro.getNome().equals(this.nome);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.nome;
	}
}
