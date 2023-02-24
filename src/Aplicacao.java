
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
		contaPoupanca.transferir(100, contaCorrente);
		
		contaPoupanca.imprimirDadosConta();
		System.out.println("*************************************");
		System.out.println("*************************************");
		System.out.println("%%%Dados Conta Corrente%%%");
		contaCorrente.setNumero(1520);
		contaCorrente.banco.setAgencia(12);
		contaCorrente.banco.setNome("Santa Clara");
		contaCorrente.cliente.setNome("Santo Espirito");
		contaCorrente.cliente.setCpf("7894546482");
		contaCorrente.cliente.setTelefone("(21)998564698");
		contaCorrente.cliente.setEndereco("Rua da Bahia");
		
		
		contaCorrente.imprimirDadosConta();
		
			
				
				
	}
	
}
