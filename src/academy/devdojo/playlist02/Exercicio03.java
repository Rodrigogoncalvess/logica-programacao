package academy.devdojo.playlist02;
/*
Desenvolva a leitura de cinco valores numéricos inteiros e apresente
somente os que forem divisíveis por 2 ou por 3.
 */

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {

        int[] numeros = new int[5];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Informe o número:");
            numeros[i] = scanner.nextInt();
        }


        for (int i = 0; i < numeros.length; i++) {

            if (numeros[i] % 2 == 0) {
                System.out.println("Número " + numeros[i] + " é divido por 2");
            } else {
                System.out.println("O número " + numeros[i] + " não é divididos 2 ");

            }
        }
        for (int j = 0; j < numeros.length; j++) {
            if (numeros[j] % 3 == 0) {
                System.out.println("Número " + numeros[j] + " é divido por 3");
            } else {
                System.out.println("O Número " + numeros[j] + " não é divido por 3");
            }
        }
    }
}



