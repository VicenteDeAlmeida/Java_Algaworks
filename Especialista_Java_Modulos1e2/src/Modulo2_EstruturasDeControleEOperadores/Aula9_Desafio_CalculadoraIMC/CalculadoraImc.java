package Modulo2_EstruturasDeControleEOperadores.Aula9_Desafio_CalculadoraIMC;

import java.util.Scanner;

/**
 * Em aulas anteriores, nós implementamos as regras da Organização Mundial de Saúde para calcular o IMC (Índice de Massa Corporal).
 * Existem outras regras mais detalhadas, como as da NHANES II survey (USA 1976-1980), que indicam os seguintes critérios para adultos:
 * Condição	                IMC em mulheres	                     IMC em homens
 * Abaixo do peso	        Menor que 19.1	                     Menor que 20.7
 * No peso ideal	        Entre 19.1 e 25.8	                 Entre 20.8 e 26.4
 * Um pouco acima do peso	Entre 25.9 e 27.3	                 Entre 26.5 e 27.8
 * Acima do peso ideal	    Entre 27.4 e 32.3	                 Entre 27.9 e 31.1
 * Obeso	                Maior que 32.3	                     Maior que 31.1
 * Implemente um programa que obtém os valores como entrada do usuário e imprime na tela o resultado (condição da pessoa),
 * usando essas regras e aplicando todos os conteúdos que você aprendeu até agora neste módulo.
 */
public class CalculadoraImc {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o seu sexo! (Masculino ou Feminino)");
        String sexo = sc.nextLine();
        System.out.println("Digite o seu peso:");
        double peso = sc.nextDouble();
        System.out.println("Digite a sua altura:");
        double altura = sc.nextDouble();
        double imc = peso / (altura * altura);
        if (sexo.equalsIgnoreCase("Feminino") && imc < 19.1) {
            System.out.println("Abaixo do peso.Seu imc está em " + imc);
        } else if (sexo.equalsIgnoreCase("Feminino") && imc >= 19.1 && imc <= 25.8) {
            System.out.println("No peso ideal.Seu imc está em " + imc);

        } else if (sexo.equalsIgnoreCase("Feminino") && imc >= 25.9 && imc <= 27.3) {
            System.out.println("Um pouco acima do peso.Seu imc está em " + imc);

        } else if (sexo.equalsIgnoreCase("Feminino") && imc >= 27.4 && imc <= 32.3) {
            System.out.println("Acima do peso ideal.Seu imc está em " + imc);
        } else if (sexo.equalsIgnoreCase("Feminino") && imc > 32.3) {
            System.out.println("Obeso.Seu imc está em " + imc);

        } else if (sexo.equalsIgnoreCase("Masculino") && imc < 20.7) {
            System.out.println("Abaixo do peso.Seu imc está em " + imc);
        } else if (sexo.equalsIgnoreCase("Masculino") && imc >= 20.8 && imc <= 26.4) {
            System.out.println("No peso ideal .Seu imc está em " + imc);
        } else if (sexo.equalsIgnoreCase("Masculino") && imc >= 26.5 && imc <= 27.8) {
            System.out.println("Um pouco acima do peso.Seu imc está em " + imc);
        } else if (sexo.equalsIgnoreCase("Masculino") && imc >= 27.9 && imc <= 31.1) {
            System.out.println("Acima do peso ideal.Seu imc está em " + imc);
        } else {
            System.out.println("Obeso.Seu imc está em " + imc);
        }
        sc.close();
    }
}
