package Modulo6_Construtores_Pacotes_Visibilidade.Aula12_ModificadorDeAcessoPrivate.com.algaworks.erp.estoque;

import java.util.Objects;
import java.util.UUID;

public class ProdutoAula12 {
    static final int QUANTIDADE_ESTOQUE_INICIAl = 100;

    final String codigo = "ABC123"; /*Com o modificador private eu só consigo acessar os atributos e métodos dentro da mesma classe
   não é possível acessar de outras classes independente de pacote*/
    private final int quantidadeVendida;
    private final String outroCodigo;
    private int quantidadeEstoque;
    private String nome;

     public ProdutoAula12(){
        this("Sem nome");

    }




    public ProdutoAula12(String nome){
        this(nome,QUANTIDADE_ESTOQUE_INICIAl);

    }

    private ProdutoAula12(String nome, int estoqueInicial){
        Objects .requireNonNull(nome,"O nome do produto é obrigatório");
        if (estoqueInicial < 0){
           throw new IllegalArgumentException("O valor do estoque inicial não pode ser negativo");

        }
        this.nome = nome;
        this.quantidadeEstoque = estoqueInicial;
        this.quantidadeVendida = 10; /*Definição do atributo aqui*/
        this.outroCodigo = gerarCodigo(); /*Classe UUID gera códigos aleatórios*/

    }

void imprimeAlgo(){
    System.out.println("Imprime algo!!");
}

private String gerarCodigo(){
         /*Métodos também podem ser private quando forem usados somente na mesma classe*/
         return UUID.randomUUID().toString();
}

}
