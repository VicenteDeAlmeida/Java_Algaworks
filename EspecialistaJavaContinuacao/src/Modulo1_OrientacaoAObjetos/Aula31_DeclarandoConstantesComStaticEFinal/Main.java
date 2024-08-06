package Modulo1_OrientacaoAObjetos.Aula31_DeclarandoConstantesComStaticEFinal;

public class Main {
    public static void main(String[] args) {
        Visitante novoVisitante = new Visitante();
        novoVisitante.nome = "João";
        novoVisitante.idade = 20;

        if (novoVisitante.possuiIdadeParaAcesso()){
            System.out.printf("Acesso não permitido para menores de %d anos.",Visitante.IDADE_MINIMA_ACESSO);
        }else {
            System.out.println("Acesso liberado.");
        }
    }
}
