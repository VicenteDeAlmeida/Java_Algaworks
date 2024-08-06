package Modulo1_OrientacaoAObjetos.Aula20_PassandoObjetosComoArgumentoDeMetodos;

public class CalculadoraImcAula20 {



    IndiceMassaCorporalAula20 calcular(PacienteAula20 pacienteAula20) {

        IndiceMassaCorporalAula20 imc = new IndiceMassaCorporalAula20();
        imc.resultado = pacienteAula20.peso / (pacienteAula20.altura * pacienteAula20.altura);
        imc.peso = pacienteAula20.peso;
        imc.altura = pacienteAula20.altura;

        return imc;
    }

}
