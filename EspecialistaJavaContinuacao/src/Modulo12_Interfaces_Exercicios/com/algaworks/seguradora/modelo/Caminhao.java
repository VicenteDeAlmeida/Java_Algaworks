package Modulo12_Interfaces_Exercicios.com.algaworks.seguradora.modelo;

public class Caminhao extends VeiculoAutoMotor{

    public static final double PREMIO_CAMINHAO = 0.02;
    public static final int ADICIONAL_QUANTIDADE_DE_EIXOS = 50;
    private int quantidadeDeEixos;

    public Caminhao(String modelo, double valorMercado, int anoFabricacao, int quantidadeDeEixos) {
        super(modelo, valorMercado, anoFabricacao);
        this.quantidadeDeEixos = quantidadeDeEixos;
    }

    public int getQuantidadeDeEixos() {
        return quantidadeDeEixos;
    }

    public void setQuantidadeDeEixos(int quantidadeDeEixos) {
        this.quantidadeDeEixos = quantidadeDeEixos;
    }

    @Override
    public double calcularValorPremio() {
       double valorPremio = getValorMercado() * PREMIO_CAMINHAO;
       valorPremio += getQuantidadeDeEixos() *50;

       return valorPremio;
    }

    @Override
    public String descrever() {
        return String.format("Caminhão modelo %s,com o valor de mercado %.2f,ano de fabricação %d e com %d eixos ",
            getModelo(),getValorMercado(),getAnoFabricacao(),quantidadeDeEixos);
    }
}
