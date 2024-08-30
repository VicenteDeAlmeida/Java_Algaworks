package Modulo14_Excecoes.Aula6_Criando_Excecoes_Customizadas;

public class ProdutoException extends Exception {
    public ProdutoException(String message) {
        super(message);
    }
}
