package br.com.exemplo.secao06;
//Tipos de dados 
//Nï¿½merico (inteiros e reais)
public class programa11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long num0 = 99;
		int num1 = 4; //Inteiro 99999999999999999
		short num2 = 4; //inteiro (curto/baixo) 99999
		byte num3 = 4;
		char num8 = 34;
		//tipos nÃ£o primarios
		Long num7 = (long) 99999999; //cast
		Integer num4 = 98;
		Short num5 = 7;
		Byte num6 = 9;
		
		System.out.println("long ->NUM0 = "+ num0);
		System.out.println("int ->NUM1 = " + num1);
		System.out.println("short ->NUM2 = " + num2);
		System.out.println("byte ->NUM3 = " + num3);
		System.out.println("Long ->NUM7 = " + num7);
		System.out.println("Integer ->NUM4 = " + num4);
		System.out.println("Short ->NUM5 = " + num5);
		System.out.println("Byte ->NUM6 = " + num6);
		//basta realizar os comando abaixo para cada variÃ¡vel.
		System.out.println("int/Integer "+ Integer.SIZE + "bits");
		System.out.println("int/Short "+ Short.SIZE + "bits");
		System.out.println("int/byte "+ Byte.SIZE + "bits");
		
		System.out.println("VALOR/byte "+ Byte.MAX_VALUE);
		System.out.println("VALOR/byte "+ Byte.MIN_VALUE);
		
		System.out.println("VALOR/byte "+ Short.MAX_VALUE);
		System.out.println("VALOR/byte "+ Short.MIN_VALUE);
		
		System.out.println("VALOR/byte "+ Integer.MAX_VALUE);
		System.out.println("VALOR/byte "+ Integer.MIN_VALUE);

	}

}
