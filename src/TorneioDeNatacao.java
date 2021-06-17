public class TorneioDeNatacao {
    public static void main(String[] args) {

        String nome = "Rodrigo ";
        int idade = 16;

        if (idade <= 10) {
            System.out.println(nome + "Participará da categoria Infantil");
        } else if (idade >= 11 && idade <= 15) {
            System.out.println(nome + "Participará da categoria Juvenil");
        } else if (idade >= 16 && idade <= 19) {
            System.out.println(nome + "Participará da categoria Pré-adulto");
        } else {
            System.out.println(nome + "Participará da categoria Adulto");
        }
    }


}
