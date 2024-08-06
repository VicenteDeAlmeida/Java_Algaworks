package Modulo1_OrientacaoAObjetos.Aula29_MetodoEstaticoAcessandoMembroDeInstancia;

public class PrincipalTestAula29 {
    public static void main(String[] args) {
        ProdutoAula29.custoEmbalagem = 10;
        ProdutoAula29 novoProdutoAula25 = new ProdutoAula29();
        novoProdutoAula25.precoCusto = 100;

        ServicoDePrecificacaoAula29 servicoDePrecificacao = new ServicoDePrecificacaoAula29();
        servicoDePrecificacao.definirPrecoVenda(novoProdutoAula25,20);
        System.out.printf("Preço de venda: %.2f%n", novoProdutoAula25.precoVenda);
        novoProdutoAula25.alterarPrecoCusto(80.00);
        System.out.printf("Alterando o preço de custo: %.2f",novoProdutoAula25.precoCusto);

    }
}
