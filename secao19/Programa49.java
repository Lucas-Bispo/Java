package br.com.exemplo.secao19;
//HashMap 
/*Não aceita chaves duplicadas, mas chaves sim.
 * 
 * */
import java.util.HashMap;
import java.util.Map;

import br.com.exemplo.secao11.Cliente;
import br.com.exemplo.secao11.Conta;

public class Programa49 {

	public static void main(String[] args) {
		Map<String, Conta> contas = new HashMap<String, Conta>();
		
		Cliente cli1 = new Cliente(24,"Angelina Jolie","Rua 1");
		Cliente cli2 = new Cliente(34,"Angelina Jolie","Rua 1");
		
		Conta c1 = new Conta(1,200,300,cli1);
		Conta c2 = new Conta(1,400,700,cli2);
		
		contas.put("Pessoa física", c1);
		contas.put("Pessoa física", c1);
		
		System.out.println(contas.size());
		
		System.out.println(contas.get("pessoa fisica"));
		
	}

}
