package Modulo2_EstruturasDeControleEOperadores.Aula6_PrecedenciaDeOperadores;

public class PrecedenciaOperadores {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;

        boolean resultado = x == 13 && x == 15 || y ==20;/*Quando não temos os parênteses para precedência o java executa primeiro o &&
        é sempre bom colocar os parenteses*/
        System.out.println(resultado);
    }
}
