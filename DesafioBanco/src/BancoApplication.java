import ed.desafioDioBanco.Models.Cliente;
import ed.desafioDioBanco.Models.Conta;
import ed.desafioDioBanco.Models.ContaCorrente;
import ed.desafioDioBanco.Models.ContaPoupanca;

public class BancoApplication {
	
	public static void main(String[] args) {
		Cliente cliente1 = new Cliente();
		cliente1.setNome("Cliente 1");
		
		Conta cc = new ContaCorrente(cliente1);
		Conta poupanca = new ContaPoupanca(cliente1);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
