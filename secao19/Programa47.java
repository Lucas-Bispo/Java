package br.com.exemplo.secao19;

import java.util.ArrayList;
import java.util.Collections;

import br.com.exemplo.secao11.Cliente;

public class Programa47 {

	public static void main(String[] args) {
		ArrayList<Cliente> clientes = new ArrayList<Cliente>();
		
		Cliente cli1 = new Cliente (43,"Maria", "Rua 1");
		Cliente cli2 = new Cliente (12,"Felicity", "Rua 2");
		Cliente cli3 = new Cliente (45,"Agelina Jolie", "Rua 5");
		
		clientes.add(cli1);
		clientes.add(cli2);
		clientes.add(cli3);
		
		Collections.sort(clientes);
		
		for(Cliente cliente: clientes) {
			System.out.println(cliente);
		}

	}

}
