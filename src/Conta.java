
public abstract class Conta {
	
	
	protected int numero;
	protected double saldo =0;
	Cliente cliente = new Cliente();
	Banco banco = new Banco();
	
	
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
	
	public void imprimirDadosConta() {
		System.out.println("###Informações da Conta###");
		System.out.println("Banco: "+banco.getNome());
		System.out.println("Agencia: "+banco.getAgencia());
		System.out.println("Numero: "+getNumero());
		System.out.println("Cliente: "+cliente.getNome());
		System.out.println("Saldo em conta: "+saldo);
	}
	
	
	
	
}
