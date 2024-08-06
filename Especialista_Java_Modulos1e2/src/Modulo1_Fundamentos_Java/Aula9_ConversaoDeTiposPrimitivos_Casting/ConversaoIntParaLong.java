package Modulo1_Fundamentos_Java.Aula9_ConversaoDeTiposPrimitivos_Casting;

public class ConversaoIntParaLong {
    /*Aqui nesse caso como o long é maior que o int (long 64 bytes e int 32 bytes) o casting é feito de maneira automática
     * chamamos de casting implícito*/
    public static void main(String[] args) {
        int y = 102344;
        long x = y;
        System.out.println(x);
        System.out.println(y);



    }
}

