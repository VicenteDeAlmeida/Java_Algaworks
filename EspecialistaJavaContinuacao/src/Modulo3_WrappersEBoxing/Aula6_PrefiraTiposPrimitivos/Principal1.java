package Modulo3_WrappersEBoxing.Aula6_PrefiraTiposPrimitivos;

public class Principal1 {
    public static void main(String[] args) {
        Integer numero1 = 128;
        Integer numero2 = 128;

        //Comparação Errada
        System.out.println(numero1 == numero2);

        //Comparação certa
        System.out.println(numero1.equals(numero2));

        //Outra comparação certa
        System.out.println(numero1.compareTo(numero2) == 0);

    }


}
