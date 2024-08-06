package Modulo1_OrientacaoAObjetos.Aula23_MetodosQueAlteramValorDeParametro.Aula29_MetodoEstaticoAcessandoMembroDeInstancia;

public class PrincipalAula28 {
    public static void main(String[] args) {
        ProdutoAula28.custoEmbalagem = 30;
        ProdutoAula28.alterarCustoEmbalagem(50);

        ProdutoAula28.imprimirCustoEmbalagem();

    }
}
