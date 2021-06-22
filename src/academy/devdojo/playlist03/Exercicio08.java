package academy.devdojo.playlist03;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
Desenvolva um programa que dado um número inteiro apresente as tabuadas do 1
ao 10 desse número.
 */
public class Exercicio08 {
    public static void main(String[] args) {

        int numero;

        Scanner scanner = new Scanner(System.in);


        System.out.println("Informe um número inteiro");
        try {
            numero = scanner.nextInt();

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
            System.out.println("Digite um valor numérico válido ");
        }

    }
}




