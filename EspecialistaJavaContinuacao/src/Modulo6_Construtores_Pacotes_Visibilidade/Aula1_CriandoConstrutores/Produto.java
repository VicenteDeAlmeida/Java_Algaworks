package Modulo6_Construtores_Pacotes_Visibilidade.Aula1_CriandoConstrutores;

public class Produto {
    int quantidadeEstoque;

    /*Isso aqui é o que chamamos de contrutor,ele não é um método,é o nome da classe com possibilidade de passar argumentos e bloco de
    * código*/
    Produto(){
        this.quantidadeEstoque = 10;
        System.out.println("Construindo um produto.");

    }
}
