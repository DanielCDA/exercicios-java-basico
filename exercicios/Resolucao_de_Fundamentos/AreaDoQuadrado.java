//Escreva um código que receba o tamanho do lado de um quadrado, calcule sua área e exiba na tela
//  - fórmula: área=lado X lado

import java.util.Scanner;

public class AreaDoQuadrado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Digite o tamanho do lado do quadrado: ");
        double lado = scanner.nextDouble();
        double area = lado * lado;
        System.out.println();
        System.out.println("A área do quadrado é: " + area);
    }
}