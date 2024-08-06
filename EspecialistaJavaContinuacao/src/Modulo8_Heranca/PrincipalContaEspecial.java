package Modulo8_Heranca;

import Modulo8_Heranca.com.algaworks.banco.Conta;
import Modulo8_Heranca.com.algaworks.banco.ContaEspecial;
import Modulo8_Heranca.com.algaworks.banco.Titular;

public class PrincipalContaEspecial {
    public static void main(String[] args) {
        Titular titular = new Titular("Mariana da Silva","00114789635");
        ContaEspecial novaContaEspecial = new ContaEspecial(titular,1234,254,80);

        novaContaEspecial.setLimiteChequeEspecial(1000);
        novaContaEspecial.setTarifaMensal(90);
        novaContaEspecial.imprimirDemonstrativo();

        novaContaEspecial.depositar(100);
        novaContaEspecial.imprimirDemonstrativo();


        novaContaEspecial.sacar(200);
        novaContaEspecial.imprimirDemonstrativo();

        novaContaEspecial.debitarTarifaMensal();
        novaContaEspecial.imprimirDemonstrativo();




    }



}
