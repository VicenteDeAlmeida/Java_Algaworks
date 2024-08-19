package Modulo12_Interfaces_Continuacao.com.algaworks.financeira.modelo;

public interface ClienteFinanciavel {
/*Quando o método é abstrato,não é necessário colocar public abstract*/


    double calcularLimiteAprovado();

   default double calcularJuros(double valorSolicitado){
       /*Default quer dizer que posso usar esse mesmo método em todas as classes que implementam a interface sem a necessidade de fazer
       o override se a implementação desse método for a mesma para todas as classes.Exemplo como na classe industria onde o juro é de
       5% ai eu sobrescrevo o método somente retornando o valor dos juros.*/
       if (valorSolicitado <= 100_000){
           return 1.0;
       } else if (valorSolicitado <= 1_000_000) {
           return 1.5;

       }
       return 2.0;

   }
}
