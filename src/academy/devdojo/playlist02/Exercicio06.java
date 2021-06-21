package academy.devdojo.playlist02;
/*
Leia um número inteiro qualquer e multiplique por 2, apresentando o
resultado da multiplicação somente se o resultado for maior ou igual a 30.DO
 */

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {

        int n1;
        int resultado;

        Scanner ent = new Scanner(System.in);


        System.out.println("Digite um número:");
        n1 = ent.nextInt();
        resultado = n1*2;

        if(resultado>=30){
            System.out.println("Resultado foi maior ou igual 30: "+resultado);
        }else {
            System.out.println("Resultado foi inferior ao esperado!");
        }

    }
}
