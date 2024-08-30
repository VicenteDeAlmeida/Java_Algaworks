package Modulo14_Excecoes.Aula9_LanceExcecoesAoInvesDeNull;

public class ExecutoraCliente {
    public static void main(String[] args) {
        ServicoCadastroCliente servicoCadastroCliente = new ServicoCadastroCliente();
        Cliente cliente = servicoCadastroCliente.cadastrar("Vicente",15); /*No método de cadastrar se o cliente tiver a idade menor que 18
        vai retornar null e isso não é boa prática.A boa prática é criar uma classe exception personalizada*/

        System.out.printf("Cliente cadastrado: %s%n",cliente.getNome());
    }
}
