package Modulo1_Fundamentos_Java.Aula5_OperadoresIncrementoEDecremento;

public class OperadorDecremento {
    public static void main(String[] args) {

        int limiteTentativaDeLogin = 10;

        System.out.println("Limite de tentativas de login é "+ limiteTentativaDeLogin);
        System.out.println("Reduzindo em um:");
        limiteTentativaDeLogin -=1;
        System.out.println("Você tem mais " + limiteTentativaDeLogin + " tentativas.");
        System.out.println("Outra maneira de fazer:");
        limiteTentativaDeLogin--; /*Aqui chamamos de pós fixada*/
        System.out.println("Agora você tem "+ limiteTentativaDeLogin + " tentativas.");

        int maisUmaTentativaDeLogin = --limiteTentativaDeLogin; /*Aqui chamamos de pré fixada,primeiro usa a váriavel e depois incrementa*/
        System.out.println("Agora você tem "+ limiteTentativaDeLogin + " tentativas.");
        System.out.println("Agora você tem "+ maisUmaTentativaDeLogin + " tentativas.");



    }
}
