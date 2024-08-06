package Modulo1_OrientacaoAObjetos.Aula26_AtributosDeClasseComStatic;

public class PrincipalTestAula26 {
    public static void main(String[] args) {
        ProdutoAula26.custoEmbalagem = 10;
        ProdutoAula26 novoProdutoAula25 = new ProdutoAula26();
        novoProdutoAula25.precoCusto = 100;

        ServicoDePrecificacaoAula26 servicoDePrecificacao = new ServicoDePrecificacaoAula26();
        servicoDePrecificacao.definirPrecoVenda(novoProdutoAula25,20);
        System.out.printf("Preço de venda: %.2f%n", novoProdutoAula25.precoVenda);
        novoProdutoAula25.alterarPrecoCusto(80.00);
        System.out.printf("Alterando o preço de custo: %.2f",novoProdutoAula25.precoCusto);

    }
}
