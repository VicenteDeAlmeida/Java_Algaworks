package Modulo11_Exercicio_PolimorfismoEClassesAbstratas;

public class PessoaFisica extends Pessoa{

    public static final double RECEITA_ANUAL_ISENCAO = 50000;
    public static final double ALIQUOTA_IMPOSTO_DE_RENDA = 0.20;

    private double receitaAnual;

    public PessoaFisica(String nome, double receitaAnual) {
        super(nome);
        this.receitaAnual = receitaAnual;
    }

    public double getReceitaAnual() {
        return receitaAnual;
    }

    @Override
    public double calcularImposto() {
        /*Receita anual * imposto de renda*/
        double valorImposto = getReceitaAnual() * ALIQUOTA_IMPOSTO_DE_RENDA;

        if (isIsento()){
            valorImposto = 0;

        }
        return valorImposto;



    }

    private boolean isIsento() {
        return getReceitaAnual() <= RECEITA_ANUAL_ISENCAO;
    }

}
