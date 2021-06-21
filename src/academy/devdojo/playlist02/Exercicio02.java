package academy.devdojo.playlist02;
/*
Desenvolva uma rotina que dados três números inteiros, apresente-os em
ordem crescente
 */
import javax.swing.*;

public class Exercicio02 {
    public static void main(String[] args) {

        int numero1;
        int numero2;
        int numero3;
        int dados;

        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero 1"));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero 2"));
        numero3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero 3"));

        if (numero1 > numero2) {
            dados = numero1;
            numero1 = numero2;
            numero2 = dados;
        }
        if (numero2 > numero3) {
            dados = numero2;
            numero2 = numero3;
            numero3 = dados;
        }

        if (numero1 > numero2) {
            dados = numero1;
            numero1 = numero2;
            numero2 = dados;
        }

        JOptionPane.showMessageDialog(null, "Ordem crescente: " + numero1 + " " + numero2 + " " + numero3);

    }
}
