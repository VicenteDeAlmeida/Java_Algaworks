package Modulo2_EstruturasDeControleEOperadores.Aula11_EstruturaCondicionalSwitch;

import java.util.Scanner;

public class AvaliacaoAtendimento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a sua nota: (1 a 5)");
        int nota = sc.nextInt();
        switch (nota) {
            case 1:
                System.out.println("Muito ruim");
                break;
            case 2:
                System.out.println("Ruim");
                break;
            case 3:
                System.out.println("Razoável");
                break;
            case 4:
                System.out.println("Muito bom");
                break;
            case 5:
                System.out.println("Excelente");
                break;
            default:
                System.out.println("Opção inválida,digite a nota de com valores de 1 a 5!!");
        }
        sc.close();


    }
}
