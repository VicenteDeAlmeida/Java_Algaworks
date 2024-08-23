package Modulo13_Boas_Praticas_Herancas_e_Interfaces.com.algaworks.locadora.modelo;

public class LocacaoPorHora extends Locacao{

    public LocacaoPorHora(Notebook notebook) {
        super(notebook);
    }

    @Override
    public double calcularValorDevido(double horasUtilizadas) {
        return getNotebook().precoPorHora * horasUtilizadas;
    }
}
