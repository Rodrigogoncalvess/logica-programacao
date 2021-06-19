package academy.devdojo.playlist01;
/*
Ler valores para as variáveis x e y, trocar os valores das variáveis e apresentar o
resultado dos valores invertidos.
 */
import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {

        int var1;
        int var2;
        int trocar;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o valor da variável 1:");
        var1= scanner.nextInt();
        System.out.println("Informe o valor da variável 2:");
        var2 = scanner.nextInt();

        trocar = var1;
        var1 = var2;
        var2 = trocar;

        System.out.println("Valor de variável 1 é: "+var1);
        System.out.println("Valor de variável 2 é: "+var2);

    }
}
