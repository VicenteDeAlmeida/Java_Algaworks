package Modulo1_Fundamentos_Java.Aula6_TiposPrimitivos;

public class TipoByteEShort {
    public static void main(String[] args) {
        byte idade = 127; /*127 é o maior valor que cabe dentro de uma variável do tipo byte,passou disso
        não compila*/

        short quantidadeEstoque = 32767; /*32767 é o maior valor que cabe dentro de uma variável do tipo shor,passou disso
        não compila*/

        System.out.println("Byte valor máximo = " + idade);
        System.out.println("Short valor máximo = " + quantidadeEstoque);
    }
}
