package Modulo1_OrientacaoAObjetos.Aula27_MetodoDeInstanciaAlterandoVariavelEstatica;

public class PrincipalAula27 {
    public static void main(String[] args) {
        ProdutoAula27 produto1 = new ProdutoAula27();
        ProdutoAula27 produto2 = new ProdutoAula27();

        ProdutoAula27.custoEmbalagem = 30; /*Como o atributo é do tipo static,eu somente acesso ele através da classe e não através da instância.
        Nesse caso entendemos que o custo da embalagem para qualquer produto será de 30*/
        produto1.imprimirCustoEmbalagem();
        produto2.imprimirCustoEmbalagem();
    }
}
