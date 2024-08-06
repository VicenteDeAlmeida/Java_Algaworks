package Modulo7_Encapsulamento_JavaBeansERecords.Aula6_LeiDeDemeter.com.algaworks.locacao;

public class GrupoVeiculo {
    private String grupo;
    private double valorDiaria;

    public GrupoVeiculo(){

    }

    public GrupoVeiculo(String grupo, double valorDiaria) {
        this.grupo = grupo;
        this.valorDiaria = valorDiaria;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public double getValorDiaria() {
        return valorDiaria;
    }

    public void setValorDiaria(double valorDiaria) {
        this.valorDiaria = valorDiaria;
    }
}
