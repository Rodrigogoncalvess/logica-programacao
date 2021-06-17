package academy.devdojo.estruturascondicionais;

import java.util.Scanner;

public class TorneioDeNatacao {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome do participante:");
        String nome = scanner.next();
        System.out.println("Digite a idade do participante:");
        int idade = scanner.nextInt();



        if (idade <= 10) {
            System.out.println(nome  + " Participará da categoria Infantil");
        } else if (idade >= 11 && idade <= 15) {
            System.out.println(nome  + " Participará da categoria Juvenil");
        } else if (idade >= 16 && idade <= 19) {
            System.out.println(nome  + " Participará da categoria Pré-adulto");
        } else {
            System.out.println(nome + "Participará da categoria Adulto");
        }

    }


}
