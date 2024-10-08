package Modulo7_Encapsulamento_JavaBeansERecords.Aula1_OProblemadaFaltaDeEncapsulamento.com.algaworks.cartaobeneficio;

public class Recibo {

    public String titular;
    public String descricao;
    public double valor;

    public Recibo(String titular , String descricao , double valor){
        this.titular = titular;
        this.descricao = descricao;
        this.valor = valor;
    }

    public void imprimir(){
        System.out.println("________________________");
        System.out.printf("RECIBO PARA %s%n",titular);
        System.out.printf("%s -> %.2f%n",descricao,valor);
        System.out.println("________________________");
    }
}
