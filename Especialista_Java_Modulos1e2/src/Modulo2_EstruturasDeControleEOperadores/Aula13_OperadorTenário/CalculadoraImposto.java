package Modulo2_EstruturasDeControleEOperadores.Aula13_OperadorTenário;

import java.util.Scanner;

public class CalculadoraImposto {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Produto ou serviço?Digite P para produto e S para serviço:");
        String produtoServico = scanner.next();
        scanner.nextLine();
        System.out.println("Agora digite o total faturado:");
        double totalFaturado = scanner.nextDouble();
        double valorImpostos = produtoServico.equals("S") ? totalFaturado * 0.16 : totalFaturado * 0.35;
        System.out.printf("O valor total ficou em R$%.2f",valorImpostos);
        scanner.close();

    }
}
