package Modulo1_Fundamentos_Java.Aula11_PromocaoAritmetica;

public class PromocaoAritmetica {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        int z = x * y;
        System.out.println("Aqui vai compilar normal "+ z);
        System.out.println("________________________________");


        int a = 10;
        long b = 5;
        int r = (int) (a * b);
        System.out.println("Aqui não compila sem o casting "+r);/*Aqui não compila sem o casting pq quando é realizada operações aritméticas de variáveis
        de tipos diferentes o resultado da operação é sempre atribuido ao tipo maior (long 64 bytes nesse caso) e isso
        é o que chamamos de promoção aritmética,o correto é atrinuirmos o resultado sempre ao tipo maior,conforme exemplo abaixo*/
        System.out.println("________________________________");

        int v1 = 10;
        long v2 = 5;
        long resultado = v1 *v2;

        System.out.println("Aqui compila normal pois o resultado da expressão também é long "+resultado);
    }
}
