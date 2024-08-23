package Modulo13_Continuacao_MelhoriaDoCodigoDoPacoteAnterior;

import Modulo13_Continuacao_MelhoriaDoCodigoDoPacoteAnterior.com.algaworks.locadora.modelo.*;

public class ExecutoraMelhoria {
    public static void main(String[] args) {

        Notebook notebook = new Notebook("Samsung terceira geração",5,100);
        Precificacao precificacaoHora = new PrecificacaoPorHora();
        Precificacao precificacaoDias = new PrecificacaoPorDia();
        Seguro seguroSantander = new SeguroSantander();
        Seguro seguroItau = new SeguroItau();

        Locacao locacao = new Locacao(notebook,precificacaoHora);
        Locacao locacao1 = new Locacao(notebook,precificacaoDias,seguroSantander);
        Locacao locacao2 = new Locacao(notebook,precificacaoDias,seguroItau);
        double calcularValorDevido = locacao.calcularValorDevido(10);
        System.out.printf("Valor a pagar: %.2f%n",calcularValorDevido);

        double calcularValorDevidoDias = locacao1.calcularValorDevido(10);
        System.out.printf("Valor a pagar: %.2f%n",calcularValorDevidoDias);

        double calcularValorDevidoDiasSeguroItau = locacao2.calcularValorDevido(10);
        System.out.printf("Valor a pagar: %.2f",calcularValorDevidoDiasSeguroItau);
    }
}
