package academy.devdojo.playlist01;
/*
Fazer a leitura de um valor numérico inteiro e apresentar o valor do número elevado
ao quadrado, ao cubo e a 10, apresentar também a soma total dos três resultados
anteriores.
 */

public class Exercicio10 {
    public static void main(String[] args) {

        int valor = 4;
        double quadrado =Math.pow(valor,2);
        double cubo =Math.pow(valor,4);
        double elevado =Math.pow(valor,10);
        double resultado;



        if(valor!=0){
            System.out.println("Número elevado a segunda potência: "+quadrado +"\n");
            System.out.println("Número elevado a quarta potência: "+cubo+"\n");
            System.out.println("Número elevado a décima potência: "+elevado+"\n");
          resultado=quadrado+cubo+elevado;
            System.out.println("Resultado da soma dos três: "+resultado);
        }else{
            System.out.println("Qualquer número elevado a zero, o resutaldo final é 1!" );
        }

    }

}

