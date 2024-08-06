package Modulo2_EstruturasDeControleEOperadores.Aula1_OperadoresDeIgualdadeENegacao;

public class OperadoresIgualdade {
    public static void main(String[] args) {
        boolean numeroIguais = 10 == 10; /*Operador de igualdade ==*/
        System.out.printf("Números iguais: %b%n",numeroIguais);

        System.out.println("Podemos usar também expressões aritméticas");

        boolean operacao = (4 + 6) == 10;
        System.out.printf("Resultado da operação: %b%n",operacao);

        /*Outro exemplo*/
        boolean operacao1 = (4 + 6) == (5 * 2);
        System.out.printf("Resultado da operação 1:%b%n",operacao1);

        /*Outro exemplo comparando valores de variáveis*/
        int numero1 = 43;
        int numero2 = 430;
        boolean comparacao = numero1 == numero2;
        System.out.printf("Resultado da comparação entre variáveis: %b%n",comparacao);

        /*Outro exemplo*/
        int numero = 90;
        boolean outroExemplo = numero ==10;
        System.out.printf("Outro exemplo: %b",outroExemplo);

    }
}
