package Modulo11_Exercicio_PolimorfismoEClassesAbstratas;

public class ClasseExecutoraPj {
    public static void main(String[] args) {

        GestorDeImpostos gestorDeImpostosPj = new GestorDeImpostos();
        EmpresaSimples barDoZe = new EmpresaSimples("Bar do Zé",25000,160000);
        EmpresaLucroReal bronzeConsultoria = new EmpresaLucroReal("Bronze Consultoria",8000000,6000000);

        gestorDeImpostosPj.adicionar(barDoZe);
        gestorDeImpostosPj.adicionar(bronzeConsultoria);

        System.out.printf("Total de impostos: %.2f",gestorDeImpostosPj.getValorTotalImpostos());

    }
}
