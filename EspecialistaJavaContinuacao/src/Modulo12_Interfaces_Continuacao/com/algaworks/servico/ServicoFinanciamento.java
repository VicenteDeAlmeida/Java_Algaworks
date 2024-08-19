package Modulo12_Interfaces_Continuacao.com.algaworks.servico;

import Modulo12_Interfaces_Continuacao.com.algaworks.financeira.modelo.ClienteFinanciavel;

public class ServicoFinanciamento {

    public void solicitarFinanciamento(ClienteFinanciavel cliente, double valorSolicitado) {

        double limiteAprovado = cliente.calcularLimiteAprovado();
        double jurosCalculados = cliente.calcularJuros(valorSolicitado);

        if (limiteAprovado < valorSolicitado) {
            System.out.printf("Financiamento não aprovado.Limite máximo de %.2f%n", limiteAprovado);
        } else {
            System.out.printf("Financiamento aprovado no valor de  R$%.2f com juros de %.2f%% . Limite máximo de %.2f%n",valorSolicitado,jurosCalculados,limiteAprovado);
        }


    }

    public double consultarLimiteAprovado(ClienteFinanciavel cliente) {
        // aqui poderia registrar a consulta em algum lugar para um consultor comercial entrar em contato
        // com o cliente (não vamos fazer isso, porque o objetivo agora é estudar OO primeiro)
        return cliente.calcularLimiteAprovado();
    }
}
