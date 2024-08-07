package Modulo9_PolimorfismoEClassesAbstratas.com.algaworks.banco;

public class Conta {
    private Titular titular;
    private int agencia;
    private int numero;
    private double saldo;

    public Conta(Titular titular, int agencia, int numero) {
        this.titular = titular;
        this.agencia = agencia;
        this.numero = numero;
    }

    public Titular getTitular() {
        return titular;
    }


    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public final double getSaldo() {
        return saldo;
    } /*Aqui eu coloco o final no saldo para que esse método não seja sobrescrito
    e o saldo somente possa ser alterado através de saques e depósitos*/


    protected void validarSaldoParaSaque(double valorSaque){
        if (getSaldo() < valorSaque){
            throw new RuntimeException("Saldo insuficiente para saque.");
        }

    }

    public void sacar(double valorSaque){
        if (valorSaque <= 0){
            throw new IllegalArgumentException("Valor de saque deve ser maior que zero.");
        }

        validarSaldoParaSaque(valorSaque);

        saldo -= valorSaque;
    }

    public final void depositar(double valorDeposito){
        /*Colocando o método como final eu não sobrescrever mais ele*/
        if (valorDeposito <= 0){
            throw new IllegalArgumentException("Valor do depósito deve ser maior que zero.");
        }
        saldo += valorDeposito;
    }
    public void imprimirDemonstrativo(){

        System.out.println();
        System.out.printf("Agência: %d%n", getAgencia());
        System.out.printf("Conta: %d%n", getNumero());
        System.out.printf("Titular: %s%n", getTitular().getNome());
        System.out.printf("Saldo: %.2f%n", getSaldo());

    }

   /* @Override
    public String toString() {
        return "Dados da sua conta:" + "\n" +
            "Nome do titular:" + titular.getNome() + "\n" +
            "CPF do titular:" + titular.getCpf() + "\n" +
            "Agencia:" + agencia + "\n" +
            "Numero:" + numero + "\n" +
            "Saldo:" + saldo + "\n" ;
    }*/

    /*Outra maneira de implementar toString,diferente da implementação acima*/

    @Override
    public String toString(){
        return String.format("Dados da conta:%nTitular: %s%nCpf do titular: %s%nAgência: %d%nNúmero: %d",titular.getNome(),titular.getCpf(),agencia,numero);
    }
}
