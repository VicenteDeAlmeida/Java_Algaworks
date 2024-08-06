package Modulo1_OrientacaoAObjetos.Aula10_VariaveisReferenciamObjetos;

public class TesteInicializacaoAula10 {
    public static void main(String[] args) {
        PessoaAula10 pessoa1 = new PessoaAula10();
        pessoa1.nome = "Vicente";
        PessoaAula10 pessoa2 = new PessoaAula10();
        pessoa2.nome = "Letícia";
        CarroAula10 meuCarro = new CarroAula10();
        meuCarro.modelo = "HRV";

        CarroAula10 seuCarro = new CarroAula10();
        seuCarro.modelo = "X6";
        meuCarro.proprietario = pessoa1;
        seuCarro.proprietario = pessoa1;

        meuCarro.proprietario.nome = "Sebastião";

        System.out.println(meuCarro.proprietario.nome);
        System.out.println(seuCarro.proprietario.nome);

        /*As variáveis(pessoa1,pessoa2)elas referenciam os objetos(Pessoa,Carro) elas não são os objetos*/


    }
}
