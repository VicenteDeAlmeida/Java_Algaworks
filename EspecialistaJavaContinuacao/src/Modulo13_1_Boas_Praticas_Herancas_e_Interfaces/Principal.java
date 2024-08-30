package Modulo13_1_Boas_Praticas_Herancas_e_Interfaces;

import Modulo13_1_Boas_Praticas_Herancas_e_Interfaces.com.algaworks.locadora.modelo.*;

public class Principal {
    public static void main(String[] args) {

        Notebook notebook = new Notebook("Samsung Fera",5,100);
        Locacao locacao = new LocacaoPorDiaSeguroItau(notebook);
        double valorDevido = locacao.calcularValorDevido(10);

        System.out.printf("Valor a pagar: R$%.2f%n",valorDevido);

    }
}
