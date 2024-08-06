package Modulo1_Fundamentos_Java.Aula7_TiposPrimitivosContinuacao;
/*int é um tipo númerico para armazenar valores inteiros,possui 32 bytes de armazenamento*/
public class TipoInt {
    public static void main(String[] args) {

        int populacaoPortoAlegre = 699_097; /*Posso usar underscore para melhorar a legibilidade e separar e deixar o
         valor do número com o valor correto*/

        int populacaoPortoAlegre2 = 2147483647; /*Esse é o valoe máximo que uma variável do tipo int pode armazenar
        passando disso não compila*/

        System.out.println(populacaoPortoAlegre2);
        System.out.println(populacaoPortoAlegre);

    }
}
