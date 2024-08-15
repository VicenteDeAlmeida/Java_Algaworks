package Modulo11_Exercicio_PolimorfismoEClassesAbstratas;

public class ClasseExecutoraPf {
    public static void main(String[] args) {

        GestorDeImpostos gestorDeImpostos = new GestorDeImpostos();

        PessoaFisica joao = new PessoaFisica("João Almeida",4500);
        PessoaFisica maria = new PessoaFisica("Maria Silva",180000);

        gestorDeImpostos.adicionar(joao);
        gestorDeImpostos.adicionar(maria);

        System.out.printf("Total de impostos: %.2f",gestorDeImpostos.getValorTotalImpostos());
    }
}
