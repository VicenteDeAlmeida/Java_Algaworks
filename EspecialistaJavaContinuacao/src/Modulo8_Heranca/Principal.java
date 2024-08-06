package Modulo8_Heranca;

import Modulo8_Heranca.com.algaworks.banco.Conta;
import Modulo8_Heranca.com.algaworks.banco.Titular;

public class Principal {

    public static void main(String[] args) {
        Titular titular = new Titular("Outro Nome de Teste","12358787");
        Conta conta1 = new Conta(titular,458,98585);
        System.out.println(conta1);
    }
}
