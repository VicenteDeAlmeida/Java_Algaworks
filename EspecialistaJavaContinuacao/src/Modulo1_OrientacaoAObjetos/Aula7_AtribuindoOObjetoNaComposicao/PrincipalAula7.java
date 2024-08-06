package Modulo1_OrientacaoAObjetos.Aula7_AtribuindoOObjetoNaComposicao;

public class PrincipalAula7 {
    public static void main(String[] args) {

        PessoaAula7 proprietario1 = new PessoaAula7();  /*Para poder usar os atributos do proprietário eu preciso instanciar a classe Pessoa
        se eu não fizer isso eu vou tomar uma exceção de nullpointerexception*/
        proprietario1.nome = "Vicente de Almeida Luiz";
        proprietario1.cpf = "5545602123";
        proprietario1.anoNascimento = 1983;


        CarroAula7 meuCarro = new CarroAula7();
        meuCarro.anoDeFabricacao = 2009;
        meuCarro.cor = "Preto";
        meuCarro.fabricante = "Honda";
        meuCarro.modelo = "HRV";
        meuCarro.proprietario = proprietario1; /*Aqui eu estou atribuindo o conteúdo da variável proprietário1 a variável meucarro */

        System.out.println("MEU CARRO");
        System.out.printf("Modelo: %s%n",meuCarro.modelo);
        System.out.printf("Ano: %s%n",meuCarro.anoDeFabricacao);
        System.out.printf("Cor: %s%n",meuCarro.cor);
        System.out.printf("Fabricante: %s%n",meuCarro.fabricante);
        System.out.printf("Proprietário: %s%n",proprietario1);

        System.out.println("__________________________________________");
        System.out.println("Seu Carro");
        PessoaAula7 proprietario2 = new PessoaAula7();
        proprietario2.nome = "Mariana Silveira";
        proprietario2.cpf = "00258979";
        proprietario2.anoNascimento = 1965;
        CarroAula7 seuCarro = new CarroAula7();
        seuCarro.anoDeFabricacao = 2022;
        seuCarro.cor = "Branco";
        seuCarro.fabricante = "BMW";
        seuCarro.modelo = "X6";
        seuCarro.proprietario = proprietario2;
        System.out.printf("Modelo: %s%n",seuCarro.modelo);
        System.out.printf("Ano: %s%n",seuCarro.anoDeFabricacao);
        System.out.printf("Cor: %s%n",seuCarro.cor);
        System.out.printf("Fabricante: %s%n",seuCarro.fabricante);
        System.out.printf("Proprietário: %s%n",proprietario2);
    }
}
