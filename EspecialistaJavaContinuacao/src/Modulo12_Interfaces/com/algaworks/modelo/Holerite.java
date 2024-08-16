package Modulo12_Interfaces.com.algaworks.modelo;

import Modulo12_Interfaces.com.algaworks.pagamento.Beneficiario;
import Modulo12_Interfaces.com.algaworks.pagamento.DocumentoPagavel;

/**
 * Implementação de Holerite como um Documento Pagavel que é a nossa Interface
 * Como eu tenho dois metódos abstratos na interface eu preciso implementar eles aqui também
 * */

public class Holerite implements DocumentoPagavel {

    private Beneficiario funcionario;
    private double valorHora;
    private int quantidadeHoras;

    public Holerite(Beneficiario funcionario, double valorHora, int quantidadeHoras) {
        this.funcionario = funcionario;
        this.valorHora = valorHora;
        this.quantidadeHoras = quantidadeHoras;
    }

    public Beneficiario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Beneficiario funcionario) {
        this.funcionario = funcionario;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public int getQuantidadeHoras() {
        return quantidadeHoras;
    }

    public void setQuantidadeHoras(int quantidadeHoras) {
        this.quantidadeHoras = quantidadeHoras;
    }

    @Override
    public double getValorTotal() {
        return getValorHora() * getQuantidadeHoras();
    }

    @Override
    public Beneficiario getBeneficiario() {
        return getFuncionario();
    }
}
