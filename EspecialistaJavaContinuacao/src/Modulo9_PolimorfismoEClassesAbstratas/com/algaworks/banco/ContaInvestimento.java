package Modulo9_PolimorfismoEClassesAbstratas.com.algaworks.banco;

public class ContaInvestimento extends Conta {

    private static final int PORCENTAGEM = 100;
    private double valorTotalRendimento;

    public ContaInvestimento(Titular titular, int agencia, int numero) {
        super(titular, agencia, numero);
    }

    public double getValorTotalRendimento() {
        return valorTotalRendimento;
    }


    public void creditarRendimentos(double percentualJuros){

            double valorRendimentos = getSaldo() * percentualJuros / PORCENTAGEM;
            this.valorTotalRendimento += valorRendimentos;
            depositar(valorRendimentos);
    }


}
