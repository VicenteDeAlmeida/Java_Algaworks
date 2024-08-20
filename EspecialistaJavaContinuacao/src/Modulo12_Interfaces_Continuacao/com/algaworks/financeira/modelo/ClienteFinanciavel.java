package Modulo12_Interfaces_Continuacao.com.algaworks.financeira.modelo;

public interface ClienteFinanciavel {
    double JUROS_BAIXO_RISCO = 1.0;
    double JUROS_MEDIO_RISCO = 1.5;
    double JUROS_ALTO_RISCO = 2.0;

    /*Quando o método é abstrato,não é necessário colocar public abstract*/


    double calcularLimiteAprovado();

   default double calcularJuros(double valorSolicitado){
       /*Default quer dizer que posso usar esse mesmo método em todas as classes que implementam a interface sem a necessidade de fazer
       o override se a implementação desse método for a mesma para todas as classes.Exemplo como na classe industria onde o juro é de
       5% ai eu sobrescrevo o método somente retornando o valor dos juros.*/
       if (isFinanciamentoPequenoValor(valorSolicitado)){
           return JUROS_BAIXO_RISCO;
       } else if (isFinanciamentoGrandeValor(valorSolicitado)) {
           return JUROS_MEDIO_RISCO;

       }
       return JUROS_ALTO_RISCO;

   }

     static boolean isFinanciamentoGrandeValor(double valorSolicitado) {
        return valorSolicitado > 1_000_000;
    }

     static boolean isFinanciamentoPequenoValor(double valorSolicitado) {
        return valorSolicitado <= 100_000;
    }
}
