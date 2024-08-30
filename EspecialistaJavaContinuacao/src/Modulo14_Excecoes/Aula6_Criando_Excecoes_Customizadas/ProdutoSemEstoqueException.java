package Modulo14_Excecoes.Aula6_Criando_Excecoes_Customizadas;

public class ProdutoSemEstoqueException extends ProdutoException{

    private final int estoqueDisponivel;
    private final int estoqueNecessário;

    public ProdutoSemEstoqueException(String message, int estoqueDisponivel, int estoqueNecessário) {
        super(message);
        this.estoqueDisponivel = estoqueDisponivel;
        this.estoqueNecessário = estoqueNecessário;
    }

    public int getEstoqueDisponivel() {
        return estoqueDisponivel;
    }

    public int getEstoqueNecessario() {
        return estoqueNecessário;
    }
}
