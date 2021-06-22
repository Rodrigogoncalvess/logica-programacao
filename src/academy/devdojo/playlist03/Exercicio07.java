package academy.devdojo.playlist03;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
Melhorar o programa acima fazendo com que leia 5 números inteiros e calcule o
fatorial dos 5 valores lidos.
 */
public class Exercicio07 {
    public static void main(String[] args){

        int [] numeros = new int[5];

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe 5 números para calcular o fatorial:");
        try {
            for (int i = 0; i < numeros.length; i++) {
                numeros[i] = scanner.nextInt();

                int valor = numeros[i];

                while (numeros[i] > 1) {
                    valor = valor * (numeros[i] - 1);
                    numeros[i]--;

                }System.out.println("Resultado do fatorial: "+valor);

                }
            } catch(InputMismatchException inputMismatchException){

                System.out.println("Digite um valor numérico válido ");
            }

    }
}



