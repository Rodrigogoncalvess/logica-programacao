package academy.devdojo.playlist01;
/*
Sabendo que 1 ft é igual a 0,3048 m ou 30,48 cm, desenvolva um programa que leia
uma medida em pés e calcule o equivalente em metros.
 */

import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {

        double medida;
        double ft = 0.3048;
        double metro;

        Scanner imput = new Scanner(System.in);
        System.out.println("Informe a medida em pés que deseja converter para metros: ");
        medida = imput.nextDouble();
        metro = medida * ft;


        System.out.printf("conversão em metros: %.2f ", metro);


    }

}

