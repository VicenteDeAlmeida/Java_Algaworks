package Modulo1_OrientacaoAObjetos.Aula12_ImplementandoALogicaDoMetodo;

public class PessoaAula12 {
    String nome;
    String cpf;
    int anoNascimento;

    void imprimirDadosProprietario(){
        System.out.printf("Dados do proprietário:\nNome:%s CPF:%s Ano de Nascimento:%d%n",nome,cpf,anoNascimento);
    }

}
