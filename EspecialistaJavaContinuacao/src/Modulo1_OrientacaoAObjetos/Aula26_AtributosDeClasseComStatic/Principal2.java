package Modulo1_OrientacaoAObjetos.Aula26_AtributosDeClasseComStatic;

public class Principal2 {
    public static void main(String[] args) {
        ProdutoAula26 produto1 = new ProdutoAula26();
        ProdutoAula26 produto2 = new ProdutoAula26();

        ProdutoAula26.custoEmbalagem = 30; /*Como o atributo é do tipo static,eu somente acesso ele através da classe e não através da instância.
        Nesse caso entendemos que o custo da embalagem para qualquer produto será de 30*/


        produto1.imprimirCustoEmbalagem();
        produto2.imprimirCustoEmbalagem();
    }
}
