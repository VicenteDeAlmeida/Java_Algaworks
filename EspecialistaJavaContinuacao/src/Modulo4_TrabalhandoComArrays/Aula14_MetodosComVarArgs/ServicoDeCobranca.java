package Modulo4_TrabalhandoComArrays.Aula14_MetodosComVarArgs;

public class ServicoDeCobranca {

    void pagar(Fatura fatura,String... emailsCobranca){
        /*Os 3 pontos na assinatura do método é o varargs.Significa que eu posso passar qualquer string como argumento e não necessariamente
        * um array de strings como estava anteriormente.OBS: O varargs precisas ser sempre o último parâmetro,senão não copila*/
        System.out.printf("Fatura %d, no valor total de R$%.2f,foi paga!%n",fatura.numero,fatura.valorTotal);

        for (String email : emailsCobranca) {
            System.out.printf("Fatura %d enviada para %s%n",fatura.numero,email);

        }
    }
}
