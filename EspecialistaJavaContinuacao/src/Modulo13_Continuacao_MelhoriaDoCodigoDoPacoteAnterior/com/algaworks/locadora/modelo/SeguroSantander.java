package Modulo13_Continuacao_MelhoriaDoCodigoDoPacoteAnterior.com.algaworks.locadora.modelo;

public class SeguroSantander implements Seguro {

    @Override
    public double calcularPremio(double horasUtilizadas, double valorContrato) {
        return (horasUtilizadas * 0.50) + (valorContrato * 0.05);
    }
}
