package academy.devdojo.playlist03;

/*
Elaborar uma rotina que apresente todos os números pares na faixa de 0 até 100.
 */
public class Exercicio04 {
    public static void main(String[] args) {


        System.out.println("Números pares na faxia 1 à 100");
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0)
                System.out.println(i);
        }
    }
}


