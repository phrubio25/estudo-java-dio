public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        byte idade = 123;
        short ano = 2024;
        int cep = 12345678;
        long cpf = 12345678989l;   //é necessário terminar com 'l' seja maiusculo ou minusculo, para que ele não seja considerado um inteiro.
        float pi = 3.14f;    //é necessário terminar com 'F' seja maiusculo ou minusculo, para que não haja confusão com o double.
        double salario = 5000.30;

        final double VALOR_DE_PI = 3.14;     // "fINAL" no começo da variável torna ela defintiva, ou seja, não podendo mudar ao longo do código. E a variável tem que ser escrita em caixa alta.
    }
}
