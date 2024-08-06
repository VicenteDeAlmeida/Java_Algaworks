package Modulo3_WrappersEBoxing.Aula2_MetodosDeConversao;

public class Principal {
    public static void main(String[] args) {

        int idade = 20;

        Integer diasEntrega = Integer.valueOf(30);
        Short diasEntregaShort = Short.valueOf(diasEntrega.shortValue());
        Long diasEntregaLong = Long.valueOf(diasEntrega.longValue());


        Double valorTotal = Double.valueOf(1500.2);/*Aqui convertendo pra int,porém perdemos as casas decimais,tomar cuidado*/
        Integer valorTotalInt = valorTotal.intValue();
        System.out.println(valorTotalInt);
    }
}
