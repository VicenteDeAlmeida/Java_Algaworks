package Modulo12_Interfaces_Continuacao.com.algaworks.financeira.modelo;

public class LojaVarejista extends EmpresaFinanciavel{

    public static final double PERCERNTUAL_FATURAMENTO_LIMITE_CREDITO = 0.2;
    public static final double PERCERNTUAL_VALOR_ESTOQUE_LIMITE_CREDITO = 0.5;

    double valorTotalEstoque;

    public LojaVarejista(String razaoSocial, double totalFaturamento, double valorTotalEstoque) {
        super(razaoSocial, totalFaturamento);
        this.valorTotalEstoque = valorTotalEstoque;
    }

    public double getValorTotalEstoque() {
        return valorTotalEstoque;
    }

    public void setValorTotalEstoque(double valorTotalEstoque) {
        this.valorTotalEstoque = valorTotalEstoque;
    }

    @Override
    public double calcularLimiteAprovado() {
        return (getTotalFaturamento() * PERCERNTUAL_FATURAMENTO_LIMITE_CREDITO) + (getValorTotalEstoque() * PERCERNTUAL_VALOR_ESTOQUE_LIMITE_CREDITO);
    }

}

