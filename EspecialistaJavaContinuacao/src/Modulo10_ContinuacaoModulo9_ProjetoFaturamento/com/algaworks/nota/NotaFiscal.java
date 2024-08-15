package Modulo10_ContinuacaoModulo9_ProjetoFaturamento.com.algaworks.nota;

public abstract class NotaFiscal {

    /*Classe abstrata são classes que não podem ser instanciadas,ou que não fazem sentido ser instanciadas.Nesse caso não faz
    * sentido instanciar Nota Fiscal pois uma nota fiscal tem que ser de alguma coisa (produto,serviço etc.)*/
     private String descricao;
     private double valorTotal;

    public NotaFiscal(String descricao, double valorTotal) {
        this.descricao = descricao;
        this.valorTotal = valorTotal;
    }

    public String getDescricao() {
        return descricao;
    }



    public double getValorTotal() {
        return valorTotal;
    }

    public abstract double calcularImpostos(); /*Isso aqui seria o método abstrato ou seja um método sem implementação nenhuma.
    Nas subclasses podemos chamar esse método e implementa-lo.Só podemos ter métodos abstratos em classes abstratas.
    Qualquer classe herdada vai ter que fazer a sobrescrita desse método*/

    public void emitir(){
        System.out.printf("Emitindo nota fiscal para: %s%n",getDescricao());
        System.out.printf("Valor total da nota: %.2f%n",getValorTotal());
        System.out.printf("Valor total com Impostos: %.2f%n",calcularImpostos());
    }

}
