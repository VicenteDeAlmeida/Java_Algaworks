package Modulo4_TrabalhandoComArrays.Aula8_CopiandoEExpandindoArrays;

import java.util.Arrays;

public class TurmaAula8 {

    String identificacao;
    String nomeProfessora;
    AlunoAula8[] alunoAula7s = new AlunoAula8[0]; /*Criando  arrays de alunos dentro da classe turma*/


    void adicionarAluno(AlunoAula8 aluno){
         this.alunoAula7s = Arrays.copyOf(this.alunoAula7s,this.alunoAula7s.length + 1);
         alunoAula7s[alunoAula7s.length -1] = aluno;
    }

    void imprimirListaDeAlunos() {
        for (AlunoAula8 alunoAula7 : alunoAula7s) {
            if (alunoAula7 != null) {
                System.out.printf("%s (%d anos)%n", alunoAula7.nome, alunoAula7.idade);
            } else {
                System.out.println("Posição de aluno vaga");
                /*Aqui eu uso o foreach se não quiser pegar a posição,Se quiser pegar a posição ai eu uso o for normal,conforme abaixo*/
            }

        }


    }

}




