package Modulo14_Excecoes.Aula2_LancandoExcecoes;

import Modulo14_Excecoes.Aula2_LancandoExcecoes.com.algaworks.estoque.Produto;

public class Principal1 {
    public static void main(String[] args) {
        Produto produto = new Produto("Apple Watch");

        produto.adicionarEstoque(10);
        produto.retirarEstoque(5); /*SIMULANDO UMA EXCEÇÃO: Se eu passar um produto (que por default vai vim sempre inativo enquanto eu
        não usar o método ativar,vai lançar a exceção de produto inativo criada no método retirar estoque)*/
        System.out.printf("Estoque: %d%n",produto.getQuantidadeEstoque());


    }
}
