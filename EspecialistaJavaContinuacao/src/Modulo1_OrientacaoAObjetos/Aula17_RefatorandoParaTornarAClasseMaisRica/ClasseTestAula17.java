package Modulo1_OrientacaoAObjetos.Aula17_RefatorandoParaTornarAClasseMaisRica;

public class ClasseTestAula17 {
    public static void main(String[] args) {
        PacienteAula17 paciente = new PacienteAula17();

        paciente.altura = 1.82;
        paciente.peso = 175;

        IndiceMassaCorporalAula17 imc = paciente.calcularIndiceMassaCorporal();

        if (imc.estaComObesidade()){
            System.out.printf("Paciente com altura %.2f e peso de %.2f,está com obesidade. ",paciente.altura,paciente.peso);
        }

        System.out.printf("Seu IMC é de %.2f.%n",imc.resultado);
    }
}
