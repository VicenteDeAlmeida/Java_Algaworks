package Modulo1_OrientacaoAObjetos.Aula16_MetodosQueRetornamObjetos;

public class Paciente {
    double altura;
    double peso;

    IndiceMassaCorporal calcularIndiceMassaCorporal() {

        IndiceMassaCorporal imc = new IndiceMassaCorporal();
        imc.resultado = peso / (altura * altura);
        imc.peso = peso;
        imc.altura = altura;

        return imc;
    }

}
