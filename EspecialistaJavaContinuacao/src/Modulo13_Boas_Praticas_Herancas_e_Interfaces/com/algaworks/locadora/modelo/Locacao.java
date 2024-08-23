package Modulo13_Boas_Praticas_Herancas_e_Interfaces.com.algaworks.locadora.modelo;

public abstract class Locacao {

    private Notebook notebook;

    public Locacao(Notebook notebook) {
        this.notebook = notebook;
    }

    public Notebook getNotebook() {
        return notebook;
    }

    public double calcularValorDevido(double horasUtilizadas){
        return 0;


    }
}
