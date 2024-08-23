package Modulo13_Continuacao_MelhoriaDoCodigoDoPacoteAnterior.com.algaworks.locadora.modelo;

public class Notebook {
    String Descricao;
    double precoPorHora;
    double precoPordia;

    public Notebook(String descricao, double precoPorHora, double precoPordia) {
        Descricao = descricao;
        this.precoPorHora = precoPorHora;
        this.precoPordia = precoPordia;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String descricao) {
        Descricao = descricao;
    }

    public double getPrecoPorHora() {
        return precoPorHora;
    }

    public void setPrecoPorHora(double precoPorHora) {
        this.precoPorHora = precoPorHora;
    }

    public double getPrecoPordia() {
        return precoPordia;
    }

    public void setPrecoPordia(double precoPordia) {
        this.precoPordia = precoPordia;
    }
}
