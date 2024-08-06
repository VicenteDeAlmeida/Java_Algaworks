package Modulo2_EstruturasDeControleEOperadores.Aula15_EstruturaDeRepeticaoFor;

/**
 * A estrutura de repetição for é utilizada quando sabemos com antecedência a quantidade de vezes que queremos repetir
 * um determinada instrução
 */
public class EstruturaDeRepeticaoFor {
    public static void main(String[] args) {
        /*for(iniciação;condição;incremento ou decremento){
        }*/
        System.out.println("Exemplo:");

        for (int i = 1; i <= 10; i++) {
            /*1 - Iniciamos a variável i,2 - Enquanto a variável i for menor ou igual a 10 , 3 - Incremente a variável i*/

            System.out.println("Contagem " + i);

        }

        System.out.println("***********************************************************************************");

        for (int i = 10; i >= 0; i--) {
            System.out.println("se quisermos fazer a contagem em ordem decrescente");

            System.out.println("Contagem " + i);

        }


    }
}

