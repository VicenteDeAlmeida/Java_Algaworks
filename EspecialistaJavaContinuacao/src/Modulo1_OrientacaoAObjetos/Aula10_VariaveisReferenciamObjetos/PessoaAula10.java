package Modulo1_OrientacaoAObjetos.Aula10_VariaveisReferenciamObjetos;

public class PessoaAula10 {
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
