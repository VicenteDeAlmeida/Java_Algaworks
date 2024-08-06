package Modulo7_Encapsulamento_JavaBeansERecords.Aula4_Exercicio;

import Modulo7_Encapsulamento_JavaBeansERecords.Aula4_Exercicio.com.algaworks.financeiro.entidades.Fornecedor;
import Modulo7_Encapsulamento_JavaBeansERecords.Aula4_Exercicio.com.algaworks.financeiro.servico.ContaPagar;

public class Principal {
    public static void main(String[] args) {

        ContaPagar contaAuguel = new ContaPagar();
        Fornecedor fornecedor = new Fornecedor("Zé das Couves");

        contaAuguel.setDescricao("Aluguel de dezembro");
        contaAuguel.setFornecedor(fornecedor);
        contaAuguel.setValor(4500);
        contaAuguel.setDataVencimento("14/07/2020");
        imprimeDados(contaAuguel);

        System.out.println("__________________________________________________");

        //contaAuguel.pagar();
        //imprimeDados(contaAuguel);

        System.out.println("__________________________________________________");

        //Pagar a mesma conta de novo,deve ser impedido
        //contaAuguel.pagar();

        //Cancelar o pagamanto de uma conta pendente,deve ser impedido
        contaAuguel.cancelarPagamento();
        imprimeDados(contaAuguel);

    }

    public static void imprimeDados(ContaPagar conta){

        System.out.printf("Fornecedor: %s%n",conta.getFornecedor().getNome());
        System.out.printf("Descrição da conta: %s%n",conta.getDescricao());
        System.out.printf("Valor da conta: %.2f%n",conta.getValor());
        System.out.printf("Data de vencimento: %s%n",conta.getDataVencimento());
        System.out.printf("Pago: %s%n",conta.isPago() ? "Sim" : "Não");
    }
}
