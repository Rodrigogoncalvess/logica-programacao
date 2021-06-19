package academy.devdojo.playlist01;
/*
Desenvolver um programa que apresente e calcule o volume de uma caixa
retangular, utilize a fórmula abaixo:
𝑉 = 𝐶 · 𝐿 · 𝐴
Onde:
V = Volume em 𝑐𝑚3
C = Comprimento
L = Largura
A = Altura
 */
import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {

        double volume;
        double comprimento;
        double largura;
        double altura;

        Scanner imput = new Scanner(System.in);
        System.out.println("Informe o comprimento da caixa: ");
        comprimento = imput.nextDouble();

        System.out.println("Informe a largura da caixa:");
        largura = imput.nextDouble();

        System.out.println("Informe a altura da caixa:");
        altura = imput.nextDouble();

        volume = (comprimento*largura)* altura;
        System.out.printf("Unidade medida: %.2f cm³", volume);


    }

}

