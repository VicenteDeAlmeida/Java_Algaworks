package Modulo14_Excecoes.Aula9_LanceExcecoesAoInvesDeNull;

public class ServicoCadastroCliente {

    public Cliente cadastrar(String nome ,int idade){
        if (idade < 18){
            //return null;

            throw new MenorDeIdadeException("Cliente menor de idade não pode ser cadastrado");
        }

        return new Cliente(nome, idade);

    }

}
