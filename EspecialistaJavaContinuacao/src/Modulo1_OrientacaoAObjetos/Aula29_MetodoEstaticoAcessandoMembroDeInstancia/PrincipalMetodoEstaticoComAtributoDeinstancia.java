package Modulo1_OrientacaoAObjetos.Aula29_MetodoEstaticoAcessandoMembroDeInstancia;

public class PrincipalMetodoEstaticoComAtributoDeinstancia {
    public static void main(String[] args) {
        ProdutoAula29.custoEmbalagem = 10;
        ProdutoAula29.imprimirCustoEmbalagem();
        ProdutoAula29.alterarCustoEmbalagem(25);
        ProdutoAula29.imprimirCustoEmbalagem();

        ProdutoAula29 produtoAula29 = new ProdutoAula29();
        produtoAula29.alterarPrecoCusto(50);

        System.out.printf("Total de custos %.2f ",ProdutoAula29.calcularCustosTotais(produtoAula29)); /*Aqui eu passo a instancia do método como parâmetro*/



    }
}
