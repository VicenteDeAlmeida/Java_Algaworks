package Modulo4_TrabalhandoComArrays.Aula1_InicializandoArrays;

public class PrincipalArrays {
    public static void main(String[] args) {
        /*Array é um tipo de objeto capaz de armazenar um número fixo de valores de um único tipo.Ex de declaração de arrays*/

        int[] notas = new int[5]; /*Exemplo de arrays com cinco posições*/

        int[] notas1 = new int[]{89,90,100,63,85}; /*Exemplo de array passando a posição*/

        for (int nota : notas1) {
            System.out.println(nota);
        }



    }
}
