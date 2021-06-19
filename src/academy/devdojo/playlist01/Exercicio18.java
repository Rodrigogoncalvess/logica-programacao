package academy.devdojo.playlist01;
/*
Desenvolva uma rotina que dado um número inteiro qualquer calcule seu antecessor
e seu sucessor.
 */

import javax.swing.*;

public class Exercicio18 {
    public static void main(String[] args) {

        int numero;
        int antecessor;
        int sucessor;


        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
        antecessor = numero - 1;
        sucessor = numero + 1;
        JOptionPane.showMessageDialog(null,
                "O valor do antecessor: " + antecessor + "\n" +
                        "O valor do sucessor: " + sucessor);
    }


}
