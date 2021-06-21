package academy.devdojo.lacoderepeticao.whliles;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor desejado");
        int valorFinal = scanner.nextInt();
        int i = 0;

        while (i <= valorFinal) {
            if (i % 2 != 0) {
                System.out.println("Numero impares " + i);
            }
            i = i + 1;
        }
    }
}
