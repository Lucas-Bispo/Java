package br.com.exemplo.secao09;
public class programa24 {
//O construtor da classe  SEMPRE tem o mesmo nome da classe;
//Por padrão , a JVR Java Virtual Machine, cria em tempo de execução
//um construtor padrão - um construtor vazio
//podemos ter mais de um construtor na classe
	/*
	 * Sepre um construto tem a seguinte forma:
	 * public NomeDaClasse(){}
	 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pessoa pessoa1 = new Pessoa();  
		pessoa1.nome = "ASKDGAFSDFG";
		pessoa1.email = "lasjfhsalj@gmaiil.com";
		pessoa1.ano_nascimento = 1976;
		
		pessoa1.imprime_informacoes();
		/*System.out.println("nome " + pessoa1.nome);
		System.out.println("E-MAIL" + pessoa1.email);
		System.out.println("Ano de Nascimento " + pessoa1.ano_nascimento);
		*/
		Pessoa pessoa2 = new Pessoa("fdjhshflkj", "jhglajhgj", 1966);
        pessoa2.imprime_informacoes();
	}

}
