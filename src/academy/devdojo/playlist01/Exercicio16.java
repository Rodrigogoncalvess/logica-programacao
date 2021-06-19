package academy.devdojo.playlist01;
/*
Escreva uma rotina capaz de calcular e apresentar o valor do volume de uma lata de
óleo, utilize a fórmula abaixo.
𝑉 = π𝑅 2 × 𝐴
Onde:
V = Volume
π= 3.141592654
R = Raio da circunferência da lata
A = Altura da lata
OBS: O volume deve ser apresentado com a unidade de medida correto 𝑐𝑚 .
 */
import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {

        double volume;
        final double pi = 3.141592654;
        double raio;
        double altura;

        Scanner imput = new Scanner(System.in);
        System.out.println("Informe altura da lata: ");
        altura = imput.nextDouble();

        System.out.println("Informe a circunferência da lata :");
        raio = imput.nextDouble();

        volume = pi * (raio * raio) * altura;
        System.out.printf("Unidade medida: %.2f cm³", volume);


    }

}

