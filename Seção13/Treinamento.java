package br.com.exemplo.secao13;

public abstract class Treinamento {
	//Tlepate método
	//Final é um modificador de acesso que faz com que
	//o elementoque esteja ultilizando possa ser extendido/reescrito.
	public final void treinoDiario() {
		preparoFisico();
		jogoTreino();
		treinoTatico(); 

    }
	public abstract void preparoFisico();
	public abstract void jogoTreino();
	public final void treinoTatico() {
		System.out.println("Treino tático");
	}
}
