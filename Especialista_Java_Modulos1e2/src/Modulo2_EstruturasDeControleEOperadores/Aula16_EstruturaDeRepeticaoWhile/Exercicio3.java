package Modulo2_EstruturasDeControleEOperadores.Aula16_EstruturaDeRepeticaoWhile;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int somaNumeros = 0;

       while (somaNumeros < 100){
           System.out.println("Digite um número:");
           int numero = sc.nextInt();

           somaNumeros +=numero;
       }
        System.out.printf("Soma dos números: %d%n ",somaNumeros);
    }
}
