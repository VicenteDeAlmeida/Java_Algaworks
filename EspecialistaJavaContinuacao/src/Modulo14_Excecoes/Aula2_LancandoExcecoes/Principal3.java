package Modulo14_Excecoes.Aula2_LancandoExcecoes;

import Modulo14_Excecoes.Aula2_LancandoExcecoes.com.algaworks.estoque.Produto;

public class Principal3 {
    public static void main(String[] args) {
        Produto produto = new Produto(null);/*SIMULANDO UMA EXCEÇÃO: Se eu passar null no nome lança a exceção criada no método setNome*/
        produto.ativar();

        produto.adicionarEstoque(10);
        produto.retirarEstoque(15);
        System.out.printf("Estoque: %d%n",produto.getQuantidadeEstoque());


    }
}
