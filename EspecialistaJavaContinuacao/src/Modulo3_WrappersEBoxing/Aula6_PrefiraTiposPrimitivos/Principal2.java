package Modulo3_WrappersEBoxing.Aula6_PrefiraTiposPrimitivos;

public class Principal2 {
    public static void main(String[] args) {
        Integer idade = null;

        //NullPointer exception em todas as instruções abaixo
        System.out.println(idade + 10);
        System.out.println(idade == 10);
        System.out.println(idade.equals(100));
    }
}
