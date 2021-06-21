package academy.devdojo.playlist01;
/*
Desenvolva uma rotina que leia dois valores numéricos inteiros e apresente o
resultado das quatro operações aritméticas básicas (adição, subtração, multiplicação
e divisão).
 */

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {

        int numero1;
        int numero2;
        int calculo;
      
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor desejado:");
        numero1 = scanner.nextInt();

        System.out.println("Digite o valor desejado:");
        numero2 = scanner.nextInt();

        System.out.println("Valor das quatro operação aritméticas: ");

        calculo = numero1 + numero2;
        System.out.println("Valor da adição: " + calculo);
        calculo = numero1 - numero2;
        System.out.println("Valor da subtração: " + calculo);
        calculo = numero1 * numero2;
        System.out.println("Valor da multiplicação: " + calculo);
        calculo = numero1 / numero2;
        System.out.println("Valor da divisão: " + calculo);
    }

}

