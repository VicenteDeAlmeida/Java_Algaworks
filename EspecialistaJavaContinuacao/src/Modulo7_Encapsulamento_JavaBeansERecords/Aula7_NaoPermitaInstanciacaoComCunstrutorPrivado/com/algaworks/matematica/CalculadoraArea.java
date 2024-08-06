package Modulo7_Encapsulamento_JavaBeansERecords.Aula7_NaoPermitaInstanciacaoComCunstrutorPrivado.com.algaworks.matematica;

public class CalculadoraArea {
    public static final double PI = 3.14159265358979323846;

    private CalculadoraArea() {
        /*Criar um construtor privado é simplesmente uma forma de "avisar" que
        a classe não será instanciada (até pq com construtor privado isso não é possível)
        e usar somente os métodos estáticos
         */
    }

    public static double calcularAreaQuadrado(double medidaLado){
        return medidaLado * medidaLado;
    }

    public static double calcularAreaCirculo(double raio){
        return raio * raio * CalculadoraArea.PI;
    }


}

