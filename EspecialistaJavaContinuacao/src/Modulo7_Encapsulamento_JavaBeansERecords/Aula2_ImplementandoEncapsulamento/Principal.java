package Modulo7_Encapsulamento_JavaBeansERecords.Aula2_ImplementandoEncapsulamento;

import Modulo7_Encapsulamento_JavaBeansERecords.Aula1_OProblemadaFaltaDeEncapsulamento.com.algaworks.cartaobeneficio.Cartao;
import Modulo7_Encapsulamento_JavaBeansERecords.Aula1_OProblemadaFaltaDeEncapsulamento.com.algaworks.cartaobeneficio.Estabelecimento;
import Modulo7_Encapsulamento_JavaBeansERecords.Aula1_OProblemadaFaltaDeEncapsulamento.com.algaworks.cartaobeneficio.Recibo;
import Modulo7_Encapsulamento_JavaBeansERecords.Aula1_OProblemadaFaltaDeEncapsulamento.com.algaworks.cartaobeneficio.servico.ServicoDeDepositoPix;
import Modulo7_Encapsulamento_JavaBeansERecords.Aula1_OProblemadaFaltaDeEncapsulamento.com.algaworks.cartaobeneficio.servico.ServicoPagamentoOnLine;

public class Principal {
    public static void main(String[] args) {

        var supermercado = new Estabelecimento("Supermercado do Zé");
        var cartao = new Cartao("Mario Loco");

        var servicoDeDeposito = new ServicoDeDepositoPix();
        Recibo reciboDeposito = servicoDeDeposito.efetuarDeposito(cartao,500);
        reciboDeposito.imprimir();

        var servicoDePagamento = new ServicoPagamentoOnLine();
        Recibo reciboPagamento = servicoDePagamento.efetuarPagamento(supermercado,cartao,100);
        reciboPagamento.imprimir();

        System.out.printf("Titular: %s%n",cartao.titular);
        System.out.printf("Saldo: %.2f",cartao.saldo);

    }
}
