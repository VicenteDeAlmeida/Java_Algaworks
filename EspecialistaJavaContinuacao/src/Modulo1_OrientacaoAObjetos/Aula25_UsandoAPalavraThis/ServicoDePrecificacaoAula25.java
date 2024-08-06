package Modulo1_OrientacaoAObjetos.Aula25_UsandoAPalavraThis;

public class ServicoDePrecificacaoAula25 {

    void definirPrecoVenda(ProdutoAula25 produtoAula25, double percentualMargemLucro){
       produtoAula25.precoVenda =  produtoAula25.precoCusto * ((percentualMargemLucro/100) +1);




    }

}
