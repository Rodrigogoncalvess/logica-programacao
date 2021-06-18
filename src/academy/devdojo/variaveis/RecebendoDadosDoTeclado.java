package academy.devdojo.variaveis;

import java.util.Scanner;

public class RecebendoDadosDoTeclado {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = scanner.next();
        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();
        System.out.println("Digite sua idade: ");
        System.out.println("Nome digitado foi: " + nome);
        System.out.println("Idade digitado foi: " + idade);


    }
}
