package Modulo2_EstruturasDeControleEOperadores.Aula8_Estruturas_Else_ElseIf;

import java.util.Scanner;

public class CalculadoraIndiceMassaCorporalAula8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Peso: ");
        double peso = scanner.nextDouble();

        System.out.println("Altura: ");
        double altura = scanner.nextDouble();

        double imc = peso / (altura * altura);


        if (imc < 18.5) {
            System.out.println("Abaixo do peso ideal.");
        } else if (imc >= 18.5 && imc < 25) {
            System.out.println("Peso ideal.");

        } else if (imc >= 25 && imc < 30) {
            System.out.println("Acima do peso.");

        } else if (imc >= 30 && imc < 35) {
            System.out.println("Obesidade grau I.");

        } else if (imc >= 35 && imc < 40) {
            System.out.println("Obesidade grau II.");

        } else {
            System.out.println("Obesidade grau III.");
        }
        scanner.close();
    }
}
