package Modulo14_Excecoes.Aula4_TryCatch.com.algaworks.estoque;

import java.util.Objects;

public class Produto4 {

    private String nome;
    private int quantidadeEstoque;
    private boolean ativo;

    public Produto4(String nome) {
        setNome(nome);

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
       /* if (nome == null){
            throw new NullPointerException("Por favor,informe um nome.");
        }*/
        /*Aqui poderiamos também usar a classe Objects: */
        Objects.requireNonNull (nome,"Por favor informe um nome.");
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

    public boolean isInativo(){
        return !isAtivo();
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public void ativar(){
        this.ativo = true;
    }

    public void desativar(){
        this.ativo = false;
    }
    public void retirarEstoque(int quantidade){
        if (quantidade  <0){

            throw new IllegalArgumentException(
                "A quantidade não pode ser negativa para retirada no estoque");
        }

        if (isInativo()){
            throw new IllegalStateException("Retirada no estoque não pode ser realizada em produtos inativos");

        }
        if (this.quantidadeEstoque - quantidade <0){
            throw new IllegalArgumentException("O estoque não pode ficar negativo.A quantidade de retirada não pode ser maior que a quantidade " +
                "disponível no estoque");

        }
        this.quantidadeEstoque -= quantidade;


    }


    public void adicionarEstoque(int quantidade){
        this.quantidadeEstoque += quantidade;
    }
}
