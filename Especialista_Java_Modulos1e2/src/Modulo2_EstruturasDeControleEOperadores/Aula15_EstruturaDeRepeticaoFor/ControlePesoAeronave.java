package Modulo2_EstruturasDeControleEOperadores.Aula15_EstruturaDeRepeticaoFor;

import java.util.Scanner;

public class ControlePesoAeronave {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantidade de passageiros: ");
        int quantidadePassageiros = sc.nextInt();

        System.out.print("Qual o peso máximo que a aeronave comporta?");
        double peso = sc.nextDouble();

        int pesoTotalPassageiros = 0;

        for (int passageiroAtual = 1 ; passageiroAtual <= quantidadePassageiros;passageiroAtual ++){
            System.out.printf("Peso do passageiro #%d: ",passageiroAtual);
            int pesoPassageiro = sc.nextInt();
            pesoTotalPassageiros += pesoPassageiro;
        }
        System.out.printf("Peso máximo da aeronave:%.2f kg%n",peso);
        System.out.printf("Peso total dos passageiros da aeronave:%dkg%n",pesoTotalPassageiros);
        System.out.printf("Situação da aeronave:%s%n", pesoTotalPassageiros > peso ? "Peso excedido": "Liberado");
        sc.close();

    }



}
