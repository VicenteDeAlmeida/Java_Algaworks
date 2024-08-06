package Modulo7_Encapsulamento_JavaBeansERecords.Aula9_MinimizeAMutabilidade.com.algaworks.agenda;

public class HorarioAula9 {

  private int hora;
  private int minuto;

    public HorarioAula9(int hora, int minuto) {
        this.hora = hora;
        this.minuto = minuto;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        if (hora < 0 || hora > 23){
            throw new IllegalArgumentException("Hora inválida" + hora);
        }
        this.hora = hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        if (minuto < 0 || minuto > 59){
            throw new IllegalArgumentException("Minuto Inválido " + minuto);
        }
        this.minuto = minuto;
    }
    public String formatar(){
        return String.format("%dh%dm",getHora(),getMinuto());
    }
}
