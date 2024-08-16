package Modulo12_Interfaces.com.algaworks.pagamento;

public class TransferenciaEletronica implements MetodoPagamento{
    @Override
    public void pagar(DocumentoPagavel documento) {
        Beneficiario beneficiario = documento.getBeneficiario();

        if (beneficiario.naoPossuiContaBancaria()){
            throw new RuntimeException("Beneficiário não possui conta bancária");

        }else {
            System.out.printf("Efetuando transferência para %s no valor de %.2f para a conta bancária %s.%n",
                beneficiario.getNome(),documento.getValorTotal(),beneficiario.getContaBancaria());

        }
    }
}
