package Modulo1_OrientacaoAObjetos.Aula19_MetodosComArgumentos;

public class CalculadoraImcAula19 {



    IndiceMassaCorporalAula19 calcular(double peso,double altura) {

        IndiceMassaCorporalAula19 imc = new IndiceMassaCorporalAula19();
        imc.resultado = peso / (altura * altura);
        imc.peso = peso;
        imc.altura = altura;

        return imc;
    }

}
