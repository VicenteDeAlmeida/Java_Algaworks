package Modulo1_OrientacaoAObjetos.Aula8_ValoresPadraoInicializacaoVairaveisDeInstancia;

public class TesteInicializacao {
    public static void main(String[] args) {
        CarroAula8 meucarro = new CarroAula8();

        meucarro.fabricante = "Honda";
        meucarro.anoDeFabricacao = 2021;

        System.out.println(meucarro.fabricante);
        System.out.println(meucarro.modelo);
        System.out.println(meucarro.anoDeFabricacao);

         /*   Aula mais explicativa sobre: Quando iniciamos atributos com o tipo classe,String por exemplo,e instanciamos um novo objetos,
        por padrão os valores serão null,mas quando inicamos atributos com valores primitivos,int por exemplo,os valores serão sempre 0.
        Aqui nessa aula já definimos os atributos diretamente na classe,mas somente para fins didáticos.*/

    }
}
