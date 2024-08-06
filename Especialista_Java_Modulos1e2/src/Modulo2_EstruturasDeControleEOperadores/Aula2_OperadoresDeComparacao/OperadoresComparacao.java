package Modulo2_EstruturasDeControleEOperadores.Aula2_OperadoresDeComparacao;
/**
 * São usados para comparar é maior,menor,menor ou igual ou ainda maior igual que outro
 * */
public class OperadoresComparacao {
    public static void main(String[] args) {

        int pesoProdutos = 2000;
        int limitePesoCaminhao = 1000;

        int pesoProdutos1 = 1000;
        int limitePesoCaminhao1 = 1000;

        boolean cargaExcedida = pesoProdutos > limitePesoCaminhao; /*Operador maior que*/
        System.out.printf("Carga excedida: %b%n",cargaExcedida);

        boolean cargaLiberada = pesoProdutos < limitePesoCaminhao; /*Operador menor que*/
        System.out.printf("A carga está libarada? %b%n",cargaLiberada);

        boolean cargaLiberada1 = pesoProdutos1 <= limitePesoCaminhao1; /*Operador menor ou igual*/
        System.out.printf("A carga está liberada agora? %b%n",cargaLiberada1);
        boolean cargaLiberada2 = pesoProdutos1 >= limitePesoCaminhao1; /*Operador maior ou igual*/
        System.out.printf("Liberou a carga agora? %b",cargaLiberada2);
    }
}
