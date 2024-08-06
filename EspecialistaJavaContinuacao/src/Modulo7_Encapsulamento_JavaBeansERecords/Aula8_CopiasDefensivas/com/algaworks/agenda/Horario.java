package Modulo7_Encapsulamento_JavaBeansERecords.Aula8_CopiasDefensivas.com.algaworks.agenda;

public class Horario {

    private  int hora;
    private  int minuto;

    public Horario(int hora, int minuto) {
        this.hora = hora;
        this.minuto = minuto;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        if (hora < 0 || hora > 23){
            throw new IllegalArgumentException("Hora Inválida");
        }
        this.hora = hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        if (minuto > 59 || minuto < 0){
            throw new IllegalArgumentException("Minuto inválido");
        }
        this.minuto = minuto;
    }

    public String formatar(){
        return String.format("%dh%dm",getHora(),getMinuto());
    }
}
