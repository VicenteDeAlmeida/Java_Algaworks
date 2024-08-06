package Modulo1_OrientacaoAObjetos.Aula7_AtribuindoOObjetoNaComposicao;

public class PessoaAula7 {
    String nome;
    String cpf;
    int anoNascimento;

    @Override
    public String toString() {
        return "Nome:" + nome +
            ", Cpf: " + cpf  +
            ", anoNascimento: " + anoNascimento ;
    }
}
