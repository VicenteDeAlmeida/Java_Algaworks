package Modulo2_EstruturasDeControleEOperadores.Aula6_PrecedenciaDeOperadores;

import java.util.Scanner;

/*Desejável: acima de 20 ng/ML
 * Grupo de risco: 30 a 60 ng/ml*/
public class ExameVitaminaD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Grupo de risco: ");
        boolean grupoDeRisco = scanner.nextBoolean();

        System.out.println("Vitamina D: ");
        double vitaminaD = scanner.nextDouble(); /*nanograma por mililitro*/

        boolean vitaminaDNormal = (!grupoDeRisco && vitaminaD > 20) ||
                (grupoDeRisco && vitaminaD >= 30 && vitaminaD <= 60);
        System.out.printf("Vitamina D normal: %b%n", vitaminaDNormal);
        scanner.close();
    }
}
