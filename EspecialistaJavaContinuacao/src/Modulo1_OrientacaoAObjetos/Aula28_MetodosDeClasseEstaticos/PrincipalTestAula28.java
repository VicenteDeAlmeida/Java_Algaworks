package Modulo1_OrientacaoAObjetos.Aula28_MetodosDeClasseEstaticos;

public class PrincipalTestAula28 {
    public static void main(String[] args) {
        ProdutoAula28.custoEmbalagem = 10;
        ProdutoAula28 novoProdutoAula25 = new ProdutoAula28();
        novoProdutoAula25.precoCusto = 100;

        ServicoDePrecificacaoAula28 servicoDePrecificacao = new ServicoDePrecificacaoAula28();
        servicoDePrecificacao.definirPrecoVenda(novoProdutoAula25,20);
        System.out.printf("Preço de venda: %.2f%n", novoProdutoAula25.precoVenda);
        novoProdutoAula25.alterarPrecoCusto(80.00);
        System.out.printf("Alterando o preço de custo: %.2f",novoProdutoAula25.precoCusto);

    }
}
