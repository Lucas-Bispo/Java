package br.com.exemplo.secao20;
/*
 * Para execultar m�todos em paralelos, nossa classe deve implementar a 
 * interface Runnable, e o m�todo que precisar ser executado em 
 * paralelo deve ser executado do m�todo run*/
public class BarraDeprogresso implements Runnable{
	@Override
	public void run() {
		 for(int i = 0; i < 100000000; i ++) {
			    System.out.println(i + "Barra de progresso...aguarde");
		}
	}	
	
}
		

