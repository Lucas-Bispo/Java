package br.com.exemplo.secao04;
//Switch
public class programa06 {

	public static void main(String[] args) {
		
		int num = 6;
		
		switch(num) {
		case 1:
			System.out.println("Onumero � 1");
			break;
		case 2:
			System.out.println("O numero � 2");
			break;
		case 5:
			System.out.println("O numero � 5");
			break;
		default:
			System.out.println("default O numero � "+ num);
		}

	}

}
