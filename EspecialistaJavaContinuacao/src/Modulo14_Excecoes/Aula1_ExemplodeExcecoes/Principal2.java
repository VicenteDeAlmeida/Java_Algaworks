package Modulo14_Excecoes.Aula1_ExemplodeExcecoes;

public class Principal2 {

    public static void main(String[] args) {

        System.out.println("Início");

        int [] numeros = {1,3,5,7};
        System.out.println(numeros[10]); /*Aqui vai lançar exceção pois não temos a posição 10 do array*/

        System.out.println("Fim");
    }
}
