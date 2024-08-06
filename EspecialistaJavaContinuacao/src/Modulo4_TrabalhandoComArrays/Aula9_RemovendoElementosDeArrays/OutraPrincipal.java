package Modulo4_TrabalhandoComArrays.Aula9_RemovendoElementosDeArrays;

import java.util.Arrays;

public class OutraPrincipal {
    public static void main(String[] args) {
        int[] numerosJogosAtual = {12,25,36,93,96,100};
        int[] numerosJogosAtual1 = new int[numerosJogosAtual.length -1];
        System.arraycopy(numerosJogosAtual,0,numerosJogosAtual1,0,2);
        System.arraycopy(numerosJogosAtual,3,numerosJogosAtual1,2,3);
        System.out.println(Arrays.toString(numerosJogosAtual));
        System.out.println(Arrays.toString(numerosJogosAtual1));



    }
}
