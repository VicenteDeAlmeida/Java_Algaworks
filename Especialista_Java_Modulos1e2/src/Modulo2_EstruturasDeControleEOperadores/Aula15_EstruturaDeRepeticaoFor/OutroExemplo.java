package Modulo2_EstruturasDeControleEOperadores.Aula15_EstruturaDeRepeticaoFor;

import java.util.Scanner;

/**
 * Escreva um programa Java que solicite ao usuário um número inteiro e,
 * em seguida, imprima a tabuada desse número de 1 a 10.
 * */
public class OutroExemplo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número para cálculo da tabuada: ");
        int numero = sc.nextInt();

        System.out.println("Tabuada do número "+ numero);

        for (int i = 0;i<=10;i++){
            int resultado = numero * i;
            System.out.println(numero + "x" + i + "=" + resultado);
        }


    }
}
