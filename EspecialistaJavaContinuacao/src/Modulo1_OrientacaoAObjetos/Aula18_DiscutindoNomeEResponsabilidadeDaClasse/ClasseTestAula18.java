package Modulo1_OrientacaoAObjetos.Aula18_DiscutindoNomeEResponsabilidadeDaClasse;

public class ClasseTestAula18 {
    public static void main(String[] args) {
        CalculadoraImc paciente = new CalculadoraImc();

        paciente.altura = 1.82;
        paciente.peso = 175;

        IndiceMassaCorporalAula18 imc = paciente.calcular();

        if (imc.estaComObesidade()){
            System.out.printf("Paciente com altura %.2f e peso de %.2f,está com obesidade. ",paciente.altura,paciente.peso);
        }

        System.out.printf("Seu IMC é de %.2f.%n",imc.resultado);
    }
}
