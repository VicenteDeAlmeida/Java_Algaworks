package Modulo7_Encapsulamento_JavaBeansERecords.Aula5_BoasPraticas;

public class Principal {
    public static void main(String[] args) {

        Horario horario = new Horario(21,20);
        System.out.println(horario.formatar());
    }
}
