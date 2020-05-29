package br.com.exemplo.secao11;
//Encapsulamento
//vetar o acesso direto
//capsula 
public class programa25 {

	public static void main(String[] args) {
		Cliente joao = new Cliente(15,"Joao da Silva", "Rua da paz, 45");
		Cliente maria = new Cliente(25,"Maria da Silva", "Rua da paz, 45");
		
		Conta conta_joao = new Conta(1, 100.0f, 200.0f, joao);
		Conta conta_maria = new Conta(2, 300.0f, 500.0f, joao);
		
		System.out.println("Saldo do João: (Antes do saque):" + conta_joao.getSaldo());
		System.out.println("Saldo do Maria: " + conta_maria.getSaldo());
		
		conta_joao.sacar(150);
		System.out.println("Saldo do João: (Depois do saque):" + conta_joao.getSaldo());
		
		System.out.println("Saldo do João: (Depois do saque forçado):" + conta_joao.getSa~ldo());
		

	}

}
