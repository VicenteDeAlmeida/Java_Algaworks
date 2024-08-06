package Modulo2_BoasPraticaseCodigoLimpo.Aula4_PensandoMelhorNosArgumentosDeMetodos;

public class CarrinhoDeCompra {

    int quantidade;

    void adicionarItem(int quantidade) {
        if (quantidade == 0) {
            System.out.println("Você deve adicionar ao menos um produto.");
        }
    }
}

/*Aula para explicar que cada método deve ter a sua responsabilidade.*/
