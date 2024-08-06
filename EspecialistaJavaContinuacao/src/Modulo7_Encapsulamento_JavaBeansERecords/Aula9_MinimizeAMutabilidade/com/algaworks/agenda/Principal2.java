package Modulo7_Encapsulamento_JavaBeansERecords.Aula9_MinimizeAMutabilidade.com.algaworks.agenda;

import Modulo7_Encapsulamento_JavaBeansERecords.Aula8_CopiasDefensivas.com.algaworks.agenda.Horario;

public class Principal2 {
    public static void main(String[] args) {
        /*Aqui dizemos que a classe é imutavel pois conseguimos alterar os atributos através de métodos*/
        HorarioAula9 horarioAula9 = new HorarioAula9(10,30);
        AgendamentoAula9 agendamentoCabelo = new AgendamentoAula9(horarioAula9,"Agendamento do Cabelo");

        HorarioAula9 novoHorario = CalculadoraHorario.somarDuasHoras(horarioAula9);

        System.out.println(agendamentoCabelo.getHorarioFormatado());
        System.out.println(novoHorario.formatar());

    }



}
