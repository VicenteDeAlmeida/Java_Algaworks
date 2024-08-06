package Modulo5_GerenciamentoDeMemoria.Aula4_ConfigurandoAHeapDaJvm;
/*Aula mais orientada a linha de comando
* Comando para configurar o quanto a heap vai ocupar de memória : java -Xmx2G TesteAula4.java
* onde 2G é a ocupação (2 giga).Outro exemplo: java -Xmx900M TesteAula4.java onde 900M é a ocupação (900 mega)*/
public class TesteAula4 {
    public static void main(String[] args) {
        /*Consultar o limite máximo que a JVM pode usar.OBS: A jvm não pode usar toda a memória disponível,ela tem um limite*/
        imprimirUsoMemoria();

        byte[] x = new byte[300 * 1024 * 1024];

        imprimirUsoMemoria();

    }

    static void imprimirUsoMemoria(){
        System.out.printf("Máximo que a memória heap pode ocupar em bytes: %s%n",emMegabytes(Runtime.getRuntime().maxMemory()));

        /*Quanto de memória já foi reservada para a JVM*/

        System.out.printf("Máximo que a memória heap reservada pela JVM ao sistema operacional: %s%n",
            emMegabytes(Runtime.getRuntime().totalMemory()));
        System.out.printf("Quanto do máximo que a memória heap reservada pela JVM ao sistema operacional ainda está disponível: %s%n",
            emMegabytes(Runtime.getRuntime().freeMemory()));

        long memoriaUsada = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        System.out.printf("Memória usada %s%n ",emMegabytes(memoriaUsada));

        System.out.println("--------------");
    }

    static String emMegabytes(long bytes){
        return String.format("%.2fMB",bytes / 1024 / 1024d);
    }
}
