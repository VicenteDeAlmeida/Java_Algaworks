package Modulo1_OrientacaoAObjetos.Aula19_MetodosComArgumentos;

public class ClasseTestAula19 {
    public static void main(String[] args) {
        CalculadoraImcAula19 paciente = new CalculadoraImcAula19();
        double altura = 1.82;
        double peso = 175;
        IndiceMassaCorporalAula19 imc = paciente.calcular(peso,altura);

        if (imc.estaComObesidade()){
            System.out.printf("Paciente com altura %.2f e peso de %.2f kg,está com obesidade. ",imc.altura,imc.peso);
        }

        System.out.printf("Seu IMC é de %.2f.%n",imc.resultado);
    }
}
