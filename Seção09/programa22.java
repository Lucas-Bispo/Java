package br.com.exemplo.secao09;

public class programa22 {

	public static void main(String[] args) {
		int numero = 4;
		//Declaração de um objeto
		Produto p0;
		
		// Declaração e inicialização/iniciação do objeto.
		//p1 -> instância do objeto / objeto
		Produto p1 = new Produto();//Construttor é próprio mode
		p1.nome = "Notebook";
		p1.preco = 2.367f;
		p1.desconto = 15.0f;
		
		System.out.println(p1.nome);
		System.out.println("RS" + p1.preco);
		System.out.println(p1.desconto + "%");
		
		p0 = new Produto();
		p0.nome = "Caneta Bic";
		p0.preco = 2.45f;
		p0.desconto = 5f;
		
		System.out.println(p0.nome);
		System.out.println("RS" + p0.preco);
		System.out.println(p0.desconto + "%");
		
		Pessoa pessoa1 = new Pessoa();  
		pessoa1.nome = "ASKDGAFSDFG";
		pessoa1.email = "lasjfhsalj@gmaiil.com";
		pessoa1.ano_nascimento = 1976;
		
		System.out.println("nome " + pessoa1.nome);
		System.out.println("E-MAIL" + pessoa1.email);
		System.out.println("Ano de Nascimento " + pessoa1.ano_nascimento);
		

	}

}
