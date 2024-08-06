package Modulo6_Construtores_Pacotes_Visibilidade.Aula6_EncadeamentoDeChamadasDeConstrutores;

public class ExecutoraAula5 {
    public static void main(String[] args) {
        ProdutoAula5 produto1 = new ProdutoAula5("Picanha 1kg (peça)");
        ProdutoAula5 produto2 = new ProdutoAula5("Arroz",5);
        ProdutoAula5 produto3 = new ProdutoAula5();
        produto3.imprimeAlgo();

        System.out.println("O nome do produto 1 é "+ produto1.nome);
        System.out.println("O nome do produto 2 é "+ produto2.nome);
        System.out.println("Quantidade em estoque do produto 1 é : "+ produto1.quantidadeEstoque);
        System.out.println("Quantidade em estoque do produto 2 é: "+ produto2.quantidadeEstoque);
        System.out.println("Produto 3 com valores já pré definidos no construtor nome: "+ produto3.nome);
        System.out.println("Produto 3 com valores já pré definidos no construtor  quantidade: "+ produto3.quantidadeEstoque);



    }
}
