package Modulo4_TrabalhandoComArrays.Aula14_MetodosComVarArgs;

public class Principal {
    public static void main(String[] args) {

        Fatura fatura = new Fatura();
        fatura.numero = 123;
        fatura.valorTotal = 1_293.55;

        ServicoDeCobranca servicoDeCobranca = new ServicoDeCobranca();
        String[] emailsCobranca = {"vicente.al@hotmail.com","vicente.al@gmail.com"};
        servicoDeCobranca.pagar(fatura,emailsCobranca);

        System.out.println("************************");

        /*Outra maneira de escrever o código acima*/
        servicoDeCobranca.pagar(fatura,new String[]{"vicente.al@hotmail.com","vicente.al@gmail.com"});

        System.out.println("************************");

        /*Maneira de somente notificar o pagamento porém sem enviar a fatura para o email*/
        servicoDeCobranca.pagar(fatura,new String[]{});

        System.out.println("************************");

        /*Usando varargs*/
        servicoDeCobranca.pagar(fatura,"vicente.al@hotmail.com","vicente.al@gmail.com","teste@testeemail.com");
        System.out.println("************************");

        /*Maneira de somente notificar o pagamento porém sem enviar a fatura para o email,usando o varargs*/
        servicoDeCobranca.pagar(fatura);

    }
}
