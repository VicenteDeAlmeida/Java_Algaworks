package Modulo12_Interfaces_Continuacao.com.algaworks.financeira.modelo;

public class Industria extends EmpresaFinanciavel {

    public static final double TAXA_ACRESCIMO_LIMITE_INDUSTRIA_SUSTENTAVEL = 1.2;
    public static final double PERCENTUAL_FATURAMENTO_LIMITE_DE_CREDITO = 0.5;

    boolean conpensaEmissaoDeCo2;

    public Industria(String razaoSocial, double totalFaturamento, boolean conpensaEmissaoDeCo2) {
        super(razaoSocial, totalFaturamento);
        this.conpensaEmissaoDeCo2 = conpensaEmissaoDeCo2;
    }

    public boolean isConpensaEmissaoDeCo2() {
        return conpensaEmissaoDeCo2;
    }

    public void setConpensaEmissaoDeCo2(boolean conpensaEmissaoDeCo2) {
        this.conpensaEmissaoDeCo2 = conpensaEmissaoDeCo2;
    }

    @Override
    public double calcularLimiteAprovado() {
        double valorAprovado = getTotalFaturamento() * PERCENTUAL_FATURAMENTO_LIMITE_DE_CREDITO;

        if (isConpensaEmissaoDeCo2()) {
            valorAprovado *= TAXA_ACRESCIMO_LIMITE_INDUSTRIA_SUSTENTAVEL;
        }
        return valorAprovado;
    }

    @Override
    public double calcularJuros(double valorSolicitado) {
        return 5.0;
    }
}
