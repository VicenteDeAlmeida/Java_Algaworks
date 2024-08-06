package Modulo6_Construtores_Pacotes_Visibilidade.Aula3_SobreCargaDeConstrutores;

public class ExecutoraAula3 {
    public static void main(String[] args) {
        ProdutoAula3 produto1 = new ProdutoAula3("Picanha 1kg (peça)");/*Aqui cada objeto foi instanciado com um construtor diferente*/
        ProdutoAula3 produto2 = new ProdutoAula3("Arroz",5);
        ProdutoAula3 produto3 = new ProdutoAula3();
        produto3.imprimeAlgo();

        System.out.println("O nome do produto 1 é "+ produto1.nome);
        System.out.println("O nome do produto 2 é "+ produto2.nome);
        System.out.println("Quantidade em estoque do produto 1 é : "+ produto1.quantidadeEstoque);
        System.out.println("Quantidade em estoque do produto 2 é: "+ produto2.quantidadeEstoque);
        System.out.println("Produto 3 com valores já pré definidos no construtor nome: "+ produto3.nome);
        System.out.println("Produto 3 com valores já pré definidos no construtor  quantidade: "+ produto3.quantidadeEstoque);



    }
}
