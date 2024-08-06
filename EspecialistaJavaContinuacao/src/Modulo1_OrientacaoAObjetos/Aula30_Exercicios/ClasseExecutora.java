package Modulo1_OrientacaoAObjetos.Aula30_Exercicios;

import java.util.Scanner;

public class ClasseExecutora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite e medida do raio do círculo: ");
        double raio = sc.nextDouble();
        System.out.println("Digite e medida do lado do quadrado: ");
        double lado = sc.nextDouble();
        System.out.printf("A área do círculo é de %.2f.%n",FormasGeometricas.calcularAreaCirculo(raio));
        System.out.printf("A área do quadrado é de %.2f.",FormasGeometricas.calcularAreaQuadrado(lado));
        sc.close();

    }
}
