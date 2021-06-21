package academy.devdojo.lacoderepeticao.whliles;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {

        int desejaContinuar = 1;

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Player 1: digite um número de 1 a 10");
            int num1 = scanner.nextInt();
            System.out.println("Player 2: digite um número de 1 a 10");
            int num2 = scanner.nextInt();
            System.out.println("Resultado: " + (num1 == num2));
            System.out.println("-----------");
            System.out.println("Deseja continuar jogando?");
            System.out.println("1 -sim");
            System.out.println("2 -não");
            desejaContinuar = scanner.nextInt();

        } while (desejaContinuar == 1);
        System.out.println("Programa finalizado");
    }
}
