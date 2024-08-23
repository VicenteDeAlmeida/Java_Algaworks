package Modulo13_Boas_Praticas_Herancas_e_Interfaces.com.algaworks.locadora.modelo;

public class LocacaoPorHoraSeguroItau extends LocacaoPorHora{

    public LocacaoPorHoraSeguroItau(Notebook notebook) {
        super(notebook);
    }

    @Override
    public double calcularValorDevido(double horasUtilizadas) {
        double valorTotal = super.calcularValorDevido(horasUtilizadas);
        double dias = Math.ceil(horasUtilizadas / 24d);
        valorTotal += dias * 5;
        return valorTotal;
    }
}
