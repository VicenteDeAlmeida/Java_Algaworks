package Modulo4_TrabalhandoComArrays.Aula5_OrdenandoArrays;

import java.util.Arrays;
import java.util.Comparator;

public class PrincipalAula5 {
    public static void main(String[] args) {
        int[] notas = {12,69,63,100,25};
        System.out.println("Método sort para ordenar em ordem crescente os valores do array.");
        Arrays.sort(notas);

        Integer[] notas1 = {100,200,500,900,1020};
        System.out.println("Usando a classe Comparator juntamente com o método reverse order para imprimir a ordem decresente do array." +
            "Como se trata de uma classe ele só aceita o array com classe wrapper");
        Arrays.sort(notas1, Comparator.reverseOrder());


        System.out.println(Arrays.toString(notas));
        System.out.println(Arrays.toString(notas1));


    }


}
