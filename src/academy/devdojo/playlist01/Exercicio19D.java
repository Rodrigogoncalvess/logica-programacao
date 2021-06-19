package academy.devdojo.playlist01;
/*
Em um circuito elétrico temos as seguintes informações:
12 V e 175 Ω, calcule a corrente elétrica, utilizando a fórmula abaixo:
𝐼 = 𝑈
𝑅
Onde:
I = Corrente em Amperes
U = Tensão em Volts
R = Resistência em Ohms
BÔNUS: Altere o programa acima e permita que o usuário digite os valores
para Volts e Ohms.
 */

import java.util.Scanner;

public class Exercicio19C {
    public static void main(String[] args) {

        float amperes;
        float volts;
        float ohms;


        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a tensão em Volts: ");
        volts = scanner.nextFloat();

        System.out.println("Informe a resistência em Ohms: ");
        ohms = scanner.nextFloat();


        amperes = volts / ohms;


        System.out.printf("Resultado da corrente em Amperes:%.3f A ", amperes);


    }

}

