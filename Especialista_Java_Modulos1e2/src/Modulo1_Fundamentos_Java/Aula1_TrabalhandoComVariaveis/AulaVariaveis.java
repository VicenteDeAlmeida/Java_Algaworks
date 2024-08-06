package Modulo1_Fundamentos_Java.Aula1_TrabalhandoComVariaveis;
/**
 * Variáveis são dados,informações armazenadas na memória do computador
 * */
public class AulaVariaveis {
    public static void main(String[] args) {
        /*Declarando uma variável*/
        /*1 - Definir o tipo,nesse caso int
        * 2 - Colocar o nome
        * 3 - Colocar ponto e vírgula
        * 4 - Atribuir um valor para a variável*/

        int minhaIdade;
        minhaIdade = 40;
        System.out.println(minhaIdade);

        /*Não é necessário que se declare e depois se atribua a variável,podemos fazer isso
        * ao mesmo tempo*/

        int suaIdade = 60;
        System.out.println(suaIdade);

        /*Também posso alterar o valor da variável*/

        suaIdade = 90;
        System.out.println(suaIdade);

        /*Posso utilizar expressões aritméticas com as variáveis*/

        int idade1 = 90;
        int idade2 = 190;
        int totalDasIdades = idade1 + idade2;
        System.out.println(totalDasIdades);

        /*Concatenação,juntando o total com um texto*/
        System.out.println("A soma das idades é " + totalDasIdades + ".");

        /*Posso declarar as variáveis na mesma linha quando forem do mesmo tipo*/

        int outraIdade = 89 , maisUmaIdade = 24;

        int totalMesmaLinha = outraIdade + maisUmaIdade;
        System.out.println("A soma das variáveis declaradas na mesma linha é " + totalMesmaLinha);


    }

}
