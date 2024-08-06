package Modulo2_EstruturasDeControleEOperadores.Aula11_EstruturaCondicionalSwitch;

import java.util.Scanner;

public class HorarioDaSemana {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o dia da semana (Ex: Segunda,Terça,etc...)");
        String diaSemana = sc.nextLine();
        switch (diaSemana){
            case "Segunda":
                System.out.println("Fechado!");
                break;
            case "Terça":
            case "Quarta":
            case "Quinta":
            case "Sexta":
            case "Sábado":
                System.out.println("Horário de funcionamento das 8 às 18.");
                break;
            case "Domingo":
                System.out.println("Horário de funcionamento das 10 às 13.");
            default:
                System.out.println("Dia inválido!!!");
        }
        sc.close();
        System.out.println("Como o horário de Terça a Sábado é o mesmo,eu coloco a validação somente no final.");
    }
}
