package Modulo13_2Continuacao_MelhoriaDoCodigoDoPacoteAnterior.com.algaworks.locadora.modelo;

public class Locacao {

    private Notebook notebook;
    private Precificacao precificacao;
    private Seguro seguro;

    public Locacao(Notebook notebook, Precificacao precificacao) {
        this.notebook = notebook;
        this.precificacao = precificacao;
    }

    public Locacao(Notebook notebook, Precificacao precificacao, Seguro seguro) {
        this(notebook, precificacao);
        this.seguro = seguro;
    }

    public Precificacao getPrecificacao() {
        return precificacao;
    }

    public Notebook getNotebook() {
        return notebook;
    }

    public Seguro getSeguro() {
        return seguro;
    }

    public boolean temSeguro() {
        return getSeguro() != null;
    }

    public double calcularValorDevido(double horasUtilizadas) {
        double valorTotal = getPrecificacao().calcularValorTotal(getNotebook(), horasUtilizadas);

        if (temSeguro()) {
            valorTotal += getSeguro().calcularPremio(horasUtilizadas, valorTotal);

        }

        return valorTotal;


    }
}
