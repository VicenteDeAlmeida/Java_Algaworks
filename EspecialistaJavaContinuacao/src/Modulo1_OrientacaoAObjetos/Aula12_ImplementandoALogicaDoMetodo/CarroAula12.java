package Modulo1_OrientacaoAObjetos.Aula12_ImplementandoALogicaDoMetodo;

public class CarroAula12 {
    String fabricante;
    String modelo;
    String cor;
    int anoFabricacao;
    double precoCompra2023;
    double precoCompra2024;
    PessoaAula12 proprietario;

    void calcularDesvalorizacao() {


        if (precoCompra2023 < precoCompra2024) {
            System.out.printf("Dados do carro:%s%n%s%n%s%n%d%n%n", modelo, fabricante, cor, anoFabricacao);
            System.out.println("O preço do ano anterior não pode ser menor do que o preço do " +
                "ano atual.");
        } else {
            System.out.printf("Dados do carro:%s%n%s%n%s%n%d%n%n", modelo, fabricante, cor, anoFabricacao);
            int divisor = 100;
            double indiceDesvalorizacao = (precoCompra2023 - precoCompra2024) / precoCompra2023 * divisor;
            System.out.printf("O seu preço de compra em 2023 foi de %.3f e em 2024 foi de %.3f%n", precoCompra2023, precoCompra2024);
            System.out.printf("O índice de desvalorização foi de %.3f%n", indiceDesvalorizacao);

        }
    }

    void imprimeSeparador() {
        System.out.println("#################################################################");
    }


}
