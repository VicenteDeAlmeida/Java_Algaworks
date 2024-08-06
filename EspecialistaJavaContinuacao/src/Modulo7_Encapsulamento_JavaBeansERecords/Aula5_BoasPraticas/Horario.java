package Modulo7_Encapsulamento_JavaBeansERecords.Aula5_BoasPraticas;

public class Horario {

    private int [] horaEMinutos = new int[2];

    public int getHora() {
        return horaEMinutos[0];
    }

    public void setHora(int hora) {
        if (hora <0 || hora > 23){
            throw new IllegalArgumentException("Hora inválida: " + hora);
        }
        this.horaEMinutos[0] = hora;
    }

    public int getMinuto() {
        return horaEMinutos[1];
    }

    public void setMinuto(int minuto) {
        if (minuto < 0 || minuto > 59){
            throw new IllegalArgumentException("Minuto inválido: " + minuto);
        }
        this.horaEMinutos[1] = minuto;
    }

    public Horario(int hora, int minuto){
        setHora(hora);
        setMinuto(minuto);

    }

    public String formatar(){
        return String.format("Horário: %d horas e %d minutos",getHora(),getMinuto());


    }
}
