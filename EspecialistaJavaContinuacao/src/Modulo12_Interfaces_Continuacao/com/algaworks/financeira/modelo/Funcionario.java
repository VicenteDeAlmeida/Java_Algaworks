package Modulo12_Interfaces_Continuacao.com.algaworks.financeira.modelo;

public class Funcionario implements PessoaBonificavel {

    public static final int QUANTIDADE_SALARIOS_LIMITE_CREDITO = 5;
    private double salarioMensal;
    private String nome;

    public Funcionario(double salarioMensal, String nome) {
        this.salarioMensal = salarioMensal;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(double salarioMensal) {
        this.salarioMensal = salarioMensal;
    }

    @Override
    public double calcularLimiteAprovado() {
        return getSalarioMensal() * QUANTIDADE_SALARIOS_LIMITE_CREDITO;
    }

    @Override
    public double calcularBonus(double percentualMetaAlcancada) {
        return getSalarioMensal() * percentualMetaAlcancada / 100;
    }
}
