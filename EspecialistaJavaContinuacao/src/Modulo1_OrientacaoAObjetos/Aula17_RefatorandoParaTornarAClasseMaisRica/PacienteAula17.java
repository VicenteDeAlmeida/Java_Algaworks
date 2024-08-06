package Modulo1_OrientacaoAObjetos.Aula17_RefatorandoParaTornarAClasseMaisRica;

public class PacienteAula17 {
    double altura;
    double peso;

    IndiceMassaCorporalAula17 calcularIndiceMassaCorporal() {

        IndiceMassaCorporalAula17 imc = new IndiceMassaCorporalAula17();
        imc.resultado = peso / (altura * altura);
        imc.peso = peso;
        imc.altura = altura;

        return imc;
    }

}
