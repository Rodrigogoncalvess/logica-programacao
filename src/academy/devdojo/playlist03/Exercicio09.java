package academy.devdojo.playlist03;

import java.util.Scanner;

/*
Melhore a calculadora desenvolvida anteriormente acrescentando as seguintes
funcionalidades:
a) Sempre ao final de um cálculo a calculadora deve mostrar o menu
novamente.
b) Acrescentar uma opção para sair da calculadora, como sugestão, quando o
usuário digitar 0 (zero) por exemplo, a calculadora deve ser encerrada.
 */
public class Exercicio09 {
    public static void main(String[] args) {

        int numero;
        int opcao=1 ;


        Scanner scanner = new Scanner(System.in);


        while (opcao <= 5 && opcao>0) {

            System.out.println("Opção 1 tabuada de adição" + "\n"
                    + "Opção 2 tabuada subtração" + "\n"
                    + "Opção 3 tabuada multiplicação"
                    + "\n" + "Opção 4 tabuada divisão\n" + "Opção 0 sair\n");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("\nDigite o número que deseja obter a tabuada de adição ");
                    numero = scanner.nextInt();
                    for (int i = 1; i <= 10; i++) {
                        System.out.println(numero + " + " + i + " = " + (numero + i));
                    }
                    break;
                case 2:
                    System.out.println("\nDigite o número que deseja obter a tabuada de subtração ");
                    numero = scanner.nextInt();
                    for (int i = 1; i <= 10; i++) {
                        System.out.println((i + numero) + " - " + numero + " = " + ((numero + i) - numero));
                    }
                    break;
                case 3:
                    System.out.println("\nDigite o número que deseja obter a tabuada de multiplicação ");
                    numero = scanner.nextInt();
                    for (int i = 1; i <= 10; i++) {
                        System.out.println(numero + " x " + i + " = " + (numero * i));
                    }
                    break;
                case 4:
                    System.out.println("\nDigite o número que deseja obter a tabuada de divisão ");
                    numero = scanner.nextInt();
                    for (int i = 1; i <= 10; i++) {
                        System.out.println((i * numero) + " / " + numero + " = " + (i * numero / numero));
                    }
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opção inválida");


            }

        }
        System.out.println("Programa finalizado");

    }
}




