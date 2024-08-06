package Modulo1_OrientacaoAObjetos.Aula27_MetodoDeInstanciaAlterandoVariavelEstatica;

public class PrincipalTestAula27 {
    public static void main(String[] args) {
        ProdutoAula27.custoEmbalagem = 10;
        ProdutoAula27 novoProdutoAula25 = new ProdutoAula27();
        novoProdutoAula25.precoCusto = 100;

        ServicoDePrecificacaoAula27 servicoDePrecificacao = new ServicoDePrecificacaoAula27();
        servicoDePrecificacao.definirPrecoVenda(novoProdutoAula25,20);
        System.out.printf("Preço de venda: %.2f%n", novoProdutoAula25.precoVenda);
        novoProdutoAula25.alterarPrecoCusto(80.00);
        System.out.printf("Alterando o preço de custo: %.2f",novoProdutoAula25.precoCusto);

    }
}
