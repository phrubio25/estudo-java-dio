import java.sql.Date;

public class Operadores {
    public static void main(String[] args) throws Exception {
       
        //(+) Operador unário de valor positivo
        //(-) Operador unário de valor negativo
        //(++) Operador unário de incremtento de valor
        //(--) Operador unário de decremento de valor
        //(!) Operador unário de negação

        //O operador ternário é representado pelos simbolos ?: utilizados na seguinte estrutura de sintaxe:
        int a, b;

        a = 5;
        b = 5;

        String resultado = a==b ? "verdadeiro": "falso";

        //if (a==b) 
        //    resultado = "verdadeiro";
        //else 
        //    resultado = "falso";

        System.out.println(resultado);
    }
}
