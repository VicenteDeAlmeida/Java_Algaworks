package Modulo1_OrientacaoAObjetos.Aula22_MetodosQueAlteramVariaveisDeInstancia;

import java.util.Scanner;

public class AeronaveTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Aeronave aviaoGol = new Aeronave();
        System.out.println("Digite o total de assentos: ");
        aviaoGol.totalAssentos = scanner.nextInt();
        System.out.println("Digite agora os assentos reservados: ");
        aviaoGol.assentosReservados = scanner.nextInt();
        System.out.println("O avião está ativo? ");
        aviaoGol.ativo = scanner.nextBoolean();


        System.out.printf("O avião está %b e possui um total de %d assentos.Nesse momento possuimos %d assentos reservados.",aviaoGol.ativo,aviaoGol.totalAssentos,aviaoGol.assentosReservados);
        System.out.printf("O avião possui %d assentos disponíveis.%n",aviaoGol.calcularAssentosDisponiveis());

        aviaoGol.reservarAssentos(10);
        System.out.printf("Alterando a reserva: %d%n",aviaoGol.assentosReservados);
        System.out.printf("Alterando o status do avião: %b ",aviaoGol.alteraStatusAeronave());
        scanner.close();

    }


}
