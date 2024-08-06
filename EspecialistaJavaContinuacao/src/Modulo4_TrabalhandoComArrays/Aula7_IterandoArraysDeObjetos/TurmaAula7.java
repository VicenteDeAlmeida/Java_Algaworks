package Modulo4_TrabalhandoComArrays.Aula7_IterandoArraysDeObjetos;

public class TurmaAula7 {

    String identificacao;
    String nomeProfessora;
    AlunoAula7[] alunoAula7s; /*Criando  arrays de alunos dentro da classe turma*/
    AlunoAula7[] alunoTurmaAdolescentes;

    void imprimirListaDeAlunosNormais() {
        for (AlunoAula7 alunoAula7 : alunoAula7s) {
            if (alunoAula7 != null) {
                System.out.printf("%s (%d anos)%n", alunoAula7.nome, alunoAula7.idade);
            } else {
                System.out.println("Posição de aluno vaga");
                /*Aqui eu uso o foreach se não quiser pegar a posição,Se quiser pegar a posição ai eu uso o for normal,conforme abaixo*/
            }

        }


    }

    void imprimirListaDeAlunosAdolescentes() {
        for (AlunoAula7 alunosAdolescentes : alunoTurmaAdolescentes) {
            if (alunosAdolescentes != null) {
                System.out.printf("%s (%d anos)%n", alunosAdolescentes.nome, alunosAdolescentes.idade);
            } else {
                System.out.println("Posição de aluno vaga");
            }
        }
    }
}




