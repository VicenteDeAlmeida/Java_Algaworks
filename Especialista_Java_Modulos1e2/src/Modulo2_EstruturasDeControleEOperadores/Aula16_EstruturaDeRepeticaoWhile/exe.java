package Modulo2_EstruturasDeControleEOperadores.Aula16_EstruturaDeRepeticaoWhile;

import java.util.Scanner;

public class exe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int soma = 0;
        for (int i = 1;i<=10;i++){
            System.out.printf("Digite o número #%d ",i);
            int numero = sc.nextInt();
            if (numero % 2!= 0){
                System.out.println("Somente números pares");
                i--;
            }
            soma +=numero;
        }
        System.out.println("A soma de todos os números pares: "+soma);

    }
}
