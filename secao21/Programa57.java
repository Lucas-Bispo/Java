package br.com.exemplo.secao21;
/* Listas ligadas
 
 Listas ligada os valores em qualquer lugar
 
  */
public class Programa57 {

	public static void main(String[] args) {
		ListaLigada lista = new ListaLigada();
		
		System.out.println(lista);
		
		lista.adiciona("Angelina");
		System.out.println(lista);
		
		lista.adiciona("maria");
		lista.adiciona("felicity");
		System.out.println(lista);
		lista.removeDoComeco();
		System.out.println(lista);

	}

}
