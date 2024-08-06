package Modulo1_Fundamentos_Java.Aula4_Abreviando_Operadores_Aritmeticos;

public class AbreviandoOperadoresAritmeticos {
    public static void main(String[] args) {
        int quantidadeProdutos = 10;
        /*Atribuindo um cálculo a variável. */
        quantidadeProdutos = quantidadeProdutos + 3;

        System.out.println(quantidadeProdutos);

        System.out.println("O que foi feito acima pode ser feito de forma mais simples:");

        int quantidadeProdutos1 = 10;
        quantidadeProdutos1 += 3;

        System.out.println(quantidadeProdutos1);

        System.out.println("Posso fazer com todos os operadores aritméticos(multiplicação,divisão,subtração)");
    }
}
