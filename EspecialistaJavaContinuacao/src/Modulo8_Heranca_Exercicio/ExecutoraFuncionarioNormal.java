package Modulo8_Heranca_Exercicio;

import Modulo8_Heranca_Exercicio.com.algaworks.sistemarh.Funcionario;
import Modulo8_Heranca_Exercicio.com.algaworks.sistemarh.Holerite;

public class ExecutoraFuncionarioNormal {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Marlon dos Santos Silva",10);
        System.out.println(funcionario);
        Holerite holerite = funcionario.gerarHolerite(10,"10/2024");
        holerite.imprimir();



    }
}
