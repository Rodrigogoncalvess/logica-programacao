package academy.devdojo.arrays;

import java.util.Scanner;

public class ArraysMelhorados {
    public static void main(String[] args) {

        int[] numero1 = new int[3];
        int[] numero2 = new int[3];
        int[] numero3 = new int[3];

        Scanner scanner = new Scanner(System.in);

        String resultadoFinal = "";
        for (int i = 0; i < numero1.length; i++) {
            System.out.println("Vetor 1, posição: " + i + " : ");
            numero1[i] = scanner.nextInt();
            System.out.println("Vetor 2, posição: " + i + " : ");
            numero2[i] = scanner.nextInt();
            numero1[i]*=numero2[i];
            resultadoFinal+=numero3[i];
        }
        System.out.println(resultadoFinal);
    }
}
