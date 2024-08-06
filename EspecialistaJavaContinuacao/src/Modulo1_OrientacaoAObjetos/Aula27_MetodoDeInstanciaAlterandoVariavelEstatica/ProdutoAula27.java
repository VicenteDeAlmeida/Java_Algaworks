package Modulo1_OrientacaoAObjetos.Aula27_MetodoDeInstanciaAlterandoVariavelEstatica;

public class ProdutoAula27 {
    static double custoEmbalagem; /*Ao adicionar o static o Java entende que esse atributo não é mais um atributo de uma instância
    e sim um atributo da classe Produto,eu posso por exemplo ter um preço de embalagem mesmo sem ter uma instância da classe Produto.
     Curiosidade: esse tipo de atributo o intellij coloca em itálico*/
    double precoCusto;
    double precoVenda;

    void alterarPrecoCusto(double precoCusto){
        this.precoCusto = precoCusto;
    }

    void imprimirCustoEmbalagem(){
        System.out.printf("Custo com embalagem foi de %.2f%n",custoEmbalagem);
    }

    void alterarCustoEmbalagem(double custoEmbalagem){
        ProdutoAula27.custoEmbalagem = custoEmbalagem; /*Aqui estamos referenciando o atributo estático.Não é boa prática referenciar atributo
         estático através do this.Não é boa prática criar métodos comuns para alterar atributos estáticos.Próxima aula criaremos métods estáticos
         para validar isso.*/


    }
}


