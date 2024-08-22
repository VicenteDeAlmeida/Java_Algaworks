package Modulo12_Interfaces_Continuacao;

import Modulo12_Interfaces_Continuacao.com.algaworks.financeira.modelo.ClienteFinanciavel;
import Modulo12_Interfaces_Continuacao.com.algaworks.financeira.modelo.Funcionario;
import Modulo12_Interfaces_Continuacao.com.algaworks.financeira.modelo.PessoaBonificavel;
import Modulo12_Interfaces_Continuacao.com.algaworks.servico.ServicoPagamentoBonus;

public class ExecutoraFinanceira1 {
    public static void main(String[] args) {

        PessoaBonificavel funcionario = new Funcionario(18_000,"João da Silva");
        funcionario.calcularBonus(10);
        ServicoPagamentoBonus servicoPagamentoBonus = new ServicoPagamentoBonus();
        servicoPagamentoBonus.pagarBonus(funcionario,80);




    }
}
