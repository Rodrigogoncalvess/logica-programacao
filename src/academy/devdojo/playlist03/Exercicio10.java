package academy.devdojo.playlist03;
/*
Apresentar ao usuário uma tela solicitando um login e depois uma senha, o usuário
e senha corretos devem estar armazenados em constantes no seu programa. Se o
usuário acertar o usuário e a senha exibir a mensagem ACESSO CONCEDIDO,
caso contrário exibir a mensagem ACESSO NEGADO e voltar a pedir o usuário e
senha, essa condição deve-se repetir até que o usuário acerte a combinação.
11) Equação
 */
import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {

        final String login = "Rodrigo";
        final String senha = "1234";

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Digite login");
            String loginDigitado = scanner.nextLine();
            System.out.println("Digite senha");
            String passwordDigitado = scanner.nextLine();
            if ((login.equals(loginDigitado)) && (senha.equals(passwordDigitado))) {
                System.out.println("ACESSO CONCEDIDO");
                break;
            }
            System.out.println("ACESSO NEGADO");
        }

    }
}
