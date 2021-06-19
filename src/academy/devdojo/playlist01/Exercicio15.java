package academy.devdojo.playlist01;
/*
Construa um programa que calcule a velocidade em metros por segundo de um
projétil que percorre uma distância em quilômetros a um espaço de tempo em
minutos, utilize a fórmula abaixo:
𝑉 = (𝐷 · 1000) ÷ (𝑇 · 60)
Onde:
V = Velocidade em m/s
D = Distância
T = Tempo
 */


import javax.swing.*;

public class Exercicio15 {
    public static void main(String[] args) {

        double velocidade;
        double distancia;
        double tempo;

        JOptionPane.showMessageDialog(null, "Programa para informa a velocidade do projétil ");
        distancia = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a distância em que o projétil percorreu: "));

        tempo = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o tempo que o projétil percorreu: "));
        velocidade = (distancia * 1000) / (tempo * 60);

        JOptionPane.showMessageDialog(null, String.format("Velocidade em metros por segundo:%.2f ", velocidade));
    }
}
