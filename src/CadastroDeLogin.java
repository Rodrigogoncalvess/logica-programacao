import java.util.Scanner;

public class CadastroDeLogin {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = scanner.next();

        if (nome.equals("") || nome.equalsIgnoreCase("admin")||nome.equalsIgnoreCase("administrador")){
            System.out.println("Usuário inválido");
        }else {
            System.out.println(nome +"\nCadastrado com sucesso");
        }
    }
}
