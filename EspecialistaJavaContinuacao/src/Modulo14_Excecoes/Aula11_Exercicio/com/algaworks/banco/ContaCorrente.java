package Modulo14_Excecoes.Aula11_Exercicio.com.algaworks.banco;

import java.util.Objects;

public class ContaCorrente {

    private int numero;
    private double saldo;
    private boolean ativa;

    public ContaCorrente(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean isAtiva() {
        return ativa;
    }
    public boolean isInativa(){
        return !isAtiva();
    }

    public void ativar(){
        this.ativa = true;

    }

    public void desativar(){
        this.ativa = false;
    }

    public void sacar(double valor){

        if (valor <= 0){
            throw new IllegalArgumentException("Valor de saque deve ser maior que zero");
        }
        if (valor > this.saldo){
            throw new SaldoInsuficienteException("Saldo insuficiente para saque");
        }
        if (isInativa()){
            throw new ContaInativaException("Não é possível realizar saque de uma conta inativa");
        }
        this.saldo -= valor;

    }
    public void depositar(double valordeposito){
        if (valordeposito == 0){
            throw new IllegalArgumentException("Valor de depósito não pode ser zero");
        }
        if (valordeposito < 0){
            throw new IllegalArgumentException("Valor de depósito não pode ser negativo");
        }
        if (isInativa()){
            throw new ContaInativaException("Não é possível depositar em uma conta inativa");
        }
        this.saldo += valordeposito;

    }

    public void transferir(ContaCorrente contaAtual,ContaCorrente contaDestino,double valorTransferencia){
        Objects.requireNonNull(contaDestino);

        if (contaDestino.isInativa()){
            throw new ContaInativaException("A conta de destino não pode estar inativa.");
        }
        if (contaAtual.isInativa()){
            throw new ContaInativaException("A conta atual não pode estar inativa.");
        }
        if (contaAtual.getSaldo() < valorTransferencia){
            throw new SaldoInsuficienteException("Não há saldo suficiente para transferência");
        }
        sacar(valorTransferencia);
        contaDestino.depositar(valorTransferencia);
    }
}
