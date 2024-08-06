package Modulo7_Encapsulamento_JavaBeansERecords.Aula9_MinimizeAMutabilidade.com.algaworks.agenda;

public class CalculadoraHorario {
    private CalculadoraHorario() {
    }
    public static HorarioAula9 somarDuasHoras(HorarioAula9 horarioAula9){
        int hora = horarioAula9.getHora() + 2;

        if (hora > 24){
            hora = hora -24;
        }

        horarioAula9.setHora(hora);
        return horarioAula9;
    }
}
