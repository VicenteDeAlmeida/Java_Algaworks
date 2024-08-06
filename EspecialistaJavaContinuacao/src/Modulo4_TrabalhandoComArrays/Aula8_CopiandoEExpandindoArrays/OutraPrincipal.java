package Modulo4_TrabalhandoComArrays.Aula8_CopiandoEExpandindoArrays;

import java.util.Arrays;

public class OutraPrincipal {
    public static void main(String[] args) {
        int[] numerosJogos = {12,25,36,93,96,100};

        System.out.println("Copiando o array");
        int[] numerosJogos2 = Arrays.copyOf(numerosJogos,3); /*Copiando 3 posições do array anterior,nesse caso ele faz a indexação
        não começando por zero.*/
        System.out.println(Arrays.toString(numerosJogos));
        System.out.println(Arrays.toString(numerosJogos2));

        System.out.println("Copiando o array completo");
        int [] numerosJogos3 = Arrays.copyOf(numerosJogos,numerosJogos.length);
        System.out.println(Arrays.toString(numerosJogos3));

        System.out.println("Expandindo o array,o java vai completar com 0 nesse caso");
        int [] numerosJogos4 = Arrays.copyOf(numerosJogos,numerosJogos.length+1);
        System.out.println(Arrays.toString(numerosJogos4));
        System.out.println("Preenchendo a posição zero com algum elemento");
        numerosJogos4[numerosJogos4.length -1] = 45;
        System.out.println(Arrays.toString(numerosJogos4));

    }
}
