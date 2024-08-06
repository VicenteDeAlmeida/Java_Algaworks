package Modulo4_TrabalhandoComArrays.Aula9_RemovendoElementosDeArrays;

public class PrincipalTestAula9 {
    public static void main(String[] args) {

        TurmaAula9 turmab = new TurmaAula9();

        turmab.identificacao = "Maternal B";
        turmab.nomeProfessora = "Maria";

        AlunoAula9 aluno = new AlunoAula9();
        aluno.nome = "João";
        aluno.idade = 3;

        AlunoAula9 aluno1 = new AlunoAula9();
        aluno1.nome = "Laura";
        aluno1.idade = 4;

        turmab.adicionarAluno(aluno);
        turmab.adicionarAluno(aluno1);
        turmab.imprimirListaDeAlunos();





        }
}

