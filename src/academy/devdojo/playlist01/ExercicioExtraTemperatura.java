package academy.devdojo.playlist01;


import java.util.Scanner;

public class ExercicioExtraTemperatura {
    public static void main(String[] args) {

        double grauCelsius;
        double grauFahrenheit;
        int opcao = 0;


        Scanner scanner = new Scanner(System.in);

        while (opcao != 3) {
            System.out.println("Opção 1 para conversão para graus Celsius" + "\n"
                    + "Opção 2 para conversão para graus Fahrenheit"
                    + "\n" + "Opção 3 para sair.");
            opcao = scanner.nextInt();


            switch (opcao) {
                case 1:
                    System.out.println("Informe o graus Celsius: ");
                    grauCelsius = scanner.nextDouble();
                    grauFahrenheit = (9 * grauCelsius / 5) + 32;
                    System.out.println("Conversão para graus Fahrenheit é: " + grauFahrenheit);
                    break;

                case 2:
                    System.out.println("Informe o graus Fahrenheit: ");
                    grauFahrenheit = scanner.nextDouble();
                    grauCelsius = ((grauFahrenheit - 32) * 5) / 9;
                    System.out.println("Conversão para graus Fahrenheit é: " + grauCelsius);
                    break;
                case 3:
                    break;

                default:
                    System.out.println("\nOpção inválida\n");
            }

        }
        System.out.println("\n" + "Finalizado");


    }

}

