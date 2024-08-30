package Modulo14_Excecoes.Aula11_Exercicio;

import Modulo14_Excecoes.Aula11_Exercicio.com.algaworks.banco.ContaCorrente;

public class Executora1 {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente(1548);

        contaCorrente.ativar();
        contaCorrente.depositar(100);
        contaCorrente.sacar(50);

        System.out.printf("Saldo da conta: %d reais.",contaCorrente.getSaldo());
    }
}
