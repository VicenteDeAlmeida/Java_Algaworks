package Modulo1_Fundamentos_Java.Aula6_TiposPrimitivos;
/*Tipo primitivo boolean armazena verdadeiro ou falso*/
public class TipoBoolean {
    public static void main(String[] args) {

        boolean compraAprovada = true;
        boolean compraReprovada = false;

        System.out.println(compraAprovada);
        System.out.println(compraReprovada);

        int quantidadeEstoque = 20;
        int quantidadeCompra = 15;

        boolean estoqueSuficiente = quantidadeEstoque >= quantidadeCompra;
        System.out.println("Estoque suficiente: " + estoqueSuficiente);

    }
}
