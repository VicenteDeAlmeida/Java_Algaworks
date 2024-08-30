package Modulo13_1_Boas_Praticas_Herancas_e_Interfaces.com.algaworks.locadora.modelo;

public class LocacaoPorDiaSeguroSantander extends LocacaoPorDia{

    public LocacaoPorDiaSeguroSantander(Notebook notebook) {
        super(notebook);
    }

    @Override
    public double calcularValorDevido(double horasUtilizadas) {
        double valorTotal = super.calcularValorDevido(horasUtilizadas);
        valorTotal += (horasUtilizadas * 0.5) + (valorTotal * 0.05); /*Regra do seguro: 50 centavos por hora utilizada mais 5% do valor total*/
        return valorTotal;
    }
}
