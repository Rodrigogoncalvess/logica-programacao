package academy.devdojo.lacoderepeticao.whiles;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {

        int opcao = 0;

        Scanner scanner = new Scanner(System.in);
        while (opcao != 3) {
            System.out.println("1 - Calcular imposto");
            System.out.println("2 - Depositar salário");
            System.out.println("3 - Sair");
            System.out.println("Digite sua opção:");
            opcao = scanner.nextInt();
        }
        System.out.println("Operação finalizada");
    }
}
