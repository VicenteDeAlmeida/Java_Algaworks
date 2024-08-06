package Modulo4_TrabalhandoComArrays.Aula7_IterandoArraysDeObjetos;

public class PrincipalTestAula7 {
    public static void main(String[] args) {

        TurmaAula7 turmab = new TurmaAula7();

        turmab.identificacao = "Maternal B";
        turmab.nomeProfessora = "Maria";
        turmab.alunoAula7s = new AlunoAula7[3];
        /*Para utilizar as propriedades da classe (quando array) eu instâncio um objeto,passado a posição do array*/
        turmab.alunoAula7s[0] = new AlunoAula7();
        turmab.alunoAula7s[0].nome = "João";
        turmab.alunoAula7s[0].idade = 10;
        turmab.alunoAula7s[1] = new AlunoAula7();
        turmab.alunoAula7s[1].nome = "Maria";
        turmab.alunoAula7s[1].idade = 11;
        turmab.alunoAula7s[2] = new AlunoAula7();
        turmab.alunoAula7s[2].nome = "Laura";
        turmab.alunoAula7s[2].idade = 8;
        turmab.imprimirListaDeAlunosNormais();

        AlunoAula7 alunoParaSeparador = new AlunoAula7();
        alunoParaSeparador.separador();


        /*Instanciando outra turma de alunos,sem passar algum aluno em alguma posição e simulando uma vaga em aberto*/

        TurmaAula7 novaTurma = new TurmaAula7();
        novaTurma.identificacao = "Turma de adolescentes chatos";
        novaTurma.nomeProfessora = "Uma super heroína";
        novaTurma.alunoTurmaAdolescentes = new AlunoAula7[3];
        novaTurma.alunoTurmaAdolescentes[0] = new AlunoAula7();
        novaTurma.alunoTurmaAdolescentes[0].nome = "Chato";
        novaTurma.alunoTurmaAdolescentes[0].idade = 14;
        novaTurma.alunoTurmaAdolescentes[1] = new AlunoAula7();
        novaTurma.alunoTurmaAdolescentes[1].nome = "Chata";
        novaTurma.alunoTurmaAdolescentes[1].idade = 13; /*Aqui como o array é de 3 posições uma posição vai retornar null então vamos
        criar uma regra no método para que isso seja uma posição vaga na turma*/

        novaTurma.imprimirListaDeAlunosAdolescentes();


        }
}

