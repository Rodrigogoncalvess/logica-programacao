package academy.devdojo.playlist01;
/*
Ainda podemos realizar o cálculo de potência elétrica, desenvolva um rotina
que calculo a potência de um equipamento, utilizando os dados e a fórmula a
seguir:
Dados:
220 V e 25 A
Fórmula:
𝑃 = 𝑈 · 𝐼
Onde:
P = Potência em Watts
U = Tensão em Volts
I = Corrente em Amperes
BÔNUS: Altere o programa acima e permita que o usuário digite os valores
para Volts e Amperes.
 */

import java.util.Scanner;

public class Exercicio19D {
    public static void main(String[] args) {

        float watts;
        float volts;
        float amperes;


        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a tensão em Volts: ");
        volts = scanner.nextFloat();

        System.out.println("Informe a corrente em Amperes: ");
        amperes = scanner.nextFloat();


        watts = volts * amperes;


        System.out.printf("Resultado da potência em Watts: %.2f W ", watts);


    }

}

