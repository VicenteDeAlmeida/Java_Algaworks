package Modulo9_PolimorfismoEClassesAbstratas;

import Modulo9_PolimorfismoEClassesAbstratas.com.algaworks.banco.Conta;
import Modulo9_PolimorfismoEClassesAbstratas.com.algaworks.banco.ContaEspecial;
import Modulo9_PolimorfismoEClassesAbstratas.com.algaworks.banco.Titular;

public class Principal1 {
    public static void main(String[] args) {

        Titular titular = new Titular("João da Silva","00558963247");
        ContaEspecial contaEspecial = new ContaEspecial(titular,1234,2544,10.00);
        contaEspecial.setLimiteChequeEspecial(1000);
        contaEspecial.depositar(100);

        /*Realizando o upcasting que é atribuir o objeto instanciado a uma superclasse
        * Passo 1  - Fazer o upcasting (Atribui o objeto conta especial a superclasse Conta)*/

        Conta conta = (Conta) contaEspecial;

        System.out.println(contaEspecial.getClass().getName());/*O método getclass + o método getname retorna o nome da classe do
        objeto que eu quero*/
        System.out.println(conta.getClass().getName());

        System.out.println(conta == contaEspecial);

    }
}
