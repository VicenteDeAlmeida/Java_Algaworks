package Modulo7_Encapsulamento_JavaBeansERecords.Aula10_Records;

public record HorarioAula10(int hora , int minuto) {
    /*Record é uma classe imutável usada para armazenar dados
    * Nesse tipo de classe os atributos são atribuidos entre parênteses como se fosse parâmetros de métodos
    * O construtor já vem criado implicitamente,mas se precisarmos fazer uma validação nele,podemos também,conforme abaixo*/

    public HorarioAula10 {
        if (hora < 0 || hora > 23){
            throw new IllegalArgumentException("Hora inválida" + hora);
        }
        if (minuto < 0 || minuto > 59){
            throw new IllegalArgumentException("Minuto inválido" + minuto);
        }

    }
    public String formatar(){
        return String.format("%dh%dm",hora,minuto);
    }


}
