package Modulo1_OrientacaoAObjetos.Aula23_MetodosQueAlteramValorDeParametro.Aula29_MetodoEstaticoAcessandoMembroDeInstancia;

public class CalculoUtil {

    static double calcularAcrescimo(double valor , double percentual){
        return valor * ((percentual/100) +1);
    }
}
