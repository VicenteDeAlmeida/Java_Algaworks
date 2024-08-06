package Modulo1_Fundamentos_Java.Aula15_FormatacaoDeString;

public class FormatandoComPrintf {
    public static void main(String[] args) {
        String nome1 = "Vicente";
        int idade = 37;
        double peso = 93.25;

        System.out.printf("Olá %s sua idade é %d e seu peso é %.2f%n ", nome1, idade,peso);
        System.out.println("Colocando algum número antes do ponto de formatação eu posso incluir espaços a esquerda");
        System.out.printf("Peso:%10.2f%n ",peso);
        System.out.printf("Olá %s sua idade é %d e seu peso é %.2f ", nome1, idade,peso);
        System.out.println();


        System.out.println("PARA FORMATAR STRING %s , PARA FORMATAR INTEIRO %d E PARA FORMATAR DOUBLE %f." +
                "PARA FORMATAR O NÚMERO DE CASAS DECIMAIS QUE QUEREMOS NO DOUBLE USAMOS %.2f (duas casas),%.3f (três casas) e assim" +
                "sucessivamente");

    }
}
