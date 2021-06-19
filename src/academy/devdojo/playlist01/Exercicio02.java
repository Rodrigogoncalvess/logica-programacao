package academy.devdojo.playlist01;
/*
Baseado nas fórmulas abaixo, desenvolva uma rotina que calcule o salário líquido
de um funcionário. Após o cálculo, o programa deve apresentar o salário base e o
salário líquido calculado.
𝑆𝐵 = 𝐻𝑇 * 𝑉𝐻
𝑇𝐷 = (𝑃𝐷 / 100) * 𝑆𝐵
𝑆𝐿 = 𝑆𝐵 − 𝑇𝐷
Onde:
SB = Salário Base
HT = Horas Trabalhadas
VH = Valor Hora de trabalho
TD = Total de Descontos
PD = Percentual de Desconto
SL = Salário Líquido
 */

import javax.swing.*;

public class Exercicio02 {
    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);

        double salarioBase;
        double horasTrabalhadas;
        double valorHoraTrabalhada;
        double totalDesconto;
        double percentualDesconto;
        double salarioLiquido;

//        System.out.println("Informe total de horas trabalhada: ");
//        horasTrabalhadas = scanner.nextDouble();
        horasTrabalhadas = Double.parseDouble(JOptionPane.showInputDialog("Informe total de horas trabalhada: ")
        );

//        System.out.println("Informe o valor da hora trabalhada");
//        valorHoraTrabalhada = scanner.nextDouble();
        valorHoraTrabalhada = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da hora trabalhada"));

//        System.out.println("Informe o percentual de desconto");
//        percentualDesconto = scanner.nextDouble();
        percentualDesconto = Double.parseDouble(JOptionPane.showInputDialog("Informe o percentual de desconto"));

        salarioBase = horasTrabalhadas*valorHoraTrabalhada;
        totalDesconto = (percentualDesconto/100)*salarioBase;
        salarioLiquido =salarioBase-totalDesconto;

//        System.out.println("Salário base: "+salarioBase);
        JOptionPane.showMessageDialog(null,"Salário base: "+salarioBase);

//        System.out.println("Salário líquido: "+salarioLiquido);
        JOptionPane.showMessageDialog(null,"Salário líquido: "+salarioLiquido);


    }
}
