package academy.devdojo.playlist01;
/*
Elaborar um programa que realize a conversão de R$ para US$, o programa deve
saber qual o valor da cotação do dólar e fazer a conversão.
 */

import javax.swing.*;

public class Exercicio12 {
    public static void main(String[] args) {

        double cotacao = 5.08;
        double real;
        double dolar = 1;
        double conversao;


        JOptionPane.showMessageDialog(null, "Valor da cotação do dolar: " + cotacao);

        real = Double.parseDouble(JOptionPane.showInputDialog("Informe qual a quantia em real que deseja converte para dolar? "));
        conversao = (real/cotacao)*dolar;

        JOptionPane.showMessageDialog(null, String.format("Valor da conversão do real para o dolar é %.3f" , conversao));

    }
}
