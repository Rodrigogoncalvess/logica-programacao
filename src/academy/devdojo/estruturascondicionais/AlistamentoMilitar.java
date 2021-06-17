package academy.devdojo.estruturascondicionais;

import java.util.Scanner;

public class AlistamentoMilitar {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite seu sexo e idade: ");
        String sexo = scan.next();
        int idade = scan.nextInt();
        if (sexo.equalsIgnoreCase("M") && idade >= 18) {
            System.out.println("Alistamento obrigatório!");
        } else if (sexo.equalsIgnoreCase("F") && idade >= 18) {
            System.out.println("Sra. deseja se alista?");

        } else {
            System.out.println("Alistamento não permitido");
        }

//        char sexo = 'F';
//        int idade = 17;
//
//        if ((sexo == 'F' || sexo == 'M') && idade < 18) {
//            System.out.println("Alistamento não permitido!");
//        } else if (sexo == 'M' && idade >= 18) {
//            System.out.println("Alistamento obrigatório!");
//        } else if (sexo == 'F' && idade >= 18)
//            System.out.println("Deseja se alistar?");
//    }

    }
}
