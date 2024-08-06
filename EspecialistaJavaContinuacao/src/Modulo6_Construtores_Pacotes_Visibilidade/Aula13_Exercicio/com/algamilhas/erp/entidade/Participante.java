package Modulo6_Construtores_Pacotes_Visibilidade.Aula13_Exercicio.com.algamilhas.erp.entidade;
/**
 *Na uml: + visibilidade public
          - visibilidade private
          ~ visibilidade deafult

 * */
public class Participante {

    public static int SALDO_DE_PONTOS_INICIAL = 0;
    private String nome;
    private int saldoDePontos;  /*Aqui não consigo chamar os atributos na classe executora pq eles estão privados*/

    public Participante(){
        this.nome = "Marcelo";
        this.saldoDePontos = SALDO_DE_PONTOS_INICIAL;

    }

    private Participante(String nome , int saldoDePontosInicial){
        /*Aqui não consigo chamar o construtor na classe executora pq ele é private*/

    }

   public void creditarPontos(int pontos){

       if (pontos == 0){
           System.out.println("Sua pontuação foi 0,você não acumulou mais pontos.");

       } else if (pontos < 0) {
           System.out.println("Pontos a creditar não pode ser um núemro negativo.");

       } else {
           int acumuloPontos = SALDO_DE_PONTOS_INICIAL += pontos;
           System.out.println("Seus pontos foram creditados,você tem um total de " + acumuloPontos+ " pontos.");

       }


    }
}
