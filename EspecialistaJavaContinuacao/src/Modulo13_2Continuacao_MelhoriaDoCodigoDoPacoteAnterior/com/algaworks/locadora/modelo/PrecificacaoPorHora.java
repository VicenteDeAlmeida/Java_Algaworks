package Modulo13_2Continuacao_MelhoriaDoCodigoDoPacoteAnterior.com.algaworks.locadora.modelo;

public class PrecificacaoPorHora implements Precificacao {


    @Override
    public double calcularValorTotal(Notebook notebook, double horasUtilizadas) {
        return notebook.getPrecoPorHora() * horasUtilizadas;
    }
}
