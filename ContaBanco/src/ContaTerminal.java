import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) { Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da conta:");
        int numero = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Por favor, digite o número da agência:");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o nome do cliente:");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo da conta:");
        double saldo = scanner.nextDouble();

        System.out.println("\nOlá "+nomeCliente+ 
     ", obrigado por criar uma conta em nosso banco. Sua agência é "+
        agencia+
        ", conta "+
        numero+
        " e seu saldo "+
        saldo+" já está disponível para saque.");

          scanner.close();
    }

}
