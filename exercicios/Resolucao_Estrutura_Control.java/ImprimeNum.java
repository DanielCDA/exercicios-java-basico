import java.util.Scanner;

//um código que o usuário entre com um primeiro número, um segundo número maior 
// que o primeiro e escolhe entre a opção par e impar, com isso o código deve 
// informar todos os números pares ou ímpares (de acordo com a seleção inicial) 
// no intervalo de números informados

public class ImprimeNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int primeiroNumero = scanner.nextInt();

        System.out.print("Digite o segundo número (maior que o primeiro): ");
        int segundoNumero = scanner.nextInt();

        while (segundoNumero <= primeiroNumero) {
            System.out.print("O segundo número deve ser maior que o primeiro. Digite novamente: ");
            segundoNumero = scanner.nextInt();
        }

        System.out.print("Digite 'P' para pares ou 'I' para ímpares: ");
        char escolha = scanner.next().toUpperCase().charAt(0);

        System.out.println("Números " + (escolha == 'P' ? "pares" : "ímpares") + " entre " + primeiroNumero + " e " + segundoNumero + ":");

        for (int i = primeiroNumero; i <= segundoNumero; i++) {
            if (escolha == 'P' && i % 2 == 0) {
                System.out.println(i);
            } else if (escolha == 'I' && i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
    
}
