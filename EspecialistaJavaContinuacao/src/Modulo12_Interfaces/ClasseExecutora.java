package Modulo12_Interfaces;

import Modulo12_Interfaces.com.algaworks.modelo.Holerite;
import Modulo12_Interfaces.com.algaworks.modelo.OrdemDeServico;
import Modulo12_Interfaces.com.algaworks.pagamento.Beneficiario;
import Modulo12_Interfaces.com.algaworks.pagamento.MetodoPagamento;
import Modulo12_Interfaces.com.algaworks.pagamento.Pix;
import Modulo12_Interfaces.com.algaworks.pagamento.TransferenciaEletronica;
import Modulo12_Interfaces.com.algaworks.servico.ServicoContaPagar;

public class ClasseExecutora {
    public static void main(String[] args) {
        MetodoPagamento pix = new Pix();
        ServicoContaPagar servicoContaPagar = new ServicoContaPagar(pix);
        Beneficiario beneficiario1 = new Beneficiario("João da Silva","0258978","25879");
        Holerite documento = new Holerite(beneficiario1,20,20);
        servicoContaPagar.pagar(documento);
        servicoContaPagar.separador();

        Beneficiario beneficiario2 = new Beneficiario("Maria do Carmo","00225896558","258978");
        OrdemDeServico ordemDeServico = new OrdemDeServico(beneficiario2,150);
        servicoContaPagar.pagar(ordemDeServico);
        servicoContaPagar.separador();

        MetodoPagamento transferencia = new TransferenciaEletronica();
        ServicoContaPagar servicoContaPagar1 = new ServicoContaPagar(transferencia);
        Beneficiario beneficiario3 = new Beneficiario("Marta Silva","025895874","02589");
        OrdemDeServico ordemDeServico1 = new OrdemDeServico(beneficiario3,15000);
        servicoContaPagar1.pagar(ordemDeServico1);





    }
}
