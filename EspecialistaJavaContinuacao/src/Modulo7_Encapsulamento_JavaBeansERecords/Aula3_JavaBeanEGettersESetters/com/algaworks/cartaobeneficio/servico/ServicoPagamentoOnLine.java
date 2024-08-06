package Modulo7_Encapsulamento_JavaBeansERecords.Aula3_JavaBeanEGettersESetters.com.algaworks.cartaobeneficio.servico;

import Modulo7_Encapsulamento_JavaBeansERecords.Aula3_JavaBeanEGettersESetters.com.algaworks.cartaobeneficio.Cartao;
import Modulo7_Encapsulamento_JavaBeansERecords.Aula3_JavaBeanEGettersESetters.com.algaworks.cartaobeneficio.Estabelecimento;
import Modulo7_Encapsulamento_JavaBeansERecords.Aula3_JavaBeanEGettersESetters.com.algaworks.cartaobeneficio.Recibo;

public class ServicoPagamentoOnLine {

    public Recibo efetuarPagamento(Estabelecimento estabelecimento, Cartao cartao, double valor){
        cartao.debitar(valor);

        return new Recibo(cartao.getTitular(),"Pagamento",valor);

        //TODO realiza outras lógicas para efetuar o pagamento ao estabelecimento


    }
}
