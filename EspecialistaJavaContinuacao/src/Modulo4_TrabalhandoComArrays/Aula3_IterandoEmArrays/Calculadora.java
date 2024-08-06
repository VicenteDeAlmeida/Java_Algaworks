package Modulo4_TrabalhandoComArrays.Aula3_IterandoEmArrays;

public class Calculadora {

    static double calcularMedia(int[] numeros){
        int total = 0;

        for (int numero : numeros) {
            total += numero;

        }
        return (double) total / numeros.length;
    }
}
