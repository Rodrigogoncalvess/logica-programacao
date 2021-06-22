package academy.devdojo.playlist03;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
Elaborar um programa que calcule e apresente a tabuada de um número qualquer.
 */
public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número para obter a tabuada:");


            try {
                int numero = scanner.nextInt();
                System.out.println("Tabuada de adição");
                for (int i = 1; i <= 10; i++) {
                    System.out.println(numero + " + " + i + " = " + (numero + i));
                }
                System.out.println("\nTabuada de subtração");
                for (int i = 1; i <= 10; i++) {
                    System.out.println((i + numero) + " - " + numero + " = " + ((numero + i) - numero));
                }
                System.out.println("\nTabuada de multiplicação");
                for (int i = 1; i <= 10; i++) {
                    System.out.println(numero + " x " + i + " = " + (numero * i));
                }
                System.out.println("\nTabuada de divisão");
                for (int i = 1; i <= 10; i++) {
                    System.out.println((i * numero) + " / " + numero + " = " + (i * numero / numero));
                }
            } catch (InputMismatchException i) {
                System.out.println("Opção inválida, digite um número.");

            }
        }
    }










