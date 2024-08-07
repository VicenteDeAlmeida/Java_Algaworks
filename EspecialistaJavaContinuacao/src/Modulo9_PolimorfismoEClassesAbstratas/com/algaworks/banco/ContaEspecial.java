package Modulo9_PolimorfismoEClassesAbstratas.com.algaworks.banco;

public class ContaEspecial extends ContaInvestimento {

    private double tarifaMensal;
    private double limiteChequeEspecial;

    public ContaEspecial(Titular titular, int agencia, int numero, double tarifaMensal) {
        super(titular, agencia, numero);
        this.tarifaMensal = tarifaMensal;
    }

    public double getTarifaMensal() {
        return tarifaMensal;
    }

    public void setTarifaMensal(double tarifaMensal) {
        this.tarifaMensal = tarifaMensal;
    }

    public double getLimiteChequeEspecial() {
        return limiteChequeEspecial;
    }

    public void setLimiteChequeEspecial(double limiteChequeEspecial) {
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    public double getsaldoDisponivel() {
        return getSaldo() + getLimiteChequeEspecial();
    }

    @Override
    public void imprimirDemonstrativo() {
        /*Isso aqui é sobrescrita de método,quando eu crio um método com o mesmo nome que já exista em alguma classe
         * e adiciono informações que serão necessária de utilizar somente na classe que eu to sobrescrevendo o método
         * A anotação override indica que se trata de um método sobrescrito*/
        super.imprimirDemonstrativo();/*Com a utilização do super eu invoco o método da superclasse (nesse caso Conta) dentro de uma subclasse*/
        System.out.printf("Saldo disponível: %.2f%n", getsaldoDisponivel());

    }

    @Override
    protected void validarSaldoParaSaque(double valorSaque) {
        if (getsaldoDisponivel() < valorSaque) {
            throw new RuntimeException("Saldo insuficiente para saque.");
        }

    }



    public void debitarTarifaMensal() {
        sacar(getTarifaMensal());
    }

}

