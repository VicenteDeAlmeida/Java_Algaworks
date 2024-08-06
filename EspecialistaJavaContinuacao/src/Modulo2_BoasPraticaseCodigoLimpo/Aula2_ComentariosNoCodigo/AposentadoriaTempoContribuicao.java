package Modulo2_BoasPraticaseCodigoLimpo.Aula2_ComentariosNoCodigo;

public class AposentadoriaTempoContribuicao {
    void solicitarAposentadoria(Contribuinte contribuinte) {


        if (contribuinte.estaElegivelParaAposentadoria()) {
            System.out.println("Se não se aposentou já era!!");
        }
    }


}
