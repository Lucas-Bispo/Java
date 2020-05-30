package br.com.exemplo.secao12;
//Herança
public class programa28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Pessoa p1 = new Pessoa("Pedro da Silva", 1987,"sdfsdflj@dfjf");
		//System.out.println(p1);
		//System.out.println(p1.getNome());
		//System.out.println("\n");
		
		Aluno a1 = new Aluno("Pedro da Silva", 1987,"adldskalh@dfskdjfkls", "1232131");
		System.out.println(a1);
		System.out.println(a1.getNome());
		System.out.println("\n");
		
		Professor prof1 = new Professor("Pedro da Silva",4654 ,"jfjkfjkdfjk@fkfkfk", "asdjkjhj");
		System.out.println(prof1);
		System.out.println(prof1.getNome());
		
		//System.out.println(a1.toString());

	}

}
