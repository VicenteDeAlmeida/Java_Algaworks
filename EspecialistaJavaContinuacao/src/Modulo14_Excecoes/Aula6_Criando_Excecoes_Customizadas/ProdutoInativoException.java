package Modulo14_Excecoes.Aula6_Criando_Excecoes_Customizadas;

public class ProdutoInativoException extends ProdutoException {

    public ProdutoInativoException(String mensagem) {
        super(mensagem);
    }
}
