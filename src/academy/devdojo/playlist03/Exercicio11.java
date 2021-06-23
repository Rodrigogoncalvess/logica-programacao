package academy.devdojo.playlist03;

public class Exercicio11 {
    public static void main(String[] args) {


        int numero = 27;
        int numero2 = 1;
        int resultado = 0;


        while (numero > 0) {
            numero = numero - numero2;
            numero2 = numero2 + 3;
            resultado++;
        }
        System.out.println("Resultado da parte inteira da raiz quadrada: \n"+resultado);
        System.out.println("Raiz quadrada do resultado do número inteiro: \n"+(Math.pow(resultado, 2)));

    }

}
