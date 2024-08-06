package Modulo1_OrientacaoAObjetos.Aula26_AtributosDeClasseComStatic;

public class ServicoDePrecificacaoAula26 {

    void definirPrecoVenda(ProdutoAula26 produtoAula26, double percentualMargemLucro){
        double precoVendaTotal = produtoAula26.precoCusto * ((percentualMargemLucro/100) +1);
        precoVendaTotal += ProdutoAula26.custoEmbalagem;
       produtoAula26.precoVenda = precoVendaTotal;




    }

}
