package Modulo1_OrientacaoAObjetos.Aula13_MetodosComRetorno;

public class ClasseExecutavelAula13 {
    public static void main(String[] args) {

        PessoaAula13 pessoa = new PessoaAula13();
        pessoa.nome = "Vicente";
        pessoa.cpf = "0255212897897";
        pessoa.anoNascimento = 1981;




        CarroAula13 carro1 = new CarroAula13();
        CarroAula13 carro2 = new CarroAula13();
        carro1.modelo = "Uno Mile";
        carro1.anoFabricacao = 2002;
        carro1.fabricante = "Fiat";
        carro1.cor = "Azul";
        carro1.imprimeDadosDoCarro();
        carro1.precoCompra2023 = 160.000;
        carro1.precoCompra2024 = 130.000;
        carro1.proprietario = pessoa;
        pessoa.imprimirDadosProprietario();
        carro1.calcularEImprimirDesvalorizacao();/*Invocação dos métodos*/
        carro1.imprimeTempoDeUso();
        carro1.imprimeIpva();
        carro1.imprimeSeparador();


        PessoaAula13 pessoa1 = new PessoaAula13();
        pessoa1.nome = "Letícia da Costa";
        pessoa1.cpf = "58789897";
        pessoa1.anoNascimento = 1980;
        carro2.modelo = "Duster";
        carro2.anoFabricacao = 2012;
        carro2.fabricante = "Renault";
        carro2.cor = "Preta";
        carro2.imprimeDadosDoCarro();
        carro2.precoCompra2023 = 250.000;
        carro2.precoCompra2024 = 300.000;
        carro2.proprietario = pessoa1;
        pessoa1.imprimirDadosProprietario();
        carro2.calcularEImprimirDesvalorizacao();



    }
}
