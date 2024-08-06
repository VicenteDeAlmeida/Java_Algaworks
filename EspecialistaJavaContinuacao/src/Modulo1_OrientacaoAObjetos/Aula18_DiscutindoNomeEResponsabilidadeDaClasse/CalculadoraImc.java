package Modulo1_OrientacaoAObjetos.Aula18_DiscutindoNomeEResponsabilidadeDaClasse;

public class CalculadoraImc {
    double altura;
    double peso; /*Aqui o ideal seria passar por parâmetro os atributos,mas ianda não estudamos essa parte
    */

    IndiceMassaCorporalAula18 calcular() {

        IndiceMassaCorporalAula18 imc = new IndiceMassaCorporalAula18();
        imc.resultado = peso / (altura * altura);
        imc.peso = peso;
        imc.altura = altura;

        return imc;
    }

}
