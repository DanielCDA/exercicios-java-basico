import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor inicial do depósito: R$");
        float depositoInicial = sc.nextFloat();

        ContaBancaria conta = new ContaBancaria(depositoInicial);

        int opcao = 0;

        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Consultar cheque especial");
            System.out.println("3. Depositar dinheiro");
            System.out.println("4. Sacar dinheiro");
            System.out.println("5. Pagar boleto");
            System.out.println("6. Verificar uso do cheque especial");
            System.out.println("7. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.printf("Saldo disponível: R$%.2f\n", conta.getSaldo());
                    break;
                case 2:
                    System.out.printf("Cheque especial disponível: R$%.2f\n", conta.getChequeDisponivel());
                    break;
                case 3:
                    System.out.print("Digite o valor a depositar: R$");
                    float valorDeposito = sc.nextFloat();
                    conta.depositar(valorDeposito);
                    System.out.println("Depósito realizado com sucesso!");
                    break;
                case 4:
                    System.out.print("Digite o valor a sacar: R$");
                    float valorSaque = sc.nextFloat();
                    conta.sacar(valorSaque);
                    break;
                case 5:
                    System.out.print("Digite o valor do boleto: R$");
                    float valorBoleto = sc.nextFloat();
                    conta.pagarBoleto(valorBoleto);
                    break;
                case 6:
                    if (conta.estaUsandoChequeEspecial()) {
                        System.out.println("A conta está usando cheque especial!");
                    } else {
                        System.out.println("A conta NÃO está usando cheque especial.");
                    }
                    break;
                case 7:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        } while (opcao != 7);

        sc.close();
    }
}

