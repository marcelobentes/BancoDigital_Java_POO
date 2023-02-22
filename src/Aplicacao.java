
public class Aplicacao {
	public static void main(String[] args) {
		
		ContaPoupanca contaPoupanca = new ContaPoupanca();
		Conta contaCorrente = new ContaCorrente();
		
	
				
		contaPoupanca.setNumero(3221);
		contaPoupanca.banco.setAgencia(12);
		contaPoupanca.banco.setCnpj("1254986444001");
		contaPoupanca.banco.setNome("Santa Clara");
		contaPoupanca.cliente.setNome("Catarina de Jesus");
		contaPoupanca.cliente.setCpf("12345678");
		contaPoupanca.cliente.setTelefone("(21)996845875");
		contaPoupanca.cliente.setEndereco("Rua Rio de Janeiro");
		contaPoupanca.depositar(400);
		
		
		
			System.out.println("***Informações da Conta Poupança***");
			System.out.println("Banco: "+contaPoupanca.banco.getNome());
			System.out.println("Agencia: "+contaPoupanca.banco.getAgencia());
			System.out.println("Numero: "+contaPoupanca.getNumero());
			System.out.println("Cliente: "+contaPoupanca.cliente.getNome());
			System.out.println("Saldo em conta: "+contaPoupanca.saldo);
				
				
	}
	
}
