package Modulo1_Fundamentos_Java.Aula2_OperadoresAritmeticos;

public class OperadoresAritmeticos {
    public static void main(String[] args) {
        /*Operadores de soma*/

        System.out.println("Somando dois números:");
        int somaDoisNumeros = 19 + 10;
        System.out.println("O resultado da soma é " + somaDoisNumeros);

        System.out.println("Somando duas variáveis:");
        int variavelUm = 32;
        int variavelDois = 32;
        int somaDuasVariaveis = variavelUm + variavelDois;
        System.out.println("O resultado da soma de duas variáveis é: "+ somaDuasVariaveis);

        System.out.println("Somando duas variáveis com números juntos:");
        int variavel1 = 10;
        int variavel2 = 15;
        int somaVariavelComNumeros = variavel1 + variavel2 + 20;
        System.out.println("A soma das varivaeis mais o número é de " + somaVariavelComNumeros);

        System.out.println("A mesma coisa pode se fazer com subtração,multiplicação e divisão");

        System.out.println("Usando módulo:Módulo é o resto da divisão representado por %:");
        int restoDivisao = 7 % 2;
        System.out.println(restoDivisao);
    }


}
