package Modulo1_OrientacaoAObjetos.Aula29_MetodoEstaticoAcessandoMembroDeInstancia;

public class ProdutoAula29 {
    static double custoEmbalagem; /*Ao adicionar o static o Java entende que esse atributo não é mais um atributo de uma instância
    e sim um atributo da classe Produto,eu posso por exemplo ter um preço de embalagem mesmo sem ter uma instância da classe Produto.
     Curiosidade: esse tipo de atributo o intellij coloca em itálico*/
    double precoCusto;
    double precoVenda;

    static double calcularCustosTotais(ProdutoAula29 produtoAula29){
        return produtoAula29.precoCusto + ProdutoAula29.custoEmbalagem;
        /*Para acessar um atributo de instância em um método estático eu preciso instanciar a classe como parâmetro*/
    }

    void alterarPrecoCusto(double precoCusto){
        this.precoCusto = precoCusto;
    }

    static void imprimirCustoEmbalagem(){
        System.out.printf("Custo com embalagem foi de %.2f%n",custoEmbalagem);
    }

    static void alterarCustoEmbalagem(double custoEmbalagem){
        ProdutoAula29.custoEmbalagem = custoEmbalagem; /*Aqui estamos referenciando o atributo estático com o método taambém estático.Só assim
        poderemos usar ele na classe de execução chamando ele pela classe e não por instâncias*/


    }
}


