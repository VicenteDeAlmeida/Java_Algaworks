package Modulo9_PolimorfismoEClassesAbstratas.com.algaworks.banco;

public class ContaSalario extends Conta{

    private double salarioMensal;

    public ContaSalario(Titular titular, int agencia, int numero) {
        super(titular, agencia, numero);
        this.salarioMensal = salarioMensal;
    }

    public double getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(double salarioMensal) {
        this.salarioMensal = salarioMensal;
    }
}
