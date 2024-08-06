package Modulo2_BoasPraticaseCodigoLimpo.Aula4_PensandoMelhorNosArgumentosDeMetodos;

public class Produto {

    String nome;
    double precoUnitario;
    boolean ativo;


    void ativar() {
        System.out.println("Ativando");
        this.ativo = true;

    }

    void inativar() {
        System.out.println("Desativando");
        this.ativo = false;

    }

}
