package Modulo9_PolimorfismoEClassesAbstratas;

import Modulo9_PolimorfismoEClassesAbstratas.com.algaworks.banco.*;

public class Principal1 {
    public static void main(String[] args) {
        CaixaEletronico caixaEletronico = new CaixaEletronico();

       ContaEspecial conta1 = new ContaEspecial(new Titular("Marcio Costa","0014785878"),58,58789,90);
       conta1.setLimiteChequeEspecial(1000);
       conta1.depositar(300);

       ContaEspecial conta2 = new ContaEspecial(new Titular("Maria Dolores","22558963698"),58,58456,90);

        ContaSalario conta3 = new ContaSalario(new Titular("Vicente Almeida","55447789625"),60,23897);

       caixaEletronico.transferir(conta3,conta1,50.00);
       conta1.imprimirDemonstrativo();
       conta2.imprimirDemonstrativo();


    }
}
