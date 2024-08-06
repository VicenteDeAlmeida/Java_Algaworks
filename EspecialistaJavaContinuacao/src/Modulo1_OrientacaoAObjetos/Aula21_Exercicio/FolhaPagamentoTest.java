package Modulo1_OrientacaoAObjetos.Aula21_Exercicio;

import java.util.Scanner;

public class FolhaPagamentoTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FolhaDePagamento folhaDePagamento = new FolhaDePagamento();
        ContratoTrabalho contratoTrabalho = new ContratoTrabalho();
        Funcionario funcionario = new Funcionario();
        System.out.println("Digite a quantidade de horas normais trabalhadas: ");
        funcionario.quantidadeHorasNormais = sc.nextDouble();
        System.out.println("Digite a quantidade de horas extras trabalhadas:");
        funcionario.quantidadeHorasExtras = sc.nextDouble();
        System.out.println("Digite o valor da hora normal: ");
        contratoTrabalho.valorHoraNormal = sc.nextDouble();
        System.out.println("Digite o valor da hora extra: ");
        contratoTrabalho.valorHoraExtra = sc.nextDouble();
        System.out.println("Qual é o nome do funcionário?");
        funcionario.nome = sc.next();
        System.out.println("Quantidade de filhos do funcionário?");
        funcionario.quantidadeDeFilhos = sc.nextInt();
        System.out.printf("Valor do salário: %.2f%n ",folhaDePagamento.calcularSalario(funcionario,contratoTrabalho));
        System.out.println("Nome do funcionário: "+ funcionario.nome);
        sc.close();

    }
}
