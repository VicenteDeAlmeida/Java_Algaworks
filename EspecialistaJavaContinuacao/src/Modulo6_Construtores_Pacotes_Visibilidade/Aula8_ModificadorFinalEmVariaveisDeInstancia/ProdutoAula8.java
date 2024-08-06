package Modulo6_Construtores_Pacotes_Visibilidade.Aula8_ModificadorFinalEmVariaveisDeInstancia;

import java.util.Objects;
import java.util.UUID;

public class ProdutoAula8 {
    static final int QUANTIDADE_ESTOQUE_INICIAl = 100;

    final String codigo = "ABC123"; /*Após inicializar uma variável do tipo final,não é mais possível altera-la,se na instância eu fizer
    por exemplo produto4.codigo = 123ABC vai da erro de copilação*/
    final int quantidadeVendida; /*Posso também somente criar o atributo e definir ele dentro de um construtor,definição mais abaixo*/
    final String outroCodigo;
    int quantidadeEstoque;
    String nome;

    ProdutoAula8(){
        this("Sem nome");

    }



    ProdutoAula8(String nome){
        this(nome,QUANTIDADE_ESTOQUE_INICIAl);

    }

    ProdutoAula8(String nome, int estoqueInicial){
        Objects .requireNonNull(nome,"O nome do produto é obrigatório");
        if (estoqueInicial < 0){
           throw new IllegalArgumentException("O valor do estoque inicial não pode ser negativo");
           /*Lançando excessão caso o valor inicial em estoque seja negativo*/
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
