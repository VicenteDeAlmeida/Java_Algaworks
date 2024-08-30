package Modulo14_Excecoes.Aula6_Criando_Excecoes_Customizadas;

import java.util.Objects;

public class ProdutoAula6 {

    private String nome;
    private int quantidadeEstoque;
    private boolean ativo;

    public ProdutoAula6(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        Objects.requireNonNull("Nome deve ser informado");
        this.nome = nome;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public boolean isInativo() {
        return !isAtivo();
    }
    public void ativar(){
        this.ativo = true;
    }

    public void retirarEstoque(int quantidade) throws ProdutoSemEstoqueException, ProdutoInativoException {
        if (quantidade < 0) {

            throw new IllegalArgumentException(
                "A quantidade não pode ser negativa para retirada no estoque");
        }

        if (isInativo()) {
            throw new ProdutoInativoException("Retirada no estoque não pode ser realizada em produtos inativos");

        }
        if (this.quantidadeEstoque - quantidade < 0) {
            throw new ProdutoSemEstoqueException("Estoque insuficiente",this.quantidadeEstoque,quantidade);

        }
        this.quantidadeEstoque -= quantidade;


    }

    public void adicionarEstoque(int quantidade) {
        this.quantidadeEstoque += quantidade;
    }
}
