package Modulo1_OrientacaoAObjetos.Aula27_MetodoDeInstanciaAlterandoVariavelEstatica;

public class ServicoDePrecificacaoAula27 {

    void definirPrecoVenda(ProdutoAula27 produtoAula26, double percentualMargemLucro){
        double precoVendaTotal = produtoAula26.precoCusto * ((percentualMargemLucro/100) +1);
        precoVendaTotal += ProdutoAula27.custoEmbalagem;
       produtoAula26.precoVenda = precoVendaTotal;




    }

}
