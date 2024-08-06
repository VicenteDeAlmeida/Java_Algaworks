package Modulo1_Fundamentos_Java.Aula6_TiposPrimitivos;
/*Tipo char representa um e somente um caracter,letra ou digito */
public class TipoChar {
    public static void main(String[] args) {

        char inicialDoNome = 'V'; /*Quando variável do tipo char eu preciso colocar entre aspas simples.
        Se eu colocar entre aspas duplas o Java entende que é String*/
        System.out.println("A letra inicial do meu nome é "+ inicialDoNome);

        System.out.println("Exemplo usando número:");
        char tipoDeCliente = '2';
        System.out.println("Tipo do cliente:" + tipoDeCliente);

    }
}
