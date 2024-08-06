package Modulo1_OrientacaoAObjetos.Aula34_InferenciaDeTipoDeVariavelLocal;

public class CadastroPortariaAula34 {

   static final int TEMPO_EXIPRACAO_PADRAO_EM_MESES = 1;

    void cadastrar(final VisitanteAula34 visitanteAula33){
        this.cadastrar(visitanteAula33, TEMPO_EXIPRACAO_PADRAO_EM_MESES);
    }
    /*Exemplo de cobrecarga de métodos onde eu tenho um método com o mesmo nome porém com parâmetros diferentes,nesse caso estou cadastrando o
    * método com o mesmo nome porém passando o tempo de expiração com uma constante*/

    void cadastrar(VisitanteAula34 novoVisitante, int tempoExipracaoEmMeses) {
        if (novoVisitante.possuiIdadeParaAcesso()) {
            final int tempoExpiracaoEmDias = tempoExipracaoEmMeses * 30;
            System.out.printf("Tempo do visitante %s cadastrado para %d dias%n", novoVisitante.nome, tempoExpiracaoEmDias);

        } else {
            System.out.println("O cadastro não foi realizado pois o visitante é menor de idade.");
        }
    }
}
