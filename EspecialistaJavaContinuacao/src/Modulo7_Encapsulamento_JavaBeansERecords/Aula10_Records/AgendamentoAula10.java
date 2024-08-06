package Modulo7_Encapsulamento_JavaBeansERecords.Aula10_Records;

public class AgendamentoAula10 {
    String descricao;
    HorarioAula10 horario;

    public AgendamentoAula10(HorarioAula10 horario, String descricao) {
        this.descricao = descricao;
        this.horario = horario;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public HorarioAula10 getHorario() {
        return horario;
    }

    public void setHorario(HorarioAula10 horario) {
        this.horario = horario;
    }
    public String getHorarioFormatado(){
        return horario.formatar();
    }
}
