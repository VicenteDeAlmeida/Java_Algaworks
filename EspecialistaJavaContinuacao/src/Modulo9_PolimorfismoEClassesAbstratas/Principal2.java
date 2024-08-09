package Modulo9_PolimorfismoEClassesAbstratas;

import Modulo9_PolimorfismoEClassesAbstratas.com.algaworks.banco.*;

public class Principal2 {
    public static void main(String[] args) {

        CaixaEletronico caixaEletronico = new CaixaEletronico();

        ContaEspecial conta1 = new ContaEspecial(new Titular("Mario da Silva", "22547896320"), 54, 854, 5);
        conta1.setLimiteChequeEspecial(1000);
        caixaEletronico.imrimirDemonstrativo(conta1);

        System.out.println("------------------------------------------------------");

        ContaInvestimento conta2 = new ContaInvestimento(new Titular("Marcelo Santos","77412589636"),85,8547);
        conta2.depositar(100.00);
        conta2.creditarRendimentos(10);
        caixaEletronico.imrimirDemonstrativo(conta2);

        System.out.println("------------------------------------------------------");

        ContaSalario conta3 = new ContaSalario(new Titular("Assalariado de Santos","22478965225"),54,5483);
        conta3.depositar(200);
        caixaEletronico.imrimirDemonstrativo(conta3);
    }
}
