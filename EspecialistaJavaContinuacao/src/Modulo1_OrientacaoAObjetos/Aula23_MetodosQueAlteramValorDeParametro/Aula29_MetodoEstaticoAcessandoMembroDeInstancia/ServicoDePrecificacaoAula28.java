package Modulo1_OrientacaoAObjetos.Aula23_MetodosQueAlteramValorDeParametro.Aula29_MetodoEstaticoAcessandoMembroDeInstancia;

public class ServicoDePrecificacaoAula28 {

    void definirPrecoVenda(ProdutoAula28 produtoAula28, double percentualMargemLucro){
        double precoVendaTotal = CalculoUtil.calcularAcrescimo(produtoAula28.precoCusto,produtoAula28.precoVenda);
        precoVendaTotal += ProdutoAula28.custoEmbalagem;
       produtoAula28.precoVenda = precoVendaTotal;




    }

}
