package Modulo4_TrabalhandoComArrays.Aula10_ArrayListInicio;

public class OutraPrincipalAula10 {
    public static void main(String[] args) {
        TurmaAula10 turmaAula10 = new TurmaAula10();
        turmaAula10.nomeProfessora = "Maria";
        turmaAula10.identificacao = "Maternal B";

        Aluno aluno1 = new Aluno();
        aluno1.nome = "Laura";
        aluno1.idade = 5;

        Aluno aluno2 = new Aluno();
        aluno2.nome = "Lauro";
        aluno2.idade = 10;

        Aluno aluno3 = new Aluno();
        aluno3.nome = "Letícia";
        aluno3.idade = 6;

        turmaAula10.adicionaAluno(aluno1);
        turmaAula10.adicionaAluno(aluno2);
        turmaAula10.adicionaAluno(aluno3);
        turmaAula10.imprimirListaDeAlunos();
        aluno1.separadorAposExclusao();
        turmaAula10.removerAluno(2);
        turmaAula10.imprimirListaDeAlunos();

    }




}
