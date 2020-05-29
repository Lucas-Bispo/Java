package br.com.exemplo.secao11;

/* Private
 * privado a própria classe
 * Ou seja só temos acessoa ou atributo ou método privado
 * dentro sa própria classe 
 * */
public class programa27 {
	
	public static void main(String[] args) {
		Cliente cli1 = new Cliente(45,"dsadfdf", "Rua fasdfsadf 123");
		//cli1.dizer_oi();
		System.out.println("nome:" + cli1.getNome());
		System.out.println("Endereço:" + cli1.getEnderco());
		
		Cliente cli2 = new Cliente(56,"ddfpdifpsoifgf", "Rua fasdfsadf 123");
		System.out.println("nome:" + cli2.getNome());
		System.out.println("Endereço:" + cli2.getEnderco());
	}

}
