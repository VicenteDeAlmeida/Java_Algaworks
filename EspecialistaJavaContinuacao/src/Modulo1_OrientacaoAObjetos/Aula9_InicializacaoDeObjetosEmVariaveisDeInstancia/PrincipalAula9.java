package Modulo1_OrientacaoAObjetos.Aula9_InicializacaoDeObjetosEmVariaveisDeInstancia;

public class PrincipalAula9 {
    public static void main(String[] args) {

        PessoaAula9 proprietario1 = new PessoaAula9();  /*Para poder usar os atributos do proprietário eu preciso instanciar a classe Pessoa
        se eu não fizer isso eu vou tomar uma exceção de nullpointerexception*/
        proprietario1.nome = "Vicente de Almeida Luiz";
        proprietario1.cpf = "5545602123";
        proprietario1.anoNascimento = 1983;


        CarroAula9 meuCarro = new CarroAula9();
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
        PessoaAula9 proprietario2 = new PessoaAula9();
        proprietario2.nome = "Mariana Silveira";
        proprietario2.cpf = "00258979";
        proprietario2.anoNascimento = 1965;
        CarroAula9 seuCarro = new CarroAula9();
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
