import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nDigite o nome do cliente: ");
        String nome = scanner.nextLine();
        System.out.print("Qual o tipo de conta? [Corrente] [Poupança] ");
        String conta = scanner.nextLine();
        System.out.print("Saldo inicial: ");
        double saldo = scanner.nextInt();

        System.out.println("\n*******************");
        System.out.println("DADOS CLIENTE");
        System.out.println("\nNome: " + nome );
        System.out.println("Tipo conta: " + conta);
        System.out.println("Saldo inicial: R$" + saldo);
        System.out.println("*******************");


        while (true) {
            System.out.println("""
                    \nOperações disponíveis

                    1 - Consultar saldo
                    2 - Receber valor
                    3 - Transferir valor
                    4 - Sair
                    """);
            int opcaoMenu = scanner.nextInt();

            if (opcaoMenu == 1) {
                System.out.println("\nO saldo atual é de R$" + saldo);
            }
            else if (opcaoMenu == 2) {
                System.out.print("\nInforme o valor a ser recebido: ");
                double recebersaldo = scanner.nextDouble();
                saldo += recebersaldo;
                System.out.println("O saldo atual é de R$" + saldo);
            }
            else if (opcaoMenu == 3) {
                System.out.print("\nInforme o valor que deseja transferir: ");
                double transferirvalor = scanner.nextDouble();

                if (transferirvalor <= saldo) {
                    saldo -= transferirvalor;
                    System.out.println("O saldo atual é de R$" + saldo);
                } else {
                    System.out.println("\n>> Seu saldo é menor do que o valor de transferência. Tente novamente com o saldo disponível R$" + saldo);
                }
            }
            else if (opcaoMenu == 4) {
                System.out.println("\nAté a próxima!");
                break;
            }
            else {
                System.out.println("\nOpção inválida. Tente novamente.");
            }
        }
    }
}