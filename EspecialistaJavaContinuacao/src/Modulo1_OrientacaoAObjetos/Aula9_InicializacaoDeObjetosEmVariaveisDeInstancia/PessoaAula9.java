package Modulo1_OrientacaoAObjetos.Aula9_InicializacaoDeObjetosEmVariaveisDeInstancia;

public class PessoaAula9 {
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
