package Modulo14_Excecoes.Aula6_Criando_Excecoes_Customizadas;


import java.util.Scanner;


public class Principal {
    public static void main(String[] args) throws ProdutoInativoException {

        ProdutoAula6 produto = new ProdutoAula6("Relógio");
        produto.ativar();
        produto.adicionarEstoque(20);
        comprar(produto);

    }

    private static void comprar(ProdutoAula6 produto) throws ProdutoInativoException {
        Scanner scanner = new Scanner(System.in);
        do {
            try {
                System.out.print("Quantidade: ");
                int quantidade = scanner.nextInt();

                efetuarBaixaEstoque(produto,quantidade);
                System.out.println("Compra finalizada");
                break;

            }
            catch (IllegalArgumentException e){
                System.out.println("Erro na compra: " + e.getMessage());
            }
            catch (ProdutoSemEstoqueException s){
                System.out.printf("Erro na compra: %s. Estoque disponível: %d.Estoque necessário: %d%n",s.getMessage(),s.getEstoqueDisponivel(),
                s.getEstoqueNecessario());

            }

        }
        while (true);


    }

    private static void efetuarBaixaEstoque(ProdutoAula6 produto, int quantidade) throws ProdutoSemEstoqueException, ProdutoInativoException {
        produto.retirarEstoque(quantidade);
        System.out.printf("%d unidades retiradas do estoque.Estoque atual: %d%n",quantidade,produto.getQuantidadeEstoque());

    }

}
