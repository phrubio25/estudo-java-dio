import java.sql.Date;

public class Operadores {
    public static void main(String[] args) throws Exception {
        // == Quando desejamos verificar se uma variável é igual a outra
        // != Quando desejamos verificar se uma variável é diferente da outra
        // > Quando desejamos verificar se uma variável é maior que a outra
        // >= Quando desejamos verificar se uma variável é maior ou igual que a outra

        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        System.out.println("Numero1 é igual ao Número2?" + simNao);

        simNao = numero1 != numero2;

        System.out.println("Numero1 é diferente ao Número2?" + simNao);

        simNao = numero1 > numero2;

        System.out.println("Numero1 é maior ao Número2?" + simNao);


    }
}
