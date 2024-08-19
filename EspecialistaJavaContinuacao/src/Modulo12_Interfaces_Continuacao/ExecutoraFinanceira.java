package Modulo12_Interfaces_Continuacao;

import Modulo12_Interfaces_Continuacao.com.algaworks.financeira.modelo.*;
import Modulo12_Interfaces_Continuacao.com.algaworks.servico.ServicoFinanciamento;

public class ExecutoraFinanceira {
    public static void main(String[] args) {

        Fazenda fazenda = new Fazenda("Fazenda Tio João", 10000, 100);
        ServicoFinanciamento servico = new ServicoFinanciamento();

        fazenda.calcularLimiteAprovado();
        servico.solicitarFinanciamento(fazenda, 5000);
        fazenda.separador();

        LojaVarejista lojaVarejista = new LojaVarejista("Lojas do Vicente",50,10);
        lojaVarejista.calcularLimiteAprovado();
        servico.solicitarFinanciamento(lojaVarejista,20000);
        lojaVarejista.separador();

        Industria industria = new Industria("Petroquimica Triunfo", 50000, true);
        industria.calcularLimiteAprovado();
        servico.solicitarFinanciamento(industria, 15000);
        industria.separador();

        Funcionario funcionario = new Funcionario(7000,"João da Silva");
        funcionario.calcularLimiteAprovado();
        servico.solicitarFinanciamento(funcionario,20000);






    }
}
