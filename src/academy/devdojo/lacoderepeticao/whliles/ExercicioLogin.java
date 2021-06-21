package academy.devdojo.lacoderepeticao.whliles;

import java.util.Scanner;

public class ExercicioLogin {
    public static void main(String[] args) {

        final String login = "Rodrigo";
        final String password = "Teste";

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Digite login");
            String loginDigitado = scanner.nextLine();
            System.out.println("Digite password");
            String passwordDigitado = scanner.nextLine();
            if ((login.equals(loginDigitado)) && (password.equals(passwordDigitado))) {
                System.out.println("Acesso permitido");
                break;
            }
            System.out.println("Acesso negado");
        }
        System.out.println("Programa terminado");
    }
}
