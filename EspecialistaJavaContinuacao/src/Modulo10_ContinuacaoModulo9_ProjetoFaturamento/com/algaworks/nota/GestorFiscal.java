package Modulo10_ContinuacaoModulo9_ProjetoFaturamento.com.algaworks.nota;

public class GestorFiscal {

    public void emitirNotasFiscais(NotaFiscal... notasFiscais){
        for (NotaFiscal notaFiscal : notasFiscais){
            notaFiscal.emitir();
            System.out.println("------------------");
        }

    }
}
