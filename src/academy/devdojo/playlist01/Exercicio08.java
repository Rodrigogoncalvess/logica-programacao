package academy.devdojo.playlist01;

import javax.swing.*;

/*
Calcular e apresentar o valor de uma prestação em atraso, utilize a fórmula abaixo:
𝑃 = 𝑉𝐴𝐿𝑂𝑅 + (𝑉𝐴𝐿𝑂𝑅 × (𝑇𝐴𝑋𝐴 ÷ 100) × 𝑇𝐸𝑀𝑃𝑂)
Onde P é o valor da prestação em atraso.
 */
public class Exercicio08 {
    public static void main(String[] args) {

        double valor=100;
        double taxa = 20;
        int tempo=10;
        double prestacao;

        prestacao=valor+(valor*taxa/100)*tempo;
        System.out.println(prestacao/tempo);


//        valor = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da prestação:"));
//        tempo = Integer.parseInt(JOptionPane.showInputDialog("Informe o tempo que a prestação está atrasada:"));
//
//
//        JOptionPane.showMessageDialog(null, valor + (valor * (taxa / 100) * tempo));


    }
}
