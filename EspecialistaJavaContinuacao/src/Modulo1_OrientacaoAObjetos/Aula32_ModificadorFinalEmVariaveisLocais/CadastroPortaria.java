package Modulo1_OrientacaoAObjetos.Aula32_ModificadorFinalEmVariaveisLocais;

import Modulo1_OrientacaoAObjetos.Aula31_DeclarandoConstantesComStaticEFinal.Visitante;

public class CadastroPortaria {

    void cadastrar(VisitanteAula32 novoVisitante, int tempoExipracaoEmMeses) {
        if (novoVisitante.possuiIdadeParaAcesso()) {
            final int tempoExpiracaoEmDias = tempoExipracaoEmMeses * 30; /*Colocando o final eu não posso mais alterar o valor dessa variável.Não posso por exemplo usar
         tempoExpiracaoEmDias +=1,reatribuir valores*/
            System.out.printf("Tempo do visitante %s cadastrado para %d dias%n", novoVisitante.nome, tempoExpiracaoEmDias);

        } else {
            System.out.println("O cadastro não foi realizado pois o visitante é menor de idade.");
        }
    }
}
