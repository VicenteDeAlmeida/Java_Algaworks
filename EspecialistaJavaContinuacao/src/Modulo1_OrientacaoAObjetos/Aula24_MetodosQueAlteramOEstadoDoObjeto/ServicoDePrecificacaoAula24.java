package Modulo1_OrientacaoAObjetos.Aula24_MetodosQueAlteramOEstadoDoObjeto;

public class ServicoDePrecificacaoAula24 {

    void definirPrecoVenda(Produto produto,double percentualMargemLucro){
       produto.precoVenda =  produto.precoCusto * ((percentualMargemLucro/100) +1);




    }

}
