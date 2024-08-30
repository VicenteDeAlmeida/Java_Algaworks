package Modulo14_Excecoes.Aula11_Exercicio;

import Modulo14_Excecoes.Aula11_Exercicio.com.algaworks.banco.ContaCorrente;

public class Executora3 {
    public static void main(String[] args) {
        ContaCorrente conta1 = new ContaCorrente(789);
        ContaCorrente conta2 = new ContaCorrente(1011);

       /*conta1.ativar();
       conta1.transferir(conta1,conta2,100);*/

        conta1.ativar();
        conta2.ativar();

        conta1.depositar(1000);
        conta1.transferir(conta1,conta2,0.50);
        System.out.printf("Saldo da conta 1 é de R$%.2f  e da conta 2 é de R$%.2f.",conta1.getSaldo(),conta2.getSaldo());

    }




}
