package Modulo7_Encapsulamento_JavaBeansERecords.Aula7_NaoPermitaInstanciacaoComCunstrutorPrivado;

import Modulo7_Encapsulamento_JavaBeansERecords.Aula7_NaoPermitaInstanciacaoComCunstrutorPrivado.com.algaworks.matematica.CalculadoraArea;

public class Principal {
    public static void main(String[] args) {
        double areaQuadrado = CalculadoraArea.calcularAreaQuadrado(25.69);
        double areaCirculo = CalculadoraArea.calcularAreaCirculo(89.63);

        System.out.printf("Área do quadrado %.2f%n",areaQuadrado);
        System.out.printf("Área do círculo %.2f%n" ,areaCirculo);



    }




}
