package Modulo12_Interfaces_Exercicios.com.algaworks.seguradora.modelo;

public abstract class VeiculoAutoMotor implements BemSeguravel {

   private String modelo;
   private double valorMercado;
   private int anoFabricacao;

    public VeiculoAutoMotor(String modelo, double valorMercado, int anoFabricacao) {
        this.modelo = modelo;
        this.valorMercado = valorMercado;
        this.anoFabricacao = anoFabricacao;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getValorMercado() {
        return valorMercado;
    }

    public void setValorMercado(double valorMercado) {
        this.valorMercado = valorMercado;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }
}
