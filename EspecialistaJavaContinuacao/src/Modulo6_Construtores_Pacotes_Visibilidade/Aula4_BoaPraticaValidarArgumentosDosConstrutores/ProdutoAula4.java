package Modulo6_Construtores_Pacotes_Visibilidade.Aula4_BoaPraticaValidarArgumentosDosConstrutores;

import java.util.Objects;

public class ProdutoAula4 {
    static final int QUANTIDADE_ESTOQUE_INICIAl = 100;
    int quantidadeEstoque;
    String nome;

    ProdutoAula4(){
        /*Aqui criamos um construtor vazio para que possamos também instanciar objetos sem passar nenhum argumento,somente chamar um método por exemplo
        * ou então passar atributos já predefinidos em variáveis*/
        this.nome = "Sem nome";
        this.quantidadeEstoque = QUANTIDADE_ESTOQUE_INICIAl;
    }



    ProdutoAula4(String nome){
        Objects .requireNonNull(nome,"O nome do produto é obrigatório"); /*Usando a classe Objects para validar que não é possível
        passar um produto sem nome*/
        this.nome = nome;
        this.quantidadeEstoque = QUANTIDADE_ESTOQUE_INICIAl;

    }

    ProdutoAula4(String nome, int estoqueInicial){
        Objects .requireNonNull(nome,"O nome do produto é obrigatório");
        if (estoqueInicial < 0){
           throw new IllegalArgumentException("O valor do estoque inicial não pode ser negativo");
           /*Lançando excessão caso o valor inicial em estoque seja negativo*/
        }
        this.nome = nome;
        this.quantidadeEstoque = estoqueInicial;

    }
    /*Nesse caso o primeiro construtor recebe somente o nome com a quantidade em estoque como padrão e no segundo construtor vai receber
    * o nome e a quantidade em estoque definida pelo usuário */

void imprimeAlgo(){
    System.out.println("Imprime algo!!");
}

}
