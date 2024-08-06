package Modulo1_OrientacaoAObjetos.Aula20_PassandoObjetosComoArgumentoDeMetodos;

public class ClasseTestAula20 {
    public static void main(String[] args) {
        CalculadoraImcAula20 paciente = new CalculadoraImcAula20();
        PacienteAula20 joao = new PacienteAula20();
        joao.altura = 1.82;
        joao.peso = 175;
        IndiceMassaCorporalAula20 imc = paciente.calcular(joao);

        if (imc.estaComObesidade()){
            System.out.printf("Paciente com altura %.2f e peso de %.2f kg,está com obesidade. ",imc.altura,imc.peso);
        }

        System.out.printf("Seu IMC é de %.2f.%n",imc.resultado);
    }
}
