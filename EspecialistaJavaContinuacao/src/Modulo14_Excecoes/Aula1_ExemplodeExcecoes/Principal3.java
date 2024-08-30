package Modulo14_Excecoes.Aula1_ExemplodeExcecoes;

public class Principal3 {
    public static void main(String[] args) {

        System.out.println("Início");

        Double valor = null;
        valor.intValue(); /*Aqui estamos tentando acessar o método de uma refêrencia nula*/

        System.out.println("Fim");
    }
}
