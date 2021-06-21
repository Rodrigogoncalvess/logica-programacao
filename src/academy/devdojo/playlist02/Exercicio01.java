package academy.devdojo.playlist02;
/*
Desenvolva um rotina que leia as notas de quatro bimestres de um aluno
(N1, N2, N3 e N4), e informe o status do aluno baseado na tabela abaixo:
Média Status
Se a média for menor que 50 REPROVADO
Se a média for igual a 50 RECUPERAÇÃO
Se a média for maior que 50 APROVADO
 */

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {

        int n1, n2, n3, n4;
        int media;

        Scanner ent = new Scanner(System.in);

        System.out.println("Digite a 1ª nota do aluno");
        n1 = ent.nextInt();

        System.out.println("Digite a 2ª nota do aluno");
        n2 = ent.nextInt();

        System.out.println("Digite a 3ª nota do aluno");
        n3 = ent.nextInt();

        System.out.println("Digite a 4ª nota do aluno");
        n4 = ent.nextInt();

        media = (n1 + n2 + n3 + n4) / 4;
        System.out.println("A média do aluno é: " + media);


        if (media < 50) {
            System.out.println("REPROVADO");
        } else if (media == 50) {
            System.out.println("RECUPERAÇÃO");
        } else {
            System.out.println("APROVADO");
        }

    }
}
