package Modulo10_ContinuacaoModulo9_ProjetoFaturamento;

import Modulo10_ContinuacaoModulo9_ProjetoFaturamento.com.algaworks.nota.GestorFiscal;
import Modulo10_ContinuacaoModulo9_ProjetoFaturamento.com.algaworks.nota.NotaFiscalProduto;
import Modulo10_ContinuacaoModulo9_ProjetoFaturamento.com.algaworks.nota.NotaFiscalServico;

public class ExecutoraNotas {

    public static void main(String[] args) {
        GestorFiscal gestorFiscal = new GestorFiscal();
        NotaFiscalProduto nfBolaFutebol = new NotaFiscalProduto("Bola de futebol",300,50);
        NotaFiscalServico nfReparoDoMotor = new NotaFiscalServico("Reparo de roda",1100,true);

        gestorFiscal.emitirNotasFiscais(nfBolaFutebol,nfReparoDoMotor);

       /* System.out.println(nfBolaFutebol.calcularImpostos());
        System.out.println(nfReparoDoMotor.calcularImpostos());*/
    }
}
