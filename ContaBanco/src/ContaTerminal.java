import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        int numeroConta;
        String agencia;
        String nomeCliente;
        double saldo = 0.0;
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Por favor, infome o número da Conta: ");
        numeroConta = Integer.parseInt(sc.nextLine());

        System.out.print("Por favor, infome o número da Agência: ");
        agencia = sc.nextLine();

        System.out.print("Por favor, infome o nome do Cliente: ");
        nomeCliente = sc.nextLine();

        System.out.print("Por favor, infome valor a depositar: ");
        saldo = Double.parseDouble(sc.nextLine());

        System.out.println(String.format("Olá %s, obrigado por criar uma conta em nosso banco,"
                          + " sua agência é %s, conta %d e seu saldo %.2f já está" 
                          + " disponível para saque.", nomeCliente, agencia, numeroConta, saldo));        



    }
}
