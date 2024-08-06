package Modulo1_OrientacaoAObjetos.Aula26_AtributosDeClasseComStatic;

public class ProdutoAula26 {
    static double custoEmbalagem; /*Ao adicionar o static o Java entende que esse atributo não é mais um atributo de uma instância
    e sim um atributo da classe Produto,eu posso por exemplo ter um preço de embalagem mesmo sem ter uma instância da classe Produto.
     Curiosidade: esse tipo de atributo o intellij coloca em itálico*/
    double precoCusto;
    double precoVenda;

    void alterarPrecoCusto(double precoCusto){
        this.precoCusto = precoCusto; /*O this referencai que eu quero alterar o preco custo do atributo preço custo e não o preço
        custo que eu estou passando por parâmetro*/
    }

    void imprimirCustoEmbalagem(){
        System.out.printf("Custo com embalagem foi de %.2f%n",custoEmbalagem);
    }
}
