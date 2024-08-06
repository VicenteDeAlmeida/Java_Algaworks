package Modulo8_Heranca_Exercicio.com.algaworks.sistemarh;

public class Programador extends Funcionario{

    private double valorBonus;

    public Programador(String nome, double valorHora, double valorBonus) {
        super(nome, valorHora);
        this.valorBonus = valorBonus;
    }

    public double getValorBonus() {
        return valorBonus;
    }

    public void setValorBonus(double valorBonus) {
        this.valorBonus = valorBonus;
    }

    @Override
    protected final double calcularSalario(int horasTrabalhadas) {
        return super.calcularSalario(horasTrabalhadas) + valorBonus;
    }

    @Override
    public String toString() {
        return "Informações do funcionário programador: \n" +
            "Nome: " + getNome() + "\n" +
            "Valor por Hora Trabalhada: " + getValorHora() + "\n" +
            "Valor do bônus recebido: " + valorBonus;
    }
}
