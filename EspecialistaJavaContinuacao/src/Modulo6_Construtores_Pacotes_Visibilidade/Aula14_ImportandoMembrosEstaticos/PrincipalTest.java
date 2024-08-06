package Modulo6_Construtores_Pacotes_Visibilidade.Aula14_ImportandoMembrosEstaticos;

import Modulo6_Construtores_Pacotes_Visibilidade.Aula14_ImportandoMembrosEstaticos.com.algaworks.matematica.CalculadoraArea;

import static Modulo6_Construtores_Pacotes_Visibilidade.Aula14_ImportandoMembrosEstaticos.com.algaworks.matematica.CalculadoraArea.calcularAreaQuadrado;

public class PrincipalTest {
    public static void main(String[] args) {
        /*Aqui como os métodos são estáticos eles pertencem a classe e não a uma instância da classe*/

        double areaQuadrado = calcularAreaQuadrado(5.2); /*Aqui eu fiz o import static e agora não precisamos passar a classe
         como abaixo.Para fazer o import static basta dar um alt enter em cima do método e a idea importa*/
        double areaCirculo = CalculadoraArea.calcularAreaCirculo(10.5);

        System.out.printf("PI: %.2f%n",CalculadoraArea.PI);
        System.out.printf("Área do quadrado: %.2f%n", areaQuadrado);
        System.out.printf("Área do círculo: %.2f%n", areaCirculo);

    }




}
