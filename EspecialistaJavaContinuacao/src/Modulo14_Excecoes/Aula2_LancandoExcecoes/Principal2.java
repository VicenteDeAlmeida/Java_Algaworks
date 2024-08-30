package Modulo14_Excecoes.Aula2_LancandoExcecoes;

import Modulo14_Excecoes.Aula2_LancandoExcecoes.com.algaworks.estoque.Produto;

public class Principal2 {
    public static void main(String[] args) {
        Produto produto = new Produto("Apple Watch");
        produto.ativar();

        produto.adicionarEstoque(10);
        produto.retirarEstoque(15); /*SIMULANDO UMA EXCEÇÃO: Se eu passar uma quantidade de retirada maior do que a quantidade que jáa tem
        no estoque lançamos a exceção criada no método retirar estoque onde o saldo não pode ficar negativo*/
        System.out.printf("Estoque: %d%n",produto.getQuantidadeEstoque());


    }
}
