package Modulo2_EstruturasDeControleEOperadores.Aula1_OperadoresDeIgualdadeENegacao;

public class OperadoresDeNegacaoUnarios {
    public static void main(String[] args) {
        int numero1 = 10;
        int numero2 = 11;
        boolean numerosIguais = numero1 == numero2;
        boolean numerosDiferentes = !numerosIguais; /*O operador unário realiza a operação ao contrário,o que era true se torna false
        e o que é false se torna true.Se chama também unário pq ele precisa somente de um operando*/
        System.out.printf("Resultado sem o operador unário: %b%n",numerosIguais);
        System.out.printf("Resultado com o operador unário: %b%n",numerosDiferentes);
         /*Outra possibilidade*/

        boolean outraPossibilidade = !(numero1 == numero2);
        System.out.printf("Nesse caso vai retornar true por causa da negação. %b",outraPossibilidade);

    }
}
