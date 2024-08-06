package Modulo1_OrientacaoAObjetos.Aula29_MetodoEstaticoAcessandoMembroDeInstancia;

public class ServicoDePrecificacaoAula29 {

    void definirPrecoVenda(ProdutoAula29 produtoAula28, double percentualMargemLucro){
        double precoVendaTotal = CalculoUtil29.calcularAcrescimo(produtoAula28.precoCusto,produtoAula28.precoVenda);
        precoVendaTotal += ProdutoAula29.custoEmbalagem;
       produtoAula28.precoVenda = precoVendaTotal;




    }

}
