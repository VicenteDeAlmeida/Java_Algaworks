package Modulo1_OrientacaoAObjetos.Aula25_UsandoAPalavraThis;

public class ProdutoAula25 {

    double precoCusto;
    double precoVenda;

    void alterarPrecoCusto(double precoCusto){
        this.precoCusto = precoCusto; /*O this referencai que eu quero alterar o preco custo do atributo preço custo e não o preço
        custo que eu estou passando por parâmetro*/
    }
}
