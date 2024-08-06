package Modulo1_OrientacaoAObjetos.Aula28_MetodosDeClasseEstaticos;

public class ProdutoAula28 {
    static double custoEmbalagem; /*Ao adicionar o static o Java entende que esse atributo não é mais um atributo de uma instância
    e sim um atributo da classe Produto,eu posso por exemplo ter um preço de embalagem mesmo sem ter uma instância da classe Produto.
     Curiosidade: esse tipo de atributo o intellij coloca em itálico*/
    double precoCusto;
    double precoVenda;

    void alterarPrecoCusto(double precoCusto){
        this.precoCusto = precoCusto;
    }

    static void imprimirCustoEmbalagem(){
        System.out.printf("Custo com embalagem foi de %.2f%n",custoEmbalagem);
    }

    static void alterarCustoEmbalagem(double custoEmbalagem){
        ProdutoAula28.custoEmbalagem = custoEmbalagem; /*Aqui estamos referenciando o atributo estático com o método taambém estático.Só assim
        poderemos usar ele na classe de execução chamando ele pela classe e não por instâncias*/


    }
}


