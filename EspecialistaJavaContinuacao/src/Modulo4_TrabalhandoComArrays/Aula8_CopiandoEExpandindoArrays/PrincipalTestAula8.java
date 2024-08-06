package Modulo4_TrabalhandoComArrays.Aula8_CopiandoEExpandindoArrays;

public class PrincipalTestAula8 {
    public static void main(String[] args) {

        TurmaAula8 turmab = new TurmaAula8();

        turmab.identificacao = "Maternal B";
        turmab.nomeProfessora = "Maria";

        AlunoAula8 aluno = new AlunoAula8();
        aluno.nome = "João";
        aluno.idade = 3;

        AlunoAula8 aluno1 = new AlunoAula8();
        aluno1.nome = "Laura";
        aluno1.idade = 4;

        turmab.adicionarAluno(aluno);
        turmab.adicionarAluno(aluno1);
        turmab.imprimirListaDeAlunos();





        }
}

