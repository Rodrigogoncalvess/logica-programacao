package academy.devdojo.playlist01;

/*Efetuar o cálculo de quantos litros de combustível um automóvel consome em uma
viagem. Sabendo que o automóvel tem uma autonomia de 12 Km por litro de
combustível, desenvolva o cálculo utilizando a fórmula abaixo:
 */
import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {

        double litro;
        double distancia;
        final double autonomia = 12;


        Scanner imput = new Scanner(System.in);
        System.out.println("Infomer a distância a percorrer: ");
        distancia = imput.nextDouble();

        litro = distancia / autonomia;
        System.out.printf("Consumo do veículo", litro);

    }

}

