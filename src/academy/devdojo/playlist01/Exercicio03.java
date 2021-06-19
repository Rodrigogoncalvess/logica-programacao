package academy.devdojo.playlist01;
/*
Escreva um programa que realize a conversão de graus Celsius (C) para graus
Fahrenheit (F). Utilize a fórmula abaixo:
𝐹 = ( 9 × 𝐶) ÷ 5
 */
import javax.swing.*;

public class Exercicio03 {
    public static void main(String[] args) {

        double grauCelsius = 45.7;
        double grauFahrenheit;

        grauCelsius=Double.parseDouble(JOptionPane.showInputDialog("Informe o graus Celsius"));
        //Ao pesquisar encontrei essa fórmula (0 °C × 9/5) + 32 que acabei aplicando, diferente do exercício que não incluia o +32.
        grauFahrenheit =(9*grauCelsius/5)+32;

        JOptionPane.showMessageDialog(null,"Conversão para graus Fahrenheit é : "+grauFahrenheit);
//        System.out.println("Conversão para graus Fahrenheit é :: "+grauFahrenheit);
    }
}
