package academy.devdojo.playlist01;
/*
Em um circuito elétrico temos as seguintes informações:
275 V e 10 A, calcule a resistência elétrica, utilizando a fórmula abaixo:
𝑅 = 𝑈
𝐼
Onde:
R = Resistência em Ohms
U = Tensão em Volts
I = Corrente em Amperes
BÔNUS: Altere o programa acima e permita que o usuário digite os valores
para Volts e Amperes.
 */
import java.util.Scanner;

public class Exercicio19A {
    public static void main(String[] args) {

        float ohms;
        float volts;
        float amperes;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe a tensão em volts: ");
        volts = scanner.nextFloat();

        System.out.println("Informe a corrente em Amperes: ");
        amperes = scanner.nextFloat();

        ohms = volts / amperes;


        System.out.println("Resultado da resitência em Ohms: " + ohms+" Ω");


    }

}

