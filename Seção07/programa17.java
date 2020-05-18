package br.com.exemplo.secao07;
public class programa17 {
	//vetores parte 2
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numeros[] = new int[10];
		System.out.println("Tamanho do vetor" + numeros.length);
		for(int i = 0;i < numeros.length; i++) {
			numeros[i] = 1+3;
		}
		System.out.println(numeros[0]);
		System.out.println(numeros[9]);
		
		numeros[0] = 7;
		System.out.println(numeros[0]);
		
		for(int i = 0;i < numeros.length; i++) {
		numeros[i] = (int)Math.round(Math.random() * 10);
		//gera um número aleátorio 
		}
		System.out.println(Math.random());
		
		System.out.println(Math.random() * 10);
		
		System.out.println(Math.round(Math.random() * 10));
		
		for (int i : numeros) {
			System.out.println(i);
		}
	}

}
