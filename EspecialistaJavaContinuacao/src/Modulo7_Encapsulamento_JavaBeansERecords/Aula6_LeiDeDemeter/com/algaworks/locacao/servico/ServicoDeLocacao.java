package Modulo7_Encapsulamento_JavaBeansERecords.Aula6_LeiDeDemeter.com.algaworks.locacao.servico;

import Modulo7_Encapsulamento_JavaBeansERecords.Aula6_LeiDeDemeter.com.algaworks.locacao.Locacao;

public class ServicoDeLocacao {

    public void confirmarLocacao(Locacao locacao){
        //double totalDiarias = locacao.getVeiculo().getGrupo().getValorDiaria() * locacao.getQuantidadeDiarias();
        //double totalDiarias = locacao.getValorDiaria() * locacao.getQuantidadeDiarias();

        double totalDiarias = locacao.calcularTotalDiarias();

        /*Realiza lógica para registrar locação pelo valor das diárias*/

        locacao.reservarVeiculo();

    }
}
