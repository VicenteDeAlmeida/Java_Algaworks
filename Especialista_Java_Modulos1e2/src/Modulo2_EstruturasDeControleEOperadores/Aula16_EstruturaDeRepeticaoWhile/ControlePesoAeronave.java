package Modulo2_EstruturasDeControleEOperadores.Aula16_EstruturaDeRepeticaoWhile;

import java.util.Scanner;

public class ControlePesoAeronave {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual o peso máximo que a aeronave comporta?");
        double pesoAeronave = sc.nextDouble();

        int pesoTotalPassageiros = 0;
        boolean incluirNovoPassageiro = true;


        while (pesoTotalPassageiros <= pesoAeronave && incluirNovoPassageiro){
            System.out.println("Peso do passageiro: ");
            int pesoPassageiro = sc.nextInt();
            pesoTotalPassageiros += pesoPassageiro;

            System.out.println("Incluir novo passageiro? ");
            incluirNovoPassageiro = sc.nextBoolean();

        }
        System.out.printf("Peso máximo da aeronave:%.2f kg%n",pesoAeronave);
        System.out.printf("Peso total dos passageiros da aeronave:%dkg%n",pesoTotalPassageiros);
        System.out.printf("Situação da aeronave:%s%n", pesoTotalPassageiros > pesoAeronave ? "Peso excedido": "Liberado");
        sc.close();

    }



}
