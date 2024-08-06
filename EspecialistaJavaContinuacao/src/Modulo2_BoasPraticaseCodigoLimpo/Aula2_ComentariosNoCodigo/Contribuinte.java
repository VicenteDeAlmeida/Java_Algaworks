package Modulo2_BoasPraticaseCodigoLimpo.Aula2_ComentariosNoCodigo;

public class Contribuinte {
    public static final int IDADE_MINIMA_APOSENTADORIA = 65;
    int idade;
    double tempoContribuicao;

    boolean estaElegivelParaAposentadoria() {
        return this.idade >= IDADE_MINIMA_APOSENTADORIA;
    }
}

/*Nessa aula pegamos o código cheio de comentários e fomos refatorando,deixando melhor e excluindo os comentários.
* Os código sdevem ser expressivos por si mesmo sem ajuda de comentários*/
