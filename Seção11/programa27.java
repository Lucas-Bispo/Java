package br.com.exemplo.secao11;

/* Private
 * privado a pr�pria classe
 * Ou seja s� temos acessoa ou atributo ou m�todo privado
 * dentro sa pr�pria classe 
 * */
public class programa27 {
	
	public static void main(String[] args) {
		Cliente cli1 = new Cliente(45,"dsadfdf", "Rua fasdfsadf 123");
		//cli1.dizer_oi();
		System.out.println("nome:" + cli1.getNome());
		System.out.println("Endere�o:" + cli1.getEnderco());
		
		Cliente cli2 = new Cliente(56,"ddfpdifpsoifgf", "Rua fasdfsadf 123");
		System.out.println("nome:" + cli2.getNome());
		System.out.println("Endere�o:" + cli2.getEnderco());
	}

}
