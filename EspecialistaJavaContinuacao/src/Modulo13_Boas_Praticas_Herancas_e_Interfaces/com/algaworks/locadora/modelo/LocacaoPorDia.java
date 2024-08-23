package Modulo13_Boas_Praticas_Herancas_e_Interfaces.com.algaworks.locadora.modelo;

public class LocacaoPorDia extends Locacao{

    public LocacaoPorDia(Notebook notebook) {
        super(notebook);
    }

    @Override
    public double calcularValorDevido(double horasUtilizadas) {
        double dias = Math.ceil(horasUtilizadas / 24d);
        return getNotebook().getPrecoPordia() * dias;
    }
}
