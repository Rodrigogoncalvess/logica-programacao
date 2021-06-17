/*
Dado um determinado salário
Se o salário for maior que 4500 imprima 30% do valor senão imprima 15% do valor
Desafio: Utilize apenas uma variável para guarda o resultado final e imrimir na tela
Desafio 2: Diga na impressão se é 30% ou 15%
 */

public class Salario {
    public static void main(String[] args) {

        float salario = 3500.50F;
        float resultado = 0;
        String porcentagem = "";

        if (salario > 4500) {
            resultado = salario * 0.3F;
            porcentagem = "30%";
        } else {
            resultado = salario * 0.15F;
            porcentagem = "15%";
        }
        System.out.println("Resultado final é " + resultado + " onde foi descontado " + porcentagem);


    }
}


