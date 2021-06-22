package academy.devdojo.playlist03;

/*
Elaborar um programa que apresente o somatório dos números na faixa de 1 até
500.
 */
public class Exercicio03 {
    public static void main(String[] args) {

        int soma = 0;

        System.out.print("A somatório do número 1 até 500 é: ");
        for (int i = 1; i <= 500; i++)
            soma += i;

        System.out.println(soma);
    }
}


