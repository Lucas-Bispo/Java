package br.com.exemplo.secao11;
/*
 * Getteres e Setters
 * Getteres
 * é um método público, que serve para consultar dados;
 * A nomeclatura desses métodos é get_nome_do_atributo();
 * */
public class Conta {
	int numero;
	private float saldo;
	private float limite;
	Cliente cliente;
	
	public Conta ( int numero, float saldo, float limite, Cliente cliente) {
		this.numero = numero;
		this.saldo = saldo;
		this.limite = limite;
		this.cliente = cliente;
	}
	
	//public Conta () {} 
	
	public void sacar(float valor) {
		if(valor <= this.saldo) {
			this.saldo = (this.saldo + this.limite) - valor;
			System.out.println("Saque realizado com sucesso.");
		}else if(valor <= (this.saldo + this.limite)){
			//calculando o valor exedente do saque;
			//100 - 200 ->100
			float val_ret = this.saldo - valor;
			if(val_ret < 0) {
				this.saldo = 0;
			}
			//val_ret = this.limite - val_ret;
			val_ret = this.limite + val_ret;
			this.limite = val_ret;
			System.out.println("Saque realizado com sucesso.");
		}else {
			System.out.println("Saldo insuficiente.");
		}
	}
	/**
	 * Método para realizar depósito
	 * 
	 * @param valor a ser depositado
	 * */
	public void depositar(float valor) {
		synchronized(this) {//forma 1
		this.saldo = this.saldo + valor;
		}
	}
	/*Forma 2
	 * public synchronized void depositar(float valor) {
		this.saldo = this.saldo + valor;
		
	 * */
	public float getSaldo() {
		return this.saldo + this.limite;
	}
	@Override
	public String toString() {
		
		return "O saldo daconta é " + this.getSaldo();	
	}
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Conta)) {
			return false;
		}else {
		Conta verificar = (Conta) obj;//cast
		return verificar.getSaldo() == this.getSaldo();
		}
	}
	

}
