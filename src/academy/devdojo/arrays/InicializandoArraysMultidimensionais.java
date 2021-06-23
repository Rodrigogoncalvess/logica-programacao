package academy.devdojo.arrays;

import java.util.Scanner;

public class InicializandoArraysMultidimensionais {
    public static void main(String[] args) {

        int[][] arrayMulti1 = new int[2][2];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < arrayMulti1.length; i++) {
            for (int j = 0; j < arrayMulti1[i].length; j++) {
                System.out.println("Digite o valor da posição [" + i + "][" + j + "]");
                arrayMulti1[i][j] = scanner.nextInt();

            }

        }
        for (int i = 0; i < arrayMulti1.length; i++) {
            for (int j = 0; j < arrayMulti1[i].length; j++) {
                System.out.println("[" + i + "][" + j + "]=" + arrayMulti1[i][j]);
            }
        }

    }
}
