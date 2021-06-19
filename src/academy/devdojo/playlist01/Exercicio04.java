package academy.devdojo.playlist01;
/*
Escreva um programa que realize a conversão de graus Fahrenheit (F) para graus
Celsius (C). Utilize a fórmula abaixo:
𝐶 = (( 𝐹 − 32) × 5) ÷ 9
 */
import javax.swing.*;

public class Exercicio04 {
    public static void main(String[] args) {

        double grauCelsius ;
        double grauFahrenheit = 113;

        grauFahrenheit=Double.parseDouble(JOptionPane.showInputDialog("Informe o graus Fahrenheit"));
        //Ao pesquisar encontrei essa fórmula (0 °C × 9/5) + 32 que acabei aplicando, diferente do exercício que não incluia o +32.
        grauCelsius =((grauFahrenheit-32)*5)/9;

        JOptionPane.showMessageDialog(null,"Conversão para graus Celsius é : "+grauCelsius);
//        System.out.println("Conversão para graus Celsius é : "+grauCelsius);
    }
}
