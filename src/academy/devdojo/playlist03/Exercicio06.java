package academy.devdojo.playlist03;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
Elaborar um programa que calcule o fatorial de um número inteiro
 */
public class Exercicio06 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o número para calcular o fatorial:");
        try {
            int numero = scanner.nextInt();
            int valor = numero;

            while (numero > 1) {
                valor = valor * (numero - 1);
                numero--;
            }
            System.out.println(valor);
        } catch (InputMismatchException i) {
            System.out.println("Digite um valor numérico válido ");
        }
    }
}



