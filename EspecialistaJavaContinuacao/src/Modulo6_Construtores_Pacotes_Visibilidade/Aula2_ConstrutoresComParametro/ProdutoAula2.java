package Modulo6_Construtores_Pacotes_Visibilidade.Aula2_ConstrutoresComParametro;

public class ProdutoAula2 {
    int quantidadeEstoque;
    String nome;

    /*Isso aqui é o que chamamos de contrutor,ele não é um método,é o nome da classe com possibilidade de passar argumentos e bloco de
    * código*/
    ProdutoAula2(String nome, int quantidadeEstoque){
        this.nome = nome;
        this.quantidadeEstoque = quantidadeEstoque;

    }
}
