package academy.devdojo.arrays;

import java.util.Scanner;

public class ArraysComFor {
    public static void main(String[] args) {

        double[] notas = new double[4];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Difgite a nota " + (i + 1));
            notas[i] = scanner.nextDouble();
        }
        double media = 0;
        for (int i = 0; i < notas.length; i++) {
            media += notas[i];
            System.out.println("Notas " + (i + 1) + ": " + notas[i]);
        }
        media /= notas.length;
        System.out.println("Média das notas "+media);
    }
}
