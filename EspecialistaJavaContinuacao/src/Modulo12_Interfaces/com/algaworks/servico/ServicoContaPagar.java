package Modulo12_Interfaces.com.algaworks.servico;

import Modulo12_Interfaces.com.algaworks.pagamento.*;

public class ServicoContaPagar {

    private MetodoPagamento metodoPagamento;

    public ServicoContaPagar(MetodoPagamento metodoPagamento) {
        this.metodoPagamento = metodoPagamento;
    }

    public void pagar(DocumentoPagavel documento){

        metodoPagamento.pagar(documento);

    }

    public void separador(){
        System.out.println("___________________________________________________________");
    }
}
