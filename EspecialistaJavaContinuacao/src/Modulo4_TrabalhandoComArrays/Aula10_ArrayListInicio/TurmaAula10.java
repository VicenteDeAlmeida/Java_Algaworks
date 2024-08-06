package Modulo4_TrabalhandoComArrays.Aula10_ArrayListInicio;

import java.util.ArrayList;

public class TurmaAula10 {

    String identificacao;
    String nomeProfessora;
    ArrayList<Aluno> alunos = new ArrayList<>();

    void adicionaAluno(Aluno aluno){
        alunos.add(aluno);
    }

    void removerAluno(int indice){
        alunos.remove(indice);
    }

    void imprimirListaDeAlunos(){
        for (Aluno aluno : alunos) {
            System.out.printf("%s (%d anos)%n",aluno.nome,aluno.idade);
        }
    }
}
