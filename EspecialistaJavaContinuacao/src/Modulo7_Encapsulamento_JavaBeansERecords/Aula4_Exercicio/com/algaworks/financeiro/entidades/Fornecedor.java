package Modulo7_Encapsulamento_JavaBeansERecords.Aula4_Exercicio.com.algaworks.financeiro.entidades;

public class Fornecedor {

    private String nome;


    public Fornecedor() {

    }

    public Fornecedor(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
