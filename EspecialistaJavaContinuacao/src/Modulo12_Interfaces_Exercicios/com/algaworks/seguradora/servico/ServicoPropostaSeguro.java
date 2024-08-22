package Modulo12_Interfaces_Exercicios.com.algaworks.seguradora.servico;

import Modulo12_Interfaces_Exercicios.com.algaworks.seguradora.modelo.BemSeguravel;

public class ServicoPropostaSeguro {

    public void emitir(BemSeguravel bemSeguravel){

        System.out.println("_________________________");
        System.out.println("Proposta de seguro");
        System.out.println("_________________________");
        System.out.println(bemSeguravel.descrever());
        System.out.printf("Prêmio: R$%.2f%n",bemSeguravel.calcularValorPremio());



    }
}
