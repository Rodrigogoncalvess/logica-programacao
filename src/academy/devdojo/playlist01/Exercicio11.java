package academy.devdojo.playlist01;
/*
Elaborar um programa que realize a conversão de US$ para R$, o programa deve
saber qual o valor da cotação do dólar e fazer a conversão.
 */

import javax.swing.*;

public class Exercicio11 {
    public static void main(String[] args) {

        double cotacao = 5.08;
        double real = 1;
        double dolar;
        double conversao;

        JOptionPane.showMessageDialog(null, "Valor da cotação do dolar: " + cotacao);

        dolar = Double.parseDouble(JOptionPane.showInputDialog("Informe qual a quantia em dolar que deseja converte para real? "));
        conversao = (cotacao * real) * dolar;

        JOptionPane.showMessageDialog(null, "Valor da conversão do dolar para o real é " + conversao);

    }
}
