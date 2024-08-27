import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Agência!");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o número da Conta!");
        String numeroConta = scanner.nextLine();

        System.out.println("Por favor, digite o seu Nome!");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o Saldo!");
        double saldo = scanner.nextDouble();

        // Concatenação usando o método concat da classe String
        String mensagem = "Olá ".concat(nomeCliente)
                                 .concat(", obrigado por criar uma conta em nosso banco. Sua agência é ")
                                 .concat(agencia)
                                 .concat(", conta ")
                                 .concat(numeroConta)
                                 .concat(" e seu saldo ")
                                 .concat(String.valueOf(saldo))
                                 .concat(" já está disponível para saque.");

        System.out.println(mensagem);

        scanner.close();
    }
}
