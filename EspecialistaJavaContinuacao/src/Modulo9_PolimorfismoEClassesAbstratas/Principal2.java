package Modulo9_PolimorfismoEClassesAbstratas;

import Modulo9_PolimorfismoEClassesAbstratas.com.algaworks.banco.*;

public class Principal2 {
    public static void main(String[] args) {

        Titular titular = new Titular("João da Silva","00558963247");
        Conta contaSalario = new ContaSalario(titular,25,10); /*Aqui eu consigo instanciar uma conta salario do tipo conta
        pq conta salario é uma conta*/

    }
}
