package Modulo12_Interfaces.com.algaworks.pagamento;
/**
 * Interface é como se fosse um contrato que define um tipo,nesse exemplo a interface documento pagavel pode seruma conta,um holerite,
 * um boleto etc...
 * A interface possui métodos abstratos que você pode escolher implementar nas classes conforme necessidade
 * As interfaces assim como as classes abstratas não podem ser instanciadas.
 * As interfaces não tem atributos mas podem possuir constantes
 * */

public interface DocumentoPagavel {

    public abstract double getValorTotal(); /*Todo o documento pagavel deve ter um valor total*/

    Beneficiario getBeneficiario(); /*Todo o documento pagavel deve ter um beneficiário e assim vou criando so métodos abstratos*/

}
