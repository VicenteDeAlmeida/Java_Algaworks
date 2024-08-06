package Modulo5_GerenciamentoDeMemoria.Aula5_GarbageCollector;
/*Garbage Collector é conheciod como coleta de lixo,é um mecânismo da jvm para identificar objetos que não
* estão sendo mais referenciados,usados mas que ainda estão lá na memória heap com objetivo de desalocar o espaço que não está sendo ocupado*/
public class TesteGarbage {
    public static void main(String[] args) {
        imprimirUsoMemoria();
        byte [] x = new byte[500*1024*1024];
        imprimirUsoMemoria();
        x = null;

        System.gc();
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
