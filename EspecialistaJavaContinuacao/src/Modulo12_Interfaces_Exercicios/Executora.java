package Modulo12_Interfaces_Exercicios;

import Modulo12_Interfaces_Exercicios.com.algaworks.seguradora.modelo.Caminhao;
import Modulo12_Interfaces_Exercicios.com.algaworks.seguradora.modelo.CarroParticular;
import Modulo12_Interfaces_Exercicios.com.algaworks.seguradora.modelo.ImovelResidencial;
import Modulo12_Interfaces_Exercicios.com.algaworks.seguradora.modelo.VeiculoAutoMotor;
import Modulo12_Interfaces_Exercicios.com.algaworks.seguradora.servico.ServicoPropostaSeguro;

public class Executora {

    public static void main(String[] args) {
        ImovelResidencial casa = new ImovelResidencial(2_300_000,320);
        ServicoPropostaSeguro servico = new ServicoPropostaSeguro();
        casa.calcularValorPremio();
        servico.emitir(casa);

        CarroParticular duster = new CarroParticular("Duster",150_000,2022);
        duster.calcularValorPremio();
        servico.emitir(duster);

        Caminhao volvotruck = new Caminhao("Volvo truck",780_000,2021,4);
        volvotruck.calcularValorPremio();
        servico.emitir(volvotruck);

    }
}
