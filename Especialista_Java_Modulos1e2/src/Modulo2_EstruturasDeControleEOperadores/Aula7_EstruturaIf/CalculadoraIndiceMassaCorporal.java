package Modulo2_EstruturasDeControleEOperadores.Aula7_EstruturaIf;

import java.util.Scanner;

public class CalculadoraIndiceMassaCorporal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Peso: ");
        double peso = scanner.nextDouble();

        System.out.println("Altura: ");
        double altura = scanner.nextDouble();

        double imc = peso / (altura * altura);


        if (imc < 18.5) {
            System.out.println("Abaixo do peso ideal.");
            System.out.println("Procure um nutricionista.");
        }
        if (imc >= 18.5 && imc < 25) {
            System.out.println("Peso ideal");
        }
        if (imc >= 25 && imc < 30) {
            System.out.println("Acima do peso");
        }
        if (imc >= 30 && imc < 35) {
            System.out.println("Obesidade grau I");
        }
        if (imc >= 35 && imc < 40) {
            System.out.println("Obesidade grau II");
        }
        if (imc >= 40) {
            System.out.println("Obesidade grau III");
        }

        System.out.println("Fim do programa");

        scanner.close();
    }
}
