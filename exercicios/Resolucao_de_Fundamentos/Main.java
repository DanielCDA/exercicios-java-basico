
import java.util.Scanner;

//Escreva um código que receba o nome e o ano de nascimento de alguém e imprima 
// na tela a seguinte mensagem: "Olá 'Fulano' você tem 'X' anos"


public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Digite seu nome: ");
        String nome= scanner.nextLine();
        System.out.printf("Digite a sua idade: ");
        int ano = scanner.nextInt();
        System.out.println();
        System.out.println("Olá " + nome + " você tem " + ano + " anos");
    }
}
