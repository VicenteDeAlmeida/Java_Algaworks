package Modulo2_EstruturasDeControleEOperadores.Aula12_SwitchExpressions;

import java.util.Scanner;

public class HorarioDaSemana {
    public static void main(String[] args) {
        System.out.println("A partir do java 14 é possível usar o switch de outra forma,utilizando o que chamamos de arrows label");
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o dia da semana (Ex: Segunda,Terça,etc...)");
        String diaSemana = sc.nextLine();
        switch (diaSemana) {
            case "Segunda" -> System.out.println("Fechado");
            case "Terça","Quarta","Quinta","Sexta","Sábado" -> System.out.println("Aberto das 8 às 18");
            case "Domingo" -> System.out.println("Horário de funcionamento das 10 às 13.");
            default -> System.out.println("Dia inválido!!");
        }
        sc.close();
    }
}
