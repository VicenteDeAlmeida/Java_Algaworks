package Modulo8_Heranca;

import Modulo8_Heranca.com.algaworks.banco.Conta;
import Modulo8_Heranca.com.algaworks.banco.Titular;

public class PrincipalContaNormal {
    public static void main(String[] args) {
        Titular titular = new Titular("Vicente de Almeida Luiz","123456789100");
        Conta novaConta = new Conta(titular,1234,254);

        novaConta.imprimirDemonstrativo();
        novaConta.depositar(100);
        novaConta.imprimirDemonstrativo();
        novaConta.sacar(20);
        novaConta.imprimirDemonstrativo();




    }



}
