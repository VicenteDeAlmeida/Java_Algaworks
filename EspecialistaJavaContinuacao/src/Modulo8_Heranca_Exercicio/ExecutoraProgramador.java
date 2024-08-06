package Modulo8_Heranca_Exercicio;

import Modulo8_Heranca_Exercicio.com.algaworks.sistemarh.Holerite;
import Modulo8_Heranca_Exercicio.com.algaworks.sistemarh.Programador;

public class ExecutoraProgramador {
    public static void main(String[] args) {
        Programador programador = new Programador("Mariana Araújo",20,20);
        System.out.println(programador);
        Holerite holerite = programador.gerarHolerite(10,"10/2024");
        holerite.imprimir();
    }
}
