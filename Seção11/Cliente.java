package br.com.exemplo.secao11;
//protected
/*
 * É o modificador de acesso padrão.
 * 
 * O modificador de acesso protected faz com que
 * o elemento seja visível somente do mesmo pacote
 * onde o elemento foi declarado.
 * Seretirar o public se torna automaticamente protected.
 *
 * */
public class Cliente implements Comparable{
	private int idade;
	private String nome;
	private String endereco;
	
	
	
	public Cliente (int idade,String nome, String endereco) {
		this.idade = idade;
		this.nome = nome;
		this.endereco = endereco;
		
		this.dizer_oi();
	}
	private void dizer_oi() {
		System.out.println(this.nome );//+ " está dizendo oi");
	}
	public String getNome() {
		return this.nome;
	}
	public String getEnderco() {
		return this.endereco;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.nome;
	}
	@Override
	public int compareTo(Object outro) {
		Cliente aux = (Cliente)outro;
		if(this.idade < aux.idade) {
			return -1;
		}else if(this.idade > aux.idade) {
			return 1;
		}else {
		return 0;
		}
	}

}
