package Modulo7_Encapsulamento_JavaBeansERecords.Aula1_OProblemadaFaltaDeEncapsulamento.com.algaworks.cartaobeneficio.servico;

import Modulo7_Encapsulamento_JavaBeansERecords.Aula1_OProblemadaFaltaDeEncapsulamento.com.algaworks.cartaobeneficio.Cartao;
import Modulo7_Encapsulamento_JavaBeansERecords.Aula1_OProblemadaFaltaDeEncapsulamento.com.algaworks.cartaobeneficio.Recibo;

public class ServicoDeDepositoPix {

    public Recibo efetuarDeposito(Cartao cartao , double valorDeposito){
        // TODO faz cobrança de valor no PIX

        if (valorDeposito < Cartao.VALOR_MINIMO_DEPOSITO){
            throw  new IllegalArgumentException(String.format("Valor de depósito não pode ser menor que %.2f",Cartao.VALOR_MINIMO_DEPOSITO));

        }

        cartao.saldo += valorDeposito - Cartao.TARIFA_DEPOSITO;

        return new Recibo(cartao.titular, "Deposito",valorDeposito);
    }
}
