package Modulo1_Fundamentos_Java.Aula7_TiposPrimitivosContinuacao;
/*long é um tipo númerico para armazenar valores inteiros,possui 64 bytes de armazenamento,sendo
* bem maior que o int*/

public class TipoLong {
    public static void main(String[] args) {
        long capacidade = 9223372036854775807L; /*Essa é capacidade máxima de uma variável do tipo long,passou
        disso não compila.Tipo long sempre tem que ter um L no final para diferir do inteiro*/

        System.out.println("Capacidade máxima do long "+ capacidade);
    }
}
