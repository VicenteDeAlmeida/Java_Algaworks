package Modulo2_BoasPraticaseCodigoLimpo.Aula1_TamanhoEOrganizacaoDeClasses;

public class Cliente {
    /*Primeiro sempre os atributos e depois os métodos.Dica: Atributos podem ser chamados também de variáveis de classe quando forem constantes*/

    static final double TAXA_LIMITE_CREDITO = 0.10;
    static final double LIMITE_CREDITO_MINIMO = 10_000;

    double faturamentoAnual;
    String razaoSocial;

    double calcularLimiteCredito(){
        double limiteCredito = faturamentoAnual * TAXA_LIMITE_CREDITO;

        if (limiteCredito < LIMITE_CREDITO_MINIMO){
            limiteCredito = LIMITE_CREDITO_MINIMO;
        }
        return limiteCredito;
    }
}
