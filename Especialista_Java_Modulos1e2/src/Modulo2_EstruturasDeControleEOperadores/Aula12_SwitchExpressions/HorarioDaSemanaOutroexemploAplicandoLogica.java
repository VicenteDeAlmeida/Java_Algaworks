package Modulo2_EstruturasDeControleEOperadores.Aula12_SwitchExpressions;

import java.util.Scanner;

public class HorarioDaSemanaOutroexemploAplicandoLogica {
    public static void main(String[] args) {
        System.out.println("A partir do java 14 é possível usar o switch de outra forma,utilizando o que chamamos de arrows label");
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o dia da semana (Ex: Segunda,Terça,etc...)");
        String diaSemana = sc.nextLine();
        System.out.println("Digite o mês: Ex: Janeiro,Fevereiro,etc...");
        String mes = sc.nextLine();
        String horarioAtendimento = switch (diaSemana) {
            case "Segunda" -> {
                if (mes.equalsIgnoreCase("Dezembro")) {
                    yield "Aberto das 8 às 16";
                }
                yield "Fechado";

            }
            case "Terça", "Quarta", "Quinta", "Sexta", "Sábado" -> "Aberto das 8 às 18";
            case "Domingo" -> "Horário de funcionamento das 10 às 13.";
            default -> "Dia inválido";
        };
        System.out.println(horarioAtendimento);

        sc.close();
    }
}