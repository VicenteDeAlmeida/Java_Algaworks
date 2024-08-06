package Modulo6_Construtores_Pacotes_Visibilidade.Aula8_ModificadorFinalEmVariaveisDeInstancia;

public class ExecutoraAula8 {
    public static void main(String[] args) {
        ProdutoAula8 produto1 = new ProdutoAula8("Picanha 1kg (peça)");
        ProdutoAula8 produto2 = new ProdutoAula8("Arroz",5);
        ProdutoAula8 produto3 = new ProdutoAula8();
        produto3.imprimeAlgo();

        System.out.println("O nome do produto 1 é "+ produto1.nome);
        System.out.println("O nome do produto 2 é "+ produto2.nome);
        System.out.println("Quantidade em estoque do produto 1 é : "+ produto1.quantidadeEstoque);
        System.out.println("Quantidade em estoque do produto 2 é: "+ produto2.quantidadeEstoque);
        System.out.println("Produto 3 com valores já pré definidos no construtor nome: "+ produto3.nome);
        System.out.println("Produto 3 com valores já pré definidos no construtor  quantidade: "+ produto3.quantidadeEstoque);
        System.out.println("Vendas produto 1: " + produto1.quantidadeVendida + " unidades");
        System.out.println("Código produto 1: " + produto1.codigo);
        System.out.println("Código com randômico com UUID " + produto2.outroCodigo);
        System.out.println("Outro código com randômico com UUID " + produto3.outroCodigo);



    }
}
