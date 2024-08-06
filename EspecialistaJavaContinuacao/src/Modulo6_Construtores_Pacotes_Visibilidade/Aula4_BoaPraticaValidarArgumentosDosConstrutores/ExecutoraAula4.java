package Modulo6_Construtores_Pacotes_Visibilidade.Aula4_BoaPraticaValidarArgumentosDosConstrutores;

public class ExecutoraAula4 {
    public static void main(String[] args) {
        ProdutoAula4 produto1 = new ProdutoAula4("Picanha 1kg (peça)");
        ProdutoAula4 produto2 = new ProdutoAula4("Arroz",5);
        ProdutoAula4 produto3 = new ProdutoAula4();
        produto3.imprimeAlgo();

        System.out.println("O nome do produto 1 é "+ produto1.nome);
        System.out.println("O nome do produto 2 é "+ produto2.nome);
        System.out.println("Quantidade em estoque do produto 1 é : "+ produto1.quantidadeEstoque);
        System.out.println("Quantidade em estoque do produto 2 é: "+ produto2.quantidadeEstoque);
        System.out.println("Produto 3 com valores já pré definidos no construtor nome: "+ produto3.nome);
        System.out.println("Produto 3 com valores já pré definidos no construtor  quantidade: "+ produto3.quantidadeEstoque);



    }
}
