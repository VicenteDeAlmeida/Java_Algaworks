package Modulo1_OrientacaoAObjetos.Aula33_SobreCargaDeMetods;

public class VisitanteAula33 {
    String nome;
    int idade;
    static final int IDADE_MINIMA_ACESSO = 18; /*Aqui estamos declarando a constante.Constante são variáveis que não podem ser alteradas*/

    boolean possuiIdadeParaAcesso(){
        return idade > IDADE_MINIMA_ACESSO;

    }
}
