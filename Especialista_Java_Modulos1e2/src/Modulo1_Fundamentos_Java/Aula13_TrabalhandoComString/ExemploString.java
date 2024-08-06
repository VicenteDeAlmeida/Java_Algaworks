package Modulo1_Fundamentos_Java.Aula13_TrabalhandoComString;

public class ExemploString {
    public static void main(String[] args) {
        System.out.println("Fala Mergulhador");
        System.out.println("Nesse caso vai concatenar tudo como string");
        int x = 10;
        int y = 40;
        System.out.println("Resultado " + x + y);
        System.out.println(x + y + " Nesse caso ele vai fazer a expressão aritmética");
        System.out.println("O COMPILADOR SÓ COMEÇA A FAZER A CONCATENAÇÃO NO MOMENTO QUE ELE ENCONTRA UM TEXTO" +
                ",POR ISSO ISSO ACONTECE");

        System.out.println("Para resolução basta colocar a expressão que eu quero entre parênteses");
        System.out.println("Resultado aritmético  = " + (x + y));

    }
}
