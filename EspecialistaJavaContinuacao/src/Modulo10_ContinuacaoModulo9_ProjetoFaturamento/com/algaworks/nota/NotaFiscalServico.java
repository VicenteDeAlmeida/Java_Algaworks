package Modulo10_ContinuacaoModulo9_ProjetoFaturamento.com.algaworks.nota;

public class NotaFiscalServico extends NotaFiscal {

    public static final int VALOR_MAXIMO_ISENCAO_FISCAL = 1_000;

    public static final double ALIQUOTA_IMPOSTOS = 0.18;

    private boolean intermunicipal;

    public NotaFiscalServico(String descricao, double valorTotal, boolean intermunicipal) {
        super(descricao, valorTotal);
        this.intermunicipal = intermunicipal;
    }

    public boolean isInterMunicipal(){
        return intermunicipal;
    }

    @Override
    public double calcularImpostos() {
        double valorImpostos = getValorTotal()* ALIQUOTA_IMPOSTOS;

        if (isIsentoImpostos()){
            valorImpostos = 0;
        }

        return valorImpostos;

    }

    private boolean isIsentoImpostos() {
        return isInterMunicipal() && getValorTotal() <= VALOR_MAXIMO_ISENCAO_FISCAL;
    }
}
