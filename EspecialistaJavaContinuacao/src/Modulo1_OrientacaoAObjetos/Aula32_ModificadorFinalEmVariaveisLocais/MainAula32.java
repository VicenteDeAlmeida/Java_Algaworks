package Modulo1_OrientacaoAObjetos.Aula32_ModificadorFinalEmVariaveisLocais;

public class MainAula32 {
    public static void main(String[] args) {
        VisitanteAula32 novoVisitante = new VisitanteAula32();
        CadastroPortaria cadastroPortaria = new CadastroPortaria();
        novoVisitante.nome = "João";
        novoVisitante.idade = 20;
        cadastroPortaria.cadastrar(novoVisitante,10);


    }
}
