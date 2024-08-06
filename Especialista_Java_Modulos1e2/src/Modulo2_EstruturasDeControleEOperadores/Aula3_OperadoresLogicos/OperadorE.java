package Modulo2_EstruturasDeControleEOperadores.Aula3_OperadoresLogicos;

import java.util.Scanner;

public class OperadorE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o seu cortisol: ");
        double cortisol = sc.nextDouble();
        /*Regra de Negócio: Cortisol ideal é de 6 a 18.4 */
        boolean resultadoCortisol = cortisol >=6 && cortisol <= 18.4; /*Expressão e (&&),precisa que toda a expressão seja verdadeira*/
        System.out.printf("O seu cortisol está normal? %b%n",resultadoCortisol);


    }
}
