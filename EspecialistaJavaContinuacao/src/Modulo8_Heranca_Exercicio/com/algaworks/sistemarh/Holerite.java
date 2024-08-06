package Modulo8_Heranca_Exercicio.com.algaworks.sistemarh;

public record Holerite(String nome,String mesAno,double valorSalario) {

    public void imprimir(){
        System.out.printf("Dados do seu holerite:%nNome: %s%nAno/Més de competência: %s%nValor a receber:R$%.2f",nome,mesAno,valorSalario);
    }
}
