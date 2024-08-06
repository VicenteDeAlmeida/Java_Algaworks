package Modulo1_OrientacaoAObjetos.Aula9_InicializacaoDeObjetosEmVariaveisDeInstancia;

public class TesteInicializacao {
    public static void main(String[] args) {
        CarroAula9 meucarro = new CarroAula9();
        meucarro.proprietario = new PessoaAula9();


        meucarro.fabricante = "Honda";
        meucarro.anoDeFabricacao = 2021;
        meucarro.proprietario.nome = "João";

        System.out.println(meucarro.fabricante);
        System.out.println(meucarro.modelo);
        System.out.println(meucarro.anoDeFabricacao);
        System.out.println(meucarro.proprietario.nome); /*Aqui vai lançar excessão pois não temos nenhuma instância do propritário*/


    }
}
