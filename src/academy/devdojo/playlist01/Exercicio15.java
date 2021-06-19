package academy.devdojo.playlist01;

public class Exercicio01 {
    public static void main(String[] args) {

        double area;
        final double pi = 3.141592654;
        double raio = -1;

        if (raio > 0) {
            area = pi * (raio*raio);
            System.out.printf("Area do circulo é : "+area);
        }else {
            System.out.println("Raio do circulo não pode ser <= 0!");


        }

    }
}
