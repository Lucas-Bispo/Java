package br.com.exemplo.secao07;
//Matrizes parte 2
public class programa19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numeros[][] = new int [3][3];
		numeros[0][0] = 1;
		numeros[0][1] = 3;
		numeros[0][2] = 5;
		numeros[1][0] = 1;
		numeros[1][1] = 1;
		numeros[1][2] = 1;
		numeros[2][0] = 1;
		numeros[2][1] = 1;
		numeros[2][2] = 1;
		
		for(int i = 0; i < numeros.length; i++) {
			for(int j = 0; j < numeros.length; j++ ) {
				numeros[i][j] = i + j * 2;
			}
		}
		for(int i = 0; i < numeros.length; i++) {
			for(int j = 0; j < numeros.length; j++ ) {
				System.out.println("numeros[" + i +"][" + j +"] = " +numeros[i][j]);
			}
		}

	}

}
