package Modulo4_TrabalhandoComArrays.Aula10_ArrayListInicio;

import java.util.ArrayList;

public class PrincipalAula10 {
    public static void main(String[] args) {

        ArrayList<String> alunos = new ArrayList<>();
        alunos.add("Vicente");
        alunos.add("Mariana");
        alunos.add("Visconde");

        System.out.println(alunos);/*Iteração normal e iteração com for.*/

        for (int i = 0; i < alunos.size(); i++) {
            String aluno = alunos.get(i);
            System.out.println(aluno);
        }

        System.out.println("Iterando com for each");

        for (String aluno : alunos) {
            System.out.println(aluno);

        }

    }



}
