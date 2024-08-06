package Modulo7_Encapsulamento_JavaBeansERecords.Aula10_Records;

import Modulo7_Encapsulamento_JavaBeansERecords.Aula8_CopiasDefensivas.com.algaworks.agenda.Horario;

public class Principal1 {
    public static void main(String[] args) {
        /*Aqui dizemos que essa classe é mútavel pois é possível modificar os atributos através de métodos,nesse caso estou alterando
         a hora para de 10 para 11 e posso alterar os minutos também*/
        Horario horario = new Horario(10,30);
        horario.setHora(11);
        horario.setMinuto(52);

    }

}
