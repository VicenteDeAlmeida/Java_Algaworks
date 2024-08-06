package Modulo1_OrientacaoAObjetos.Aula33_SobreCargaDeMetods;

public class MainAula33 {
    public static void main(String[] args) {
        VisitanteAula33 novoVisitante = new VisitanteAula33();
        CadastroPortariaAula33 cadastroPortaria = new CadastroPortariaAula33();
        novoVisitante.nome = "João";
        novoVisitante.idade = 20;
        cadastroPortaria.cadastrar(novoVisitante,10);
        cadastroPortaria.cadastrar(novoVisitante);


    }
}
