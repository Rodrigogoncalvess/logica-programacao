package academy.devdojo.switchcase;

public class TipoDeConta {
    public static void main(String[] args) {

        int tipoConta = 3;


        switch (tipoConta) {
            case 1:
                System.out.println("CONTA_POUPANÇA 0.05%");
                break;
            case 2:
                System.out.println("CONTA_CORRENTE 0.02%");
                break;
            case 3:
                System.out.println("CONTA_INVESTIMENTO 0.02%");
                break;
            default:
                System.out.println("Conta inexistente!");
        }


        String conta = "CONTA_POUPANCA";

        switch (conta){
            case "CONTA_POUPANCA":
                System.out.println("0.02%");
                break;
            case "CONTA_CORRENTE":
                System.out.println("0.02%");
            break;
            case "CONTA_INVESTIMENTO":
                System.out.println("0.01%");
                break;
            default:
                System.out.println("CONTA INEXISTENTE");
        }

    }
}