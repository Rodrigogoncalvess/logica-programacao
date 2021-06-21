package academy.devdojo.playlist02;
/*
Desenvolva um programa que execute a leitura de um valor numérico inteiro,
caso o valor esteja entre 1 e 9 apresentar a mensagem “Dentro do valor
permitido”e caso contrário apresentar a mensagem “Fora do Valor
Permitido”.
 */

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {

        int valor = 0;

        Scanner ent = new Scanner(System.in);


        System.out.println("Infome um valor:");
        valor = ent.nextInt();

        if (valor > 0 && valor <= 9) {
            System.out.println("Dentro do valor!");
        } else {
            System.out.println("Fora do valor!");
        }
    }
}
