package br.com.exemplo.secao21;

import java.util.Arrays;

public class Vetor {
	private Aluno alunos[] = new Aluno[100];
	private int total = 0;
	
	public void adiciona(Aluno aluno) {
		this.garantirEpa�o();
		this.alunos[total] = aluno;
		total = total + 1;
		/*for (int i = 0; i < alunos.length; i++) {
			if (alunos[i] == null) {
				alunos[i] = aluno;
				break;
			}
		}*/
	}
	
	public void adiciona(int posicao, Aluno aluno) {
		this.garantirEpa�o();
		if (posicaoOcupada(posicao)) {
			throw new IllegalArgumentException("Posi��o inv�lida.");
		}
		for (int i = total - 1; i >= posicao; i-=1) {
			alunos[i + 1] = alunos[i];
		}
		alunos[posicao] = aluno;
		total++;
	
		
	}
	
	public Aluno pega(int posicao) {
		if (!posicaoOcupada(posicao)) {
			throw new IllegalArgumentException("Posi��o inv�lida.");
		}
		return this.alunos[posicao];
	}
	
	public void remove(int posicao) {
		for(int i = posicao; i < this.total; i++){
			this.alunos[i] = this.alunos[i+1];
		}
	}
	
	public boolean contem(Aluno aluno) {
		//Descobre se o aluno est� na lista
		for (int i = 0; i < total; i++) {
			if (aluno.equals(alunos[i])) {
				return true;
			}
		}
		return false;
	}
	public int tamanho() {
		
		return this.total;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return Arrays.toString(this.alunos);//facilita a vizualiza��o do array
	}
	
	private boolean posicaoOcupada(int posicao) {
	return posicao >= 0 && posicao < total;	
	}
	
	private void garantirEpa�o() {
		//Verifica se o array est� cheio 
		if (total == alunos.length) {
			//caso esteja cheio, cria um novo array com o dobro de tamanho do array anterior
			Aluno novoArray[] = new Aluno[alunos.length * 2];
			//Copia os dados do array anterior para o novo array
			for (int i = 0; i < alunos.length; i++) {
				novoArray[i] = alunos[i];
			}
			//Por ultimo, atribuimos o novo array original
			this.alunos = novoArray;
		}
	
	}


}
