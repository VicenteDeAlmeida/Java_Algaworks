package Modulo6_Construtores_Pacotes_Visibilidade.Aula3_SobreCargaDeConstrutores;

import Modulo6_Construtores_Pacotes_Visibilidade.Aula1_CriandoConstrutores.Produto;

public class ProdutoAula3 {
    static final int QUANTIDADE_ESTOQUE_INICIAl = 100;
    int quantidadeEstoque;
    String nome;

    ProdutoAula3(){
        /*Aqui criamos um construtor vazio para que possamos também instanciar objetos sem passar nenhum argumento,somente chamar um método por exemplo
        * ou então passar atributos já predefinidos em variáveis*/
        this.nome = "Sem nome";
        this.quantidadeEstoque = QUANTIDADE_ESTOQUE_INICIAl;
    }



    ProdutoAula3(String nome){
        this.nome = nome;
        this.quantidadeEstoque = QUANTIDADE_ESTOQUE_INICIAl;

    }
    /*Sobrecarga de construtor é quando a gente cria mais de um construtor com parâmetros diferentes*/
    ProdutoAula3(String nome,int estoqueInicial){
        this.nome = nome;
        this.quantidadeEstoque = estoqueInicial;

    }
    /*Nesse caso o primeiro construtor recebe somente o nome com a quantidade em estoque como padrão e no segundo construtor vai receber
    * o nome e a quantidade em estoque definida pelo usuário */

void imprimeAlgo(){
    System.out.println("Imprime algo!!");
}

}
