package Modulo14_Excecoes.Aula1_ExemplodeExcecoes;

/**
 * Exceções são lançadas quando algo de errado acontece na execução do  programa desviando o fluxo normal da execução de acordo com as
 * instruções prgramadas.
 * São situações anormais e geralmente indesejáveis que podem ocorrer durante a execução de um programa.
 * Se uma exceção não for tratada a execução do programa é interrompida
 * */

public class Principal1 {
    public static void main(String[] args) {
        System.out.println("Início");

        int x = 10 / 0;  /*Aqui vai lançar a exceção informando que não pode ser feita a divisão poe zero*/

        System.out.println("Fim");
    }
}
