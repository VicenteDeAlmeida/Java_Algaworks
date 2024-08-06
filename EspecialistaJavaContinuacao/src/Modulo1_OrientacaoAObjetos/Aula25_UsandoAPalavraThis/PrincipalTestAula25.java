package Modulo1_OrientacaoAObjetos.Aula25_UsandoAPalavraThis;

public class PrincipalTestAula25 {
    public static void main(String[] args) {
        ProdutoAula25 novoProdutoAula25 = new ProdutoAula25();
        novoProdutoAula25.precoCusto = 100;

        ServicoDePrecificacaoAula25 servicoDePrecificacao = new ServicoDePrecificacaoAula25();
        servicoDePrecificacao.definirPrecoVenda(novoProdutoAula25,20);
        System.out.printf("Preço de venda: %.2f%n", novoProdutoAula25.precoVenda);
        novoProdutoAula25.alterarPrecoCusto(80.00);
        System.out.printf("Alterando o preço de custo: %.2f",novoProdutoAula25.precoCusto);

    }
}
