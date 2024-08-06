package Modulo1_Fundamentos_Java.Aula17_Desafio;

import java.util.Scanner;

/**
 * A empresa que você trabalha descobriu que você está indo muito bem neste curso de Java e pediu para que você desenvolvesse um programa que calcula os pagamentos para os prestadores de serviços da empresa.
 * Este programa deve receber as seguintes entradas de dados do usuário:
 * Nome (texto)
 * Valor por hora (decimal)
 * Horas trabalhadas (inteiro)
 * Valor dos descontos (decimal)
 * A saída do programa deve ser um resumo da folha de pagamento, mostrando os cálculos e os resultados finais, como no exemplo abaixo:
 * Folha de pagamento: Thiago Faria
 * 172 horas x R$150.20 = R$25834.40
 * Descontos: R$482.88
 * Total devido: R$25351.52
 * Use a formatação de saída com printf para imprimir na saída e o tipo Scanner para receber a entrada de dados do usuário.*/
public class Calculo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome do prestador: ");
        String nome = scanner.nextLine();
        System.out.println("Digite o valor por hora trabalhada:");
        double valorHora = scanner.nextDouble();
        System.out.println("Digite a quantidade de horas trabalhadas:");
        int hrsTrabalhadas = scanner.nextInt();
        System.out.println("Digite o valor dos descontos:");
        double valorDescontos = scanner.nextDouble();
        double total = (valorHora * hrsTrabalhadas) - valorDescontos;

        System.out.printf("Folha de Pagamento:%s%n ",nome);
        System.out.printf("%d horas X R$%.2f = R$%.2f%n ",hrsTrabalhadas,valorHora,(hrsTrabalhadas * valorHora));
        System.out.printf("Descontos:R$%.2f%n ", valorDescontos);
        System.out.printf("Total devido: R$%.2f",total);
    }
}
