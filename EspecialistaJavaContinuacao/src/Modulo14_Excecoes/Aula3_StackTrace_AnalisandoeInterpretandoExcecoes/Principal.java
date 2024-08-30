package Modulo14_Excecoes.Aula3_StackTrace_AnalisandoeInterpretandoExcecoes;

import Modulo14_Excecoes.Aula3_StackTrace_AnalisandoeInterpretandoExcecoes.com.algaworks.estoque.Produto4;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Produto4 produto3 = new Produto4("Aplle Watch");
        produto3.ativar();
        produto3.adicionarEstoque(20);

        comprar(produto3);


    }

    private static void comprar(Produto4 produto3){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quantidade: ");
        int quantidade = scanner.nextInt();

        efetuarBaixaEstoque(produto3,quantidade);
    }

    private static void efetuarBaixaEstoque(Produto4 produto3, int quantidade){
        produto3.retirarEstoque(quantidade);
        System.out.printf("%d unidades retiradas do estoque.Estoque atual: %d%n",quantidade,produto3.getQuantidadeEstoque());

    }

    /*Toda exceção lançada em vermelho é o que chamamos de stack trace,ou seja uma pilha de chamadas de métodos (de baixo para cima)*/
}
