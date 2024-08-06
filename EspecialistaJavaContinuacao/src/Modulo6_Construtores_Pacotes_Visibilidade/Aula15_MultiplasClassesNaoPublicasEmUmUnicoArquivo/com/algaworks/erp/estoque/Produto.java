package Modulo6_Construtores_Pacotes_Visibilidade.Aula15_MultiplasClassesNaoPublicasEmUmUnicoArquivo.com.algaworks.erp.estoque;

import java.util.Objects;
import java.util.UUID;

public class Produto {

    static final int QUANTIDADE_ESTOQUE_INICIAl = 100;

    final String codigo = "ABC123";
    private final int quantidadeVendida;
    private final String outroCodigo;
    private int quantidadeEstoque;
    private String nome;
    private Fornecedor fornecedor;
    private Categoria categoria;


    public Produto(){
        this("Sem nome");

    }
    public Produto(String nome){
        this(nome,QUANTIDADE_ESTOQUE_INICIAl);

    }

    private Produto(String nome, int estoqueInicial){
        Objects.requireNonNull(nome,"O nome do produto é obrigatório");
        if (estoqueInicial < 0){
            throw new IllegalArgumentException("O valor do estoque inicial não pode ser negativo");

        }
        this.nome = nome;
        this.quantidadeEstoque = estoqueInicial;
        this.quantidadeVendida = 10; /*Definição do atributo aqui*/
        this.outroCodigo = gerarCodigo(); /*Classe UUID gera códigos aleatórios*/

    }

    private String gerarCodigo(){
        /*Métodos também podem ser private quando forem usados somente na mesma classe*/
        return UUID.randomUUID().toString();
    }


}
/*Aqui vamos implementar outra classe dentro de um mesmo arquivo,isso é possível desde que as duas não sejam publicas*/

class Fornecedor{


}

class Categoria{


}

/*Declarar mais de uma classe no mesmo arquivo não é um processo geralmente utilizado e útil e deve ser evitado,a aula foi só para mostrar
* que é possível*/
