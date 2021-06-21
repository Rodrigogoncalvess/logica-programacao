package academy.devdojo.playlist02;
/*
Desenvolva uma calculadora de IMC (Índice de Massa Corporal), após
realizado o cálculo e classificar o paciente de acordo com a tabela abaixo.
Para realizar o cálculo de IMC utilize a fórmula abaixo:

𝐼𝑀𝐶 = 𝑃𝐸𝑆𝑂
      𝐴𝐿𝑇𝑈𝑅𝐴 2
 */

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {

        double imc;
        double peso;
        double altura;


        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe seu peso:");
        peso = scanner.nextDouble();

        System.out.println("Informe sua altura:");
        altura = scanner.nextDouble();

        imc = peso / Math.pow(altura, 2);
        System.out.printf("Índice de massa corporal: %.2f ", imc);

        if (imc < 10) {
            System.out.println("Desnutrição Grau V");
        } else if (imc >= 10 && imc <= 12.9) {
            System.out.println("Desnutrição Grau IV");
        } else if (imc >= 13 && imc <= 15.9) {
            System.out.println("Desnutrição Grau III");
        } else if (imc >= 16 && imc <= 16.9) {
            System.out.println("Desnutrição Grau II");
        } else if (imc >= 17 && imc <= 18.4) {
            System.out.println("Desnutrição Grau I");
        } else if (imc >= 18.5 && imc <= 24.9) {
            System.out.println("Normal");
        } else if (imc >= 25 && imc <= 29.9) {
            System.out.println("Pré obesidade");
        } else if (imc >= 30 && imc <= 34.5) {
            System.out.println("Obesidade Grau I");
        } else if (imc >= 35 && imc <= 39.9) {
            System.out.println("Obesidade Grau II");
        } else if (imc > 40) {
            System.out.println("Obesidade Grau III");
        }

    }
}



