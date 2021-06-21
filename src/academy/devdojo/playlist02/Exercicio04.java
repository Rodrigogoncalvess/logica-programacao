package academy.devdojo.playlist02;
/*
Escreva um programa que dados cinco valores numéricos inteiros apresente
apenas o maior e o menor deles.
 */

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {

        int[] numeros = new int[5];
        int maior = 0;
        int menor = 0;

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Informe um valor :");
            numeros[i] = scanner.nextInt();
        }
        for (int i = 0; i < numeros.length; i++) {
            {
                if (numeros[i] > maior) {
                    maior = numeros[i];
                }
                if (numeros[i] <= numeros[0]) {
                    menor = numeros[i];
                }
            }
        }
        System.out.println("Menor valor digitado foi: " + menor);
        System.out.println("Maior valor digitado foi: " + maior);
    }
}

