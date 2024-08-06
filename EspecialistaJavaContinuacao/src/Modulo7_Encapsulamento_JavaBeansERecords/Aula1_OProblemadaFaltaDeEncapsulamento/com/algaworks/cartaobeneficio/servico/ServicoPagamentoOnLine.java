package Modulo7_Encapsulamento_JavaBeansERecords.Aula1_OProblemadaFaltaDeEncapsulamento.com.algaworks.cartaobeneficio.servico;

import Modulo7_Encapsulamento_JavaBeansERecords.Aula1_OProblemadaFaltaDeEncapsulamento.com.algaworks.cartaobeneficio.Cartao;
import Modulo7_Encapsulamento_JavaBeansERecords.Aula1_OProblemadaFaltaDeEncapsulamento.com.algaworks.cartaobeneficio.Estabelecimento;
import Modulo7_Encapsulamento_JavaBeansERecords.Aula1_OProblemadaFaltaDeEncapsulamento.com.algaworks.cartaobeneficio.Recibo;

public class ServicoPagamentoOnLine {

    public Recibo efetuarPagamento(Estabelecimento estabelecimento, Cartao cartao,double valor){

        if (cartao.saldo < valor){
            throw new RuntimeException("Saldo insuficiente para pagamento");
        }

        cartao.saldo -= valor;

        return new Recibo(cartao.titular,"Pagamento",valor);

        //TODO realiza outras lógicas para efetuar o pagamento ao estabelecimento


    }
}
