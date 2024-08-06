package Modulo1_OrientacaoAObjetos.Aula11_CriandoEInvocandoUmMetodo;

public class PessoaAula11 {
    String nome;
    String cpf;
    int anoNascimento;

    void imprimirDadosProprietario(){
        System.out.printf("Dados do proprietário:Nome:%s CPF:%s Ano de Nascimento:%d%n",nome,cpf,anoNascimento);
    }

}
