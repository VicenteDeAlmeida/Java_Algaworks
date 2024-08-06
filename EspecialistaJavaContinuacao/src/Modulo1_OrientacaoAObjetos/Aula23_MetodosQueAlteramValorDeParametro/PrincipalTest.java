package Modulo1_OrientacaoAObjetos.Aula23_MetodosQueAlteramValorDeParametro;

public class PrincipalTest {
    public static void main(String[] args) {

        double precoCompraFornecedor = 140;

        ServicoDePrecificacao servicoDePrecificacao = new ServicoDePrecificacao();
        servicoDePrecificacao.calcularPrecoVenda(precoCompraFornecedor); /*Aqui o método não vai alterar o valor da variável*/
        System.out.printf("Preço: %.2f",precoCompraFornecedor);


    }
}
