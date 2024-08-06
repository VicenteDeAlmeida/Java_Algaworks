package Modulo6_Construtores_Pacotes_Visibilidade.Aula2_ConstrutoresComParametro;

public class ExecutoraAula2 {
    public static void main(String[] args) {
        ProdutoAula2 produto1 = new ProdutoAula2("Picanha 1kg (peça)",50);/*Aqui na isntanciação como eu passei
        argumentos para o construtor eu preciso também passar argumentos aqui,eles ficam como obrigatórios*/

        System.out.println("O nome do produto é "+ produto1.nome);
        System.out.println("Quantidade em estoque: "+ produto1.quantidadeEstoque);



    }
}
