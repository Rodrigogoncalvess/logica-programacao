package academy.devdojo.playlist01;
/*
Em um circuito elétrico temos as seguintes informações:
275 Ω e 1 A, calcule a tensão elétrica, utilizando a fórmula abaixo:
𝑈 = 𝑅 · 𝐼
Onde:
U = Tensão em Volts
R = Resistência em Ohms
I = Corrente em Amperes
BÔNUS: Altere o programa acima e permita que o usuário digite os valores
para Ohms e Amperes.
 */

import java.util.Scanner;

public class Exercicio19B {
    public static void main(String[] args) {

        float volts;
        float ohms;
        float amperes;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe a resistência em Ohms: ");
        ohms = scanner.nextFloat();

        System.out.println("Informe a corrente em Amperes: ");
        amperes = scanner.nextFloat();

        volts = ohms * amperes;


        System.out.println("Resultado da tensão em Volts: " + volts+" V");


    }

}

