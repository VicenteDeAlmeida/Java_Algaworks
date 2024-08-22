package Modulo12_Interfaces_Exercicios.com.algaworks.seguradora.modelo;

public class ImovelResidencial implements BemSeguravel{
    public static final double PERCENTUAL_VALOR_MERCADO = 0.001;
    public static final double VALOR_POR_METRO_QUADRADO = 0.30;
    private double valorMercado;
    private int areaConstruida;

    public ImovelResidencial(double valorMercado, int areaConstruida) {
        this.valorMercado = valorMercado;
        this.areaConstruida = areaConstruida;
    }

    public double getValorMercado() {
        return valorMercado;
    }

    public void setValorMercado(double valorMercado) {
        this.valorMercado = valorMercado;
    }

    public int getAreaConstruida() {
        return areaConstruida;
    }

    public void setAreaConstruida(int areaConstruida) {
        this.areaConstruida = areaConstruida;
    }

    @Override
    public double calcularValorPremio() {
        return (valorMercado * PERCENTUAL_VALOR_MERCADO) + areaConstruida * VALOR_POR_METRO_QUADRADO;
    }


    @Override
    public String descrever() {
        return String.format("Imóvel residêncial com %dm2 de área construida avaliado em R$%.2f",areaConstruida,valorMercado);
    }

}
