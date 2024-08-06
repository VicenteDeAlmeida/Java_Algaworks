package Modulo4_TrabalhandoComArrays.Aula15_UseVarArgsComCuidado;

public class Principal {
    public static void main(String[] args) {

        Fatura fatura = new Fatura();
        fatura.numero = 123;
        fatura.valorTotal = 1_293.55;

        ServicoDeCobranca servicoDeCobranca = new ServicoDeCobranca();


        servicoDeCobranca.pagar(fatura,"vicente@teste.com.br","teste@teste.com.br");

    }
}
