package Modulo1_OrientacaoAObjetos.Aula11_CriandoEInvocandoUmMetodo;

public class ClasseExecutavel {
    public static void main(String[] args) {

        PessoaAula11 pessoa = new PessoaAula11();
        pessoa.nome = "Vicente";
        pessoa.cpf = "0255212897897";
        pessoa.anoNascimento = 1981;




        CarroAula11 carro1 = new CarroAula11();
        CarroAula11 carro2 = new CarroAula11();
        carro1.modelo = "Uno Mile";
        carro1.anoFabricacao = 2002;
        carro1.proprietario = pessoa;
        pessoa.imprimirDadosProprietario();
        carro1.calcularValorRevenda();/*Invocação dos métodos*/
        carro1.imprimeSeparador();

        carro2.modelo = "Duster";
        carro2.anoFabricacao = 2012;
        carro2.calcularValorRevenda();



    }
}
