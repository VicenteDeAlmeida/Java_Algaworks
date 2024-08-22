package Modulo12_Interfaces_Continuacao.com.algaworks.servico;

import Modulo12_Interfaces_Continuacao.com.algaworks.financeira.modelo.PessoaBonificavel;

public class ServicoPagamentoBonus {

   public void pagarBonus(PessoaBonificavel pessoa , double percentualMetaAlcancada){

        double valorBonus = pessoa.calcularBonus(percentualMetaAlcancada);

        System.out.printf("Bônus pago no valor de %.2f",valorBonus);

    }


}
