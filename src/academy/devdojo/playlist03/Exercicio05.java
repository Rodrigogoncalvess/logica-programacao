package academy.devdojo.playlist03;

/*
Elaborar um programa que apresente a sequência de Fibonacci até o décimo quinto
termo.
 */
public class Exercicio05 {
    public static void main(String[] args) {

        int num1 = 1;
        int num2 = 0;

        for (int i = 0; i < 15; i++) {
            num1 = num1 + num2;
            num2 = num1 - num2;
            System.out.println(num1);

        }
    }

}



