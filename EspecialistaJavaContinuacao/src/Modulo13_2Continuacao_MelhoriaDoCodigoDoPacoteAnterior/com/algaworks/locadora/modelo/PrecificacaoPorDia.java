package Modulo13_2Continuacao_MelhoriaDoCodigoDoPacoteAnterior.com.algaworks.locadora.modelo;

public class PrecificacaoPorDia implements Precificacao{


    @Override
    public double calcularValorTotal(Notebook notebook, double horasUtilizadas) {
        double dias = Math.ceil(horasUtilizadas / 24d);

        return notebook.getPrecoPordia() * dias;
    }
}
