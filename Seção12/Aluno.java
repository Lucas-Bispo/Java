package br.com.exemplo.secao12;
/*Benefício da herança
 * Evia a repetição do código
 * Facilita a manutenção.
 * 
 * Classe específica,subclasse, filha
 * 
 * aluno é uma pessoa
 * Quando uma classe herda de outra clsse ela ganha:
 * todos os atributos e métodos de classe herdada.*/
public class Aluno  extends Pessoa{
	private String ra;
	
	public Aluno(String nome, int ano_nascimento,String email, String ra) {
		super(nome, ano_nascimento,email);
		this.ra = ra;
	}
    public String getRa() {
    	return this.ra;
    }
    public void setRa(String ra) {
    	this.ra = ra;
    }
    public String toString() {
        return super.toString().toString() + "\nR.A: "+ this.ra;

   }
   public String getNome() {
	   return "Aluno: \n" + super.getNome();
   }
@Override
public void outra_menssagem(String texto) {
	// TODO Auto-generated method stub
	System.out.println(texto);
}
}
