package br.com.exemplo.secao13;
//Template Method
/*
 O padr�o Template Method define o esqueleto de um algoritimo dentro
 de um m�todo, transferindo alguns de seus passos as subclasses. O template 
 Method permite que as subclasses redefinam certos passos de um algoritimo 
 sem alterar a estrutura do pr�prio algoritimo.
 
 Algoritimos s�o receitas passo a passo para resolver algum problema.
 receber numero
 retornar numero + numero;
 metodo_principal(){
 passo1{}
 passo2{}
 passo3{}
 }
 */
public class Programa32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreinamentoIniciodaTemporada tit = new TreinamentoIniciodaTemporada();
		
		tit.treinoDiario();
		
		TreinamentoIniciodaTemporada tft = new TreinamentoIniciodaTemporada();
		
		tft.treinoDiario();

	}

}
