package academy.devdojo.playlist01;
/*
Elabore uma rotina que apresente o valor do volume de uma esfera, utilize a fórmula
abaixo:
𝑉 = (4 ÷ 3)Π(𝑅 3)
Onde:
V = Volume
π = 3.141592654
R = Raio


Ve = 4.п.r3/3
 */

import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {

        double volume;
        final double pi =3.141592654;
        double raio;

        Scanner imput = new Scanner(System.in);
        System.out.println("Informe o tamanho da esfera: ");

        raio=imput.nextDouble();
        //utilizei outro formula que segue no início da classe.
        volume = (4*pi*(Math.pow(raio,3))/3);

        System.out.printf("Volume de uma esfera: %.2f", volume);


    }

}

