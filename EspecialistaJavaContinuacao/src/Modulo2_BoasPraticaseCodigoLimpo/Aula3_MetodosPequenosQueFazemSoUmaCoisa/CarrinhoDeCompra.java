package Modulo2_BoasPraticaseCodigoLimpo.Aula3_MetodosPequenosQueFazemSoUmaCoisa;

public class CarrinhoDeCompra {
    public static final double TAXA_SERVICO_PADRAO = 0.10;
    int quantidadeDeItens;
    Produto produto;

    void realizarCompra(String numeroCartao){

        double valorTotal = calcularValorTotal();

        boolean pagamentoAutorizado = GatewayDePagamento.autorizarPagamento(numeroCartao,valorTotal);

        if (pagamentoAutorizado){
            imprimirRecibo(valorTotal);
        }
    }

     void imprimirRecibo(double valorTotal) {

            System.out.println("RECIBO DE PAGAMENTO");
            System.out.printf("Valor total: R$%.2f%n", valorTotal);
    }

    double calcularValorTotal() {
        double subTotal = calcularSubTotal();
        double taxaServico = calcularTaxaServico(subTotal);
        double valorTotal = subTotal + taxaServico;
        return valorTotal;
    }

     double calcularTaxaServico(double subTotal) {
        return subTotal * TAXA_SERVICO_PADRAO;
    }

    double calcularSubTotal() {
        return produto.precoUnitario * quantidadeDeItens;
    }
}
/*Nessa aula recebemos um métodos com muitas responsabilidades e fomos refatornado para que essas responsabilidades fossem quebradas em
* outros métodos*/
