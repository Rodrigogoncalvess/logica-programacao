package academy.devdojo.estruturascondicionais;/*
Dado determinado numero inteiro
Imprima se ele é ímpar ou par
Resto da divisão por 2 ser for par sempre vai ser 0 senão vai ser ímpar
 */

public class ValidacaoNumero {
    public static void main(String[] args) {

        int nummero = 34;

        if (nummero % 2 == 0) {
            System.out.println("Numero Par");
        } else {
            System.out.println("Numero Impar");
        }

    }

}
