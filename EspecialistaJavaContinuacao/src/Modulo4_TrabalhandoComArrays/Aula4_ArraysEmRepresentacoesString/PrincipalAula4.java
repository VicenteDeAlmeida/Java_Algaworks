package Modulo4_TrabalhandoComArrays.Aula4_ArraysEmRepresentacoesString;

import java.util.Arrays;

public class PrincipalAula4 {
    public static void main(String[] args) {

        int[] notas = {32, 58, 96, 100, 98};
        System.out.println("Se eu imprimir na tela assim só aparecerão os valores do tipo e hashcode "+ notas);

        String notasEmString = Arrays.toString(notas);
        System.out.println("Convertendo os ints do array para string "+ notasEmString);
        System.out.println("Outra maneira sem atribuir a uma variável: " + Arrays.toString(notas));
    }
}
