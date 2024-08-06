package Modulo4_TrabalhandoComArrays.Aula2_AcessandoEAtribuindoElementosDeArrays;

public class PrincipalArraysAula2 {
    public static void main(String[] args) {

        int [] notas = {32,58,96,100,98};
        System.out.println("Acessando a primeira posição do array,nesse caso o 32... " + notas[0]);
        System.out.println("Acessando a segunda posição do array,nesse caso o 58... " + notas[1]);

        /*Podemos também acessar a posição declarando variável*/

        int posicao = 2;
        System.out.println("Com variável a posição 2 é... " + notas[posicao]);

        /*Podemos pegar a posição com um cálculo*/
        System.out.println("Com cálculo a posição 2 -1 é a 58... "+ notas[posicao -1]);

        /*Podemos também fazer operações matamáticas com os arrays*/

        int totalNotas = notas[0] + notas[1] + notas[2] + notas[3];
        System.out.println("Soma das notas: "+totalNotas);

        int multiplicacaoNotas = notas[0] * notas[1] * notas[2] * notas[3];
        System.out.println("Multiplicação das notas: "+ multiplicacaoNotas);

        /*Alterando a posição de um valor do array*/

        notas[4] = 89;
        System.out.println("Valor alterado de 98 para 89... "+ notas[4]);
    }
}
