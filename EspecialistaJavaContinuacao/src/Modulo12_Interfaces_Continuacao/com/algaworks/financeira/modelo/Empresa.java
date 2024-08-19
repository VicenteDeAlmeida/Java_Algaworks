package Modulo12_Interfaces_Continuacao.com.algaworks.financeira.modelo;

public abstract class Empresa {
    String RazaoSocial;
    double totalFaturamento;

    public Empresa(String razaoSocial, double totalFaturamento) {
        RazaoSocial = razaoSocial;
        this.totalFaturamento = totalFaturamento;
    }

    public String getRazaoSocial() {
        return RazaoSocial;
    }

    public double getTotalFaturamento() {
        return totalFaturamento;
    }




    public void separador() {
        System.out.println("--------------------------------------------------------------------------------------------");
    }
}


