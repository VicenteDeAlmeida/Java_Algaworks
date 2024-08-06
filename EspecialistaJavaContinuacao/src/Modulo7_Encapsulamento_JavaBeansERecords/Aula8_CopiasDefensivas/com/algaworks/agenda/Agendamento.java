package Modulo7_Encapsulamento_JavaBeansERecords.Aula8_CopiasDefensivas.com.algaworks.agenda;

public class Agendamento {

   private String descricao;
   private final Horario horario; /*final porque não se possibilita a mudança de horário,então não vai o método set*/

    public Agendamento(Horario horario,String descricao) {
        this.descricao = descricao;
        this.horario = new Horario(horario.getHora(),horario.getMinuto());/*Aqui a cópia defensiva,para que quando na classe principal
        eu precise setar hora e minuto para outro horário eu não perca o primeiro horário instanciado*/
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Horario getHorario() {
        return new Horario(horario.getHora(), horario.getMinuto());
    }
    public String getHorarioFormatado(){
        return horario.formatar();
    }


}
