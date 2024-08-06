package Modulo1_OrientacaoAObjetos.Aula34_InferenciaDeTipoDeVariavelLocal;

public class MainAula34 {
    public static void main(String[] args) {
        var novoVisitante = new VisitanteAula34();/*Substituindo o tipo por var o Java entende o tipo da variável,nesses casos Visitante e
        Cadastro Portaria*/
        var cadastroPortaria = new CadastroPortariaAula34();
        novoVisitante.nome = "João";
        novoVisitante.idade = 20;
        cadastroPortaria.cadastrar(novoVisitante,10);
        cadastroPortaria.cadastrar(novoVisitante);


    }
}
