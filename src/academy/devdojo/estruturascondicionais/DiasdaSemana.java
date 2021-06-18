package academy.devdojo.estruturascondicionais;

//Receba um número inteiro do usuário é imprima o dia da semana correspondente
//Sendo 1 segunda-feira
public class DiasdaSemana {
    public static void main(String[] args) {

        int dia = 5;

        if (dia == 1) {
            System.out.println("Segunda-Feira");
        } else if (dia == 2) {
            System.out.println("Terça-Feira");
        } else if (dia == 3) {
            System.out.println("Quarta-Feira");
        } else if (dia == 4) {
            System.out.println("Quinta-Feira");
        } else if (dia == 5) {
            System.out.println("Sexta-Feira");
        } else if (dia == 6) {
            System.out.println("Sábado");
        } else if (dia == 7) {
            System.out.println("Domingo");
        }else {
            System.out.println("Dia inválido");
        }
    }
}