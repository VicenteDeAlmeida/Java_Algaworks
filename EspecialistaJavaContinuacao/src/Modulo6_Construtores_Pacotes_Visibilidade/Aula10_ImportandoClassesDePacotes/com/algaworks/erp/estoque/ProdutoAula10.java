package Modulo6_Construtores_Pacotes_Visibilidade.Aula10_ImportandoClassesDePacotes.com.algaworks.erp.estoque;

import java.util.Objects;
import java.util.UUID;

public class ProdutoAula10 {
    static final int QUANTIDADE_ESTOQUE_INICIAl = 100;

    final String codigo = "ABC123";
    final int quantidadeVendida;
    final String outroCodigo;
    int quantidadeEstoque;
    String nome;

    public ProdutoAula10(){
        this("Sem nome");

    }



    ProdutoAula10(String nome){
        this(nome,QUANTIDADE_ESTOQUE_INICIAl);

    }

    ProdutoAula10(String nome, int estoqueInicial){
        Objects .requireNonNull(nome,"O nome do produto é obrigatório");
        if (estoqueInicial < 0){
           throw new IllegalArgumentException("O valor do estoque inicial não pode ser negativo");

        }
        this.nome = nome;
        this.quantidadeEstoque = estoqueInicial;
        this.quantidadeVendida = 10; /*Definição do atributo aqui*/
        this.outroCodigo = UUID.randomUUID().toString(); /*Classe UUID gera códigos aleatórios*/

    }

void imprimeAlgo(){
    System.out.println("Imprime algo!!");
}

}
