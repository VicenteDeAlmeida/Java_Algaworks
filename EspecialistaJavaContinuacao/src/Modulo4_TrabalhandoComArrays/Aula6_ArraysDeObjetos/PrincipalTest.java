package Modulo4_TrabalhandoComArrays.Aula6_ArraysDeObjetos;

import java.util.Arrays;

public class PrincipalTest {
    public static void main(String[] args) {

        Turma turmab = new Turma();

        turmab.identificacao = "Maternal B";
        turmab.nomeProfessora = "Maria";
        turmab.alunos = new Aluno[3];
        /*Para utilizar as propriedades da classe (quando array) eu instâncio um objeto,passado a posição do array*/
        turmab.alunos[0] = new Aluno();
        turmab.alunos[0].nome = "João";
        turmab.alunos[0].idade = 10;
        turmab.alunos[1] = new Aluno();
        turmab.alunos[1].nome = "Maria";
        turmab.alunos[1].idade = 11; /*Aqui inclui no array dois alunos.O Array tem 3 posiçãoe e o último aluno eu vou incluir de outra maneira,
        conforme abaixo*/

        Aluno outroAluno = new Aluno();
        outroAluno.nome = "Laura";
        outroAluno.idade = 9;
        turmab.alunos[2] = outroAluno;
        System.out.println(turmab.identificacao);
        System.out.println(turmab.nomeProfessora);
        System.out.println(turmab.alunos[0].nome.toString());
        System.out.println(turmab.alunos[0].idade);/*Aqui posso continuar com as outras posições do array*/






    }
}
