package Modulo13_Continuacao_MelhoriaDoCodigoDoPacoteAnterior.com.algaworks.locadora.modelo;

public class SeguroItau implements Seguro{


    @Override
    public double calcularPremio(double horasUtilizadas, double valorContrato) {
        double dias = Math.ceil(horasUtilizadas / 24d);
        return dias * 5;
    }
}
