package Modulo7_Encapsulamento_JavaBeansERecords.Aula9_MinimizeAMutabilidade.com.algaworks.agenda;

public class AgendamentoAula9 {
    String descricao;
    HorarioAula9 horario;

    public AgendamentoAula9(HorarioAula9 horario, String descricao) {
        this.descricao = descricao;
        this.horario = horario;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public HorarioAula9 getHorario() {
        return horario;
    }

    public void setHorario(HorarioAula9 horario) {
        this.horario = horario;
    }
    public String getHorarioFormatado(){
        return horario.formatar();
    }
}
