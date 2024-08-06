package Modulo7_Encapsulamento_JavaBeansERecords.Aula2_ImplementandoEncapsulamento.com.algaworks.cartaobeneficio.servico;

import Modulo7_Encapsulamento_JavaBeansERecords.Aula2_ImplementandoEncapsulamento.com.algaworks.cartaobeneficio.Cartao;
import Modulo7_Encapsulamento_JavaBeansERecords.Aula2_ImplementandoEncapsulamento.com.algaworks.cartaobeneficio.Recibo;

public class ServicoDeDepositoPix {

    public Recibo efetuarDeposito(Cartao cartao , double valorDeposito){
        // TODO faz cobrança de valor no PIX
        cartao.depositar(valorDeposito);

        return new Recibo(cartao.obterTitular(), "Deposito",valorDeposito);
    }
}
