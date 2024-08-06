package Modulo3_WrappersEBoxing.Aula4_ComparandoWrappers;

public class PrincipalAula4 {
    public static void main(String[] args) {

        int numero1 = 127;
        int numero2 = 127;

        System.out.println(numero1 == numero2); /*Aqui o retorno vai ser true,pq os valores das variáveis são iguais*/

        Integer numero3 = 128;
        Integer numero4 = 128;

        System.out.println(numero3 == numero4); /*Aqui o retorno vai ser false,pq as classes wrapper referenciam um valor de memória e não o valor
        literal dela*/

        Integer numero5 = 130;
        Integer numero6 = 130;
        System.out.println(numero5.equals(numero6)); /*Para compararmos os valores (objetos) quando eles estiverem utilizando classe wrapper
        podemos utilizar o método equals que compara conteúdo e não endereço de memória*/

        Integer numero7 = 130;
        Short numero8 = 130;
        System.out.println(numero7.equals(numero8)); /*Aqui vai retornar false apesar do conteúdo da variável ser igual pq o equals além de comparar
        o conteúdo ele compara também o tipo e nesse caso os tipos são diferentes,alternativa de comparação abaixo*/

        System.out.println(numero7.intValue() == numero8.intValue()); /*Aqui ele vai desempacotar o número da classe wrapper,transforma em int e
        faz a comparação*/
    }
}
