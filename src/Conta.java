
public abstract class Conta {
	
	
	protected int numero;
	protected double saldo =0;
	protected Cliente cliente;
	protected Banco banco;
	
	
	void depositar (double valor) {
		this.saldo += valor;
	}
	void transferir (double valor, Conta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
	}
	void sacar (double valor) {
		this.saldo -= valor;
	}
	void saldo () {
		System.out.println("Saldo em conta: "+getSaldo());
	}
	int getNumero() {
		return numero;
	}
	void setNumero(int numero) {
		this.numero = numero;
	}
	double getSaldo() {
		return saldo;
	}
	void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
}
