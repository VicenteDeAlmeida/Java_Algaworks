package Modulo1_Fundamentos_Java.Aula9_ConversaoDeTiposPrimitivos_Casting;

public class ConversaoLongParaInt {
    public static void main(String[] args) {
        long x = 10;
        int y =(int) x; /*Nesse exemplo: Não posso atribuir uma variável do tipo long (64 bytes) para uma variável do tipo int (32 bytes)
        Para isso eu preciso fazer o casting (int) antes do valor da variável*/
        System.out.println(x);
        System.out.println(y);

        System.out.println("Apresentando agora o problema ao fazer o casting");
        long a = 9300000035L;
        int b = (int) a;
        System.out.println(a);
        System.out.println(b); /*Aqui com o casting ele imprime um valor completamente diferente,e aqui é o perigo:
        Perdermos valor.*/

    }
}
