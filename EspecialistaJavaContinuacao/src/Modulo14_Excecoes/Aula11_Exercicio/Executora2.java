package Modulo14_Excecoes.Aula11_Exercicio;

import Modulo14_Excecoes.Aula11_Exercicio.com.algaworks.banco.ContaCorrente;

public class Executora2 {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente(2589);

        //contaCorrente.depositar(0);
        //contaCorrente.depositar(-10);

        contaCorrente.depositar(100);
    }
}
