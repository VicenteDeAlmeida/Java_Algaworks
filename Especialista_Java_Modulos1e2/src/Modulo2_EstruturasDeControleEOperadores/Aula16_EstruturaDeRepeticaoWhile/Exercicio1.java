package Modulo2_EstruturasDeControleEOperadores.Aula16_EstruturaDeRepeticaoWhile;
/**
 * Escreva um programa que solicita 10 números para o usuário e imprime na saída a soma dos números digitados.
 * Permita que o usuário digite apenas números pares. Caso um número ímpar seja informado, ignore e solicite um novo número ao usuário.*/

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = 10;
        int soma = 0;

        for (int i = 1; i <= numero; i++) {
            System.out.printf("Digite o número %d: ", i);
            int numeroDigitado = sc.nextInt();
            if (numeroDigitado % 2 != 0){
                System.out.println("São aceitos somente números pares.");
                i--;
            }else {
            soma += numeroDigitado;
            }
        }
        System.out.println("Resultado = "+soma);
    }
}
