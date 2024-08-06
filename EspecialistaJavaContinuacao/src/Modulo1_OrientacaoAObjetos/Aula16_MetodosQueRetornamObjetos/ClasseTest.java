package Modulo1_OrientacaoAObjetos.Aula16_MetodosQueRetornamObjetos;

public class ClasseTest {
    public static void main(String[] args) {
        Paciente paciente = new Paciente();

        paciente.altura = 1.82;
        paciente.peso = 175;

        IndiceMassaCorporal imc = paciente.calcularIndiceMassaCorporal();

        if (imc.resultado >=30){
            System.out.printf("Paciente com altura %.2f e peso de %.2f está com obesidade. ",paciente.altura,paciente.peso);
        }

        System.out.printf("Seu IMC é de %.2f.%n",imc.resultado);
    }
}
