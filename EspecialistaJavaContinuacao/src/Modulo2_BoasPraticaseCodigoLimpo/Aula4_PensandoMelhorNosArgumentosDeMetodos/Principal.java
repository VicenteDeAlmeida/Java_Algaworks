package Modulo2_BoasPraticaseCodigoLimpo.Aula4_PensandoMelhorNosArgumentosDeMetodos;

public class Principal {

    public static void main(String[] args) {
         CarrinhoDeCompra carrinho = new CarrinhoDeCompra();
         Produto produto = new Produto();
         produto.precoUnitario = 5.00;
         produto.nome = "Água";
         carrinho.adicionarItem(4);
         produto.ativar();
         produto.inativar();
    }
}
