package Modulo2_EstruturasDeControleEOperadores.Aula1_OperadoresDeIgualdadeENegacao;

public class ComparacaoDeStrings {
    public static void main(String[] args) {
        String nome1 = "Vicente";
        String nome2 = "Vicente";
        boolean nomesIguais = nome1 == nome2;
        System.out.printf("Nomes Iguais? %b",nomesIguais);

       /*Aqui não é recomendado comparar Strings assim,mas veremos pq mais a frente no curso*/
    }
}
