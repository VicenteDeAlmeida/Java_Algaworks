package Modulo12_Interfaces_Exercicios.com.algaworks.seguradora.modelo;

public class CarroParticular extends VeiculoAutoMotor{

    public static final double PERCENTUAL_VALOR_MERCADO = 0.04;
    public static final double PERCENTUAL_SEMI_NOVO = 0.05;

    public CarroParticular(String modelo, double valorMercado, int anoFabricacao) {
        super(modelo, valorMercado, anoFabricacao);
    }

    @Override
    public double calcularValorPremio() {
        double valorPremio =  getValorMercado() * PERCENTUAL_VALOR_MERCADO;
        if (getAnoFabricacao() < 2000){
           return valorPremio * PERCENTUAL_SEMI_NOVO;

        }
       return valorPremio;
    }

    @Override
    public String descrever() {
        return String.format("Veículo modelo %s,com o valor de mercado %.2f e ano de fabricação %d",getModelo(),getValorMercado(),getAnoFabricacao());
    }
}
