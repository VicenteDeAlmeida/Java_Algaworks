package Modulo14_Excecoes.Aula2_LancandoExcecoes;

import Modulo14_Excecoes.Aula2_LancandoExcecoes.com.algaworks.estoque.Produto;

public class Principal {
    public static void main(String[] args) {
        Produto produto = new Produto("Apple Watch");

        produto.adicionarEstoque(10);
        produto.retirarEstoque(-5); /*SIMULANDO UMA EXCEÇÃO: Se eu passar um número negativo na retirada,o método está com o
        incremento -= então o java vai entender a regra matemática menos com menos = mais,então ele vai adicionar ao invés de diminuir
        Podemos tratar isso através de exceções lá no método*/
        System.out.printf("Estoque: %d%n",produto.getQuantidadeEstoque());


    }
}
