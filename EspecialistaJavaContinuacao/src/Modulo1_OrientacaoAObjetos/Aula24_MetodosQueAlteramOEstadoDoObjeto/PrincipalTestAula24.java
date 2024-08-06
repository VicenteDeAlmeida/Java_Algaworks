package Modulo1_OrientacaoAObjetos.Aula24_MetodosQueAlteramOEstadoDoObjeto;

public class PrincipalTestAula24 {
    public static void main(String[] args) {
        Produto novoProduto = new Produto();
        novoProduto.precoCusto = 100;

        ServicoDePrecificacaoAula24 servicoDePrecificacao = new ServicoDePrecificacaoAula24();
        servicoDePrecificacao.definirPrecoVenda(novoProduto,20);
        System.out.printf("Preço de venda: %.2f",novoProduto.precoVenda);


    }
}
