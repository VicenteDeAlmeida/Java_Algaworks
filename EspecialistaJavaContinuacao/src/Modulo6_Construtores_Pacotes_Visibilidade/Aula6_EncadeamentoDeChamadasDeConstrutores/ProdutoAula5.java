package Modulo6_Construtores_Pacotes_Visibilidade.Aula6_EncadeamentoDeChamadasDeConstrutores;

import java.util.Objects;

public class ProdutoAula5 {
    static final int QUANTIDADE_ESTOQUE_INICIAl = 100;
    int quantidadeEstoque;
    String nome;

    ProdutoAula5(){
        this("Sem nome"); /*Aqui eu estou chamando o construtor debaixo nesse outro construtor,mas é necessário que seja a primeira instrução*/

    }



    ProdutoAula5(String nome){
        this(nome,QUANTIDADE_ESTOQUE_INICIAl); /*Aqui é mesma situação acima,o código ficou mais enxuto e as regras de validação ficaram em
        um só construtor,no caso o de baixo*/

    }

    ProdutoAula5(String nome, int estoqueInicial){
        Objects .requireNonNull(nome,"O nome do produto é obrigatório");
        if (estoqueInicial < 0){
           throw new IllegalArgumentException("O valor do estoque inicial não pode ser negativo");
           /*Lançando excessão caso o valor inicial em estoque seja negativo*/
        }
        this.nome = nome;
        this.quantidadeEstoque = estoqueInicial;

    }

void imprimeAlgo(){
    System.out.println("Imprime algo!!");
}

}
