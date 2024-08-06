package Modulo1_Fundamentos_Java.Aula16_EntradaDeDados;

import java.util.Scanner;

public class EntradaDeDados {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o seu nome:");
        String nome = entrada.nextLine();
        System.out.println("Digite o seu sobrenome:");
        String sobrenome = entrada.nextLine();
        System.out.println("Digite a sua idade:");
        int idade = entrada.nextInt();
        System.out.println("Digite o seu peso: ");
        double peso = entrada.nextDouble();
        System.out.println("Digite a sua altura: ");
        double altura = entrada.nextDouble();
        double imc = peso /  (altura * altura);

        System.out.printf("Olá %s %s.A sua idade é %d anos,seu peso é %.2f e sua altura é %.2f cm.Seu imc está em %.2f",nome,sobrenome,idade,peso,altura,imc);

    }
}
