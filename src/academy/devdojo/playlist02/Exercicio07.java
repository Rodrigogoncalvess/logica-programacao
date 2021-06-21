package academy.devdojo.playlist02;
/*
Desenvolva uma rotina que leia dois valores numéricos inteiros e apresente o
resultado das quatro operações aritméticas básicas (adição, subtração, multiplicação
e divisão).
 */

import javax.swing.*;

public class Exercicio7 {
    public static void main(String[] args) {

        int numero1;
        int numero2;
        int calculo;
        int opcao = 0;


        while (opcao != 5) {
            JOptionPane.showMessageDialog(null, "Opção 1 para adição (+)" + "\n"
                    + "Opção 2 para subtração (-)" + "\n"
                    + "Opção 3 para multiplicação (*)" + "\n"
                    + "Opção 4 para divisão (/)" + "\n"
                    + "\n" + "Opção 5 para sair.");

            opcao = Integer.parseInt(JOptionPane.showInputDialog("Digite um das opçoes"));

            switch (opcao) {
                case 1:
                    numero1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o primeiro número: "));
                    numero2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o segundo número: "));
                    System.out.println("Informe o segundo número: ");
                    calculo = numero1 + numero2;
                    JOptionPane.showMessageDialog(null, "A soma dos números informados é: " + calculo);
                    break;
                case 2:
                    numero1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o primeiro número: "));
                    numero2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o segundo número: "));
                    calculo = numero1 - numero2;
                    JOptionPane.showMessageDialog(null, "A subritação dos números informados é: " + calculo);
                    break;
                case 3:
                    numero1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o primeiro número: "));
                    numero2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o segundo número: "));
                    calculo = numero1 * numero2;
                    JOptionPane.showMessageDialog(null, "A multiplicação dos números informados é: " + calculo);
                    break;

                case 4:
                    numero1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o primeiro número: "));
                    numero2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o segundo número: "));
                    calculo = numero1 / numero2;
                    JOptionPane.showMessageDialog(null, "A divisão dos números informados é: " + calculo);
                    break;
                case 5:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida");
                    break;
            }
        }
        JOptionPane.showMessageDialog(null, "Finalizado");
    }

}

