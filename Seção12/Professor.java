package br.com.exemplo.secao12;

public class Professor extends Pessoa{
	private String matricula;
	
	public Professor (String nome, int ano_nascimento,String email, String matricula) {
		super(nome,ano_nascimento,email);
		this.matricula = matricula;
	}
	public String getMatrivula() {
		return this.matricula;
	}
	public void setMatrivula(String matricula) {
		this.matricula = matricula;
	}
	public String toString() {
		return super.toString() + "\nMatricula: " + this.matricula;
	}
	public String getNome() {
		   return "Professor: \n" + super.getNome();
	   }
	@Override
	public void outra_menssagem(String texto) {
		// TODO Auto-generated method stub
		System.out.println(texto);
	}

}
