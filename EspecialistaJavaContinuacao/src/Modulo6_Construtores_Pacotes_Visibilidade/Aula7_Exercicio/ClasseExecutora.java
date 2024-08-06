package Modulo6_Construtores_Pacotes_Visibilidade.Aula7_Exercicio;

public class ClasseExecutora {
    public static void main(String[] args) {
        Participante participante1 = new Participante("Marcelo");
        Participante participante2 = new Participante("Vagner",10);

        System.out.printf("O participante %s não tem saldo inicial de pontos.%n",participante1.nome);
        System.out.printf("O participante %s está com o seu total de pontos em %d.",participante2.nome,participante2.saldoDePontos);

    }


}
