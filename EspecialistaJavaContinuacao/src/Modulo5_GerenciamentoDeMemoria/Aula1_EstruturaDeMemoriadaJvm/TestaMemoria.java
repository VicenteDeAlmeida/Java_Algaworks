package Modulo5_GerenciamentoDeMemoria.Aula1_EstruturaDeMemoriadaJvm;
/*
 * Aula sobre como verificar o consumo de memória que o programa em questão está consumindo.
 * Aula mais focada em comandos no terminal para verificação de alocação de memória durante a execução do programa
 * Memória Heap: É a area de memória onde os objetos que instanciamos são alocados
 * */
import java.util.Scanner;

public class TestaMemoria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o seu nome:");
        String nome = scanner.next();
        System.out.println("Olá "+ nome);
        scanner.close();
    }
}
