package Modulo1_OrientacaoAObjetos.Aula21_Exercicio;

public class FolhaDePagamento {

    double calcularSalario(Funcionario funcionario,ContratoTrabalho contratoTrabalho){
        double totalDeHoras = funcionario.quantidadeHorasExtras + funcionario.quantidadeHorasNormais;
        double valoresTotais = contratoTrabalho.valorHoraNormal + contratoTrabalho.valorHoraExtra;
        double valorTotalDoSalario = totalDeHoras * valoresTotais;
        if (funcionario.quantidadeDeFilhos>=1){
            return (valorTotalDoSalario) + valorTotalDoSalario * 0.1;
        }
        return valorTotalDoSalario;

    }
}
