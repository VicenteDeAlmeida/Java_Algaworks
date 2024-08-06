package Modulo7_Encapsulamento_JavaBeansERecords.Aula8_CopiasDefensivas.com.algaworks.agenda;

public class Principal {
    public static void main(String[] args) {

        Horario horario = new Horario(10, 30);
        Agendamento agendamentoCabelo = new Agendamento(horario, "Corte de Cabelo");

        horario.setHora(11);
        horario.setMinuto(10);
        Agendamento agendamentoBarba = new Agendamento(horario, "Agendamento barba");

        imprimir(agendamentoCabelo);
        imprimir(agendamentoBarba);



    }

    private static void imprimir(Agendamento agendamento){
        System.out.printf("%s às %s%n",agendamento.getDescricao(),agendamento.getHorarioFormatado());
    }



}
