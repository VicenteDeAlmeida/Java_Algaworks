package Modulo8_Heranca;

import Modulo8_Heranca.com.algaworks.banco.Conta;
import Modulo8_Heranca.com.algaworks.banco.ContaInvestimento;
import Modulo8_Heranca.com.algaworks.banco.Titular;

public class PrincipalContaInvestimento {
    public static void main(String[] args) {
        Titular titular = new Titular("Vicente de Almeida Luiz","001158745258");
        ContaInvestimento novaContaInvestimento = new ContaInvestimento(titular,4321,25);
        novaContaInvestimento.imprimirDemonstrativo();
        novaContaInvestimento.depositar(100);
        novaContaInvestimento.imprimirDemonstrativo();
        novaContaInvestimento.sacar(10);
        novaContaInvestimento.imprimirDemonstrativo();


        novaContaInvestimento.creditarRendimentos(10);
        novaContaInvestimento.imprimirDemonstrativo();



    }



}
