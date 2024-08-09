package Modulo9_PolimorfismoEClassesAbstratas.com.algaworks.banco;

public class CaixaEletronico {

    public static final double TARIFA_TRANSFERENCIA = 10;
    public static final double TARIFA_IMPRESSAO_DEMONSTRATIVO = 5;

    public void transferir(Conta contaOrigem, Conta contaDestino, double valorTransferencia) {
        System.out.printf("Transferindo R$%.2f da conta %d/%d para %d/%d%n", valorTransferencia, contaOrigem.getAgencia(),
            contaOrigem.getNumero(), contaDestino.getAgencia(), contaDestino.getNumero());

        contaOrigem.sacar(valorTransferencia + TARIFA_TRANSFERENCIA);
        contaDestino.depositar(valorTransferencia);

    }

    public void imrimirDemonstrativo(Conta conta) {

        if (conta instanceof ContaInvestimento){
            ContaInvestimento contaInvestimento = (ContaInvestimento) conta;/*Aqui é o que chamamos de downcasting que é quando queremos
        usar uma propriedade que não está na superclasse mas porém está em uma subclasse.Nesse caso será a propriedade
         valor total de rendimentos que está na subclasse ContaInvestimento mas não está na superclasse Conta (que está no parâmetro desse
         método).Tem que tomar cuidado pq conta salário é uma subclasse de Conta e não de Conta Investimento,então se formos usar
         esse método em uma instância de Conta salário vai lançar excessão.Para resolver isso usamos o instanceof*/
            if (contaInvestimento.getValorTotalRendimento() > 0) {
                System.out.println("Impressão do demonstrativo é gratuita!");
            } else {
               debitarTarifaImpressaoDemonstrativo(conta);
        }


        }
        else {
            debitarTarifaImpressaoDemonstrativo(conta);
        }
        conta.imprimirDemonstrativo();
    }

    private static void debitarTarifaImpressaoDemonstrativo(Conta conta) {
        System.out.printf("Custo da impressão: R$%.2f%n", TARIFA_IMPRESSAO_DEMONSTRATIVO);
        conta.sacar(TARIFA_IMPRESSAO_DEMONSTRATIVO);
    }
}
