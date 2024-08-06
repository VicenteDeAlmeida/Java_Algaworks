package Modulo6_Construtores_Pacotes_Visibilidade.Aula14_ImportandoMembrosEstaticos.com.algaworks.matematica;

public class CalculadoraArea {

    public static final double PI = 3.14159265358979323846;

    public static double calcularAreaQuadrado(double medidaLado){
        return medidaLado * medidaLado;
    }

    public static double calcularAreaCirculo(double raio){
        return raio * raio * CalculadoraArea.PI;

    }
}
