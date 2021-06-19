package academy.devdojo.playlist01;
/*
Elaborar um programa que leia o salário base mensal (SB) de um funcionário e o
percentual de reajuste (PR) e calcule e apresente o novo valor de salário do
funcionário. A fórmula abaixo é uma sugestão de como esse cálculo pode ser feito:
𝑁𝑆 = 𝑆𝐵 + (𝑆𝐵 * 𝑃𝑅) ÷ 100
Onde:
NS = Novo Salário
SB = Salário Base
PR = Percentual de Reajuste
 */

import javax.swing.*;

public class Exercicio13 {
    public static void main(String[] args) {

        double salariBase;
        double reajuste;
        double novoSalario;

       salariBase = Double.parseDouble(JOptionPane.showInputDialog( "Informe o salário base: "));
       reajuste = Double.parseDouble(JOptionPane.showInputDialog( "Informe o percentual do reajuste: "));
        novoSalario=salariBase+(salariBase*reajuste)/100;

        JOptionPane.showMessageDialog(null,String.format("Novo salário após o reajuste: %.2f ", novoSalario));

    }
}
