package Modulo1_Fundamentos_Java.Aula5_OperadoresIncrementoEDecremento;

public class OperadorIncremento {
    /*Esses valores aumentam (Incrementos)ou diminuem (decremento) o valor de uma variável */
    public static void main(String[] args) {

        int totalDownloads = 10;

        System.out.println("Total de downloads " + totalDownloads);
        System.out.println("Adicionando um valor a mais na variável");
        totalDownloads += 1;
        System.out.println(totalDownloads);

        System.out.println("Agora usando o operdaor de incremento,que vai sempre adicionar mais uma únidade,de um em um");
        totalDownloads ++; /*Aqui chamamos de pós fixada*/

        System.out.println(totalDownloads);

        int novoTotalDownloads = ++totalDownloads;/*Aqui chamamos de pré fixada,primeiro usa a váriavel e depois incrementa*/
        System.out.println("Total de downloads: " + totalDownloads);
        System.out.println("Novo total de downloads: " + novoTotalDownloads);

    }
}
