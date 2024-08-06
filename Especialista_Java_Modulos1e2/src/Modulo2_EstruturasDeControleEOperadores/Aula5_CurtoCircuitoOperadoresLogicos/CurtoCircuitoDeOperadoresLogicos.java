package Modulo2_EstruturasDeControleEOperadores.Aula5_CurtoCircuitoOperadoresLogicos;

public class CurtoCircuitoDeOperadoresLogicos {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;

        boolean resultado = x == 15 && y++ == 20; /*Aqui não vai fazer o incremento pq ele ja avalia a primeira expressão
        como falsa.Como o operador é && que precisa que as duas expressões sejam verdadeiras ele nem avalia a próxima
        e o incremento não acontece*/

        System.out.printf("Resultado: %b%n",resultado);
        System.out.println("Resultado de y "+y);

        boolean outroResultado = x == 10 && y++ ==20; /*Aqui sim ele já incrementa pq a primeira expressão é verdadeira*/
        System.out.printf("O outro resultado com y incrementado: %b%n",outroResultado);
        System.out.println("Outro resultado de y "+y);

        System.out.println("Com ou funciona do mesmo jeito,mas isso é só para entender mesmo,isso não é boa prática");

    }
}
