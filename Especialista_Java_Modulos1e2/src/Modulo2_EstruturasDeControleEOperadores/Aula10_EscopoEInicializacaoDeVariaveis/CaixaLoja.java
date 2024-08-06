package Modulo2_EstruturasDeControleEOperadores.Aula10_EscopoEInicializacaoDeVariaveis;

import java.util.Scanner;

public class CaixaLoja {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Preço dos produtos: ");
        double preco = entrada.nextDouble();

        System.out.println("Cobrar frete? ");
        boolean frete = entrada.nextBoolean();

        double valorFrete = 0;
        if (frete) {
            System.out.println("Qual valor do frete?");
            valorFrete = entrada.nextDouble();
        }

        double valorTotal = preco + valorFrete; /*Se eu não tivesse declarado a variável lá em cima primeiro,quando eu
        chegasse aqui no cálculo eu não teria acesso a ela.No if ela tem acesso somente dentro do bloco*/

        System.out.printf("O valor total ficou em %.2f", valorTotal);

    }
}
