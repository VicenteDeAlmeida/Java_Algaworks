package Modulo1_OrientacaoAObjetos.Aula13_MetodosComRetorno;

public class CarroAula13 {
    String fabricante;
    String modelo;
    String cor;
    int anoFabricacao;
    double precoCompra2023;
    double precoCompra2024;
    PessoaAula13 proprietario;

    void calcularEImprimirDesvalorizacao() {

        if (precoCompra2023 < precoCompra2024) {
            System.out.println("O preço do ano anterior não pode ser menor do que o preço do " +
                "ano atual.");
        } else {
            int divisor = 100;
            double indiceDesvalorizacao = (precoCompra2023 - precoCompra2024) / precoCompra2023 * divisor;
            System.out.printf("O seu preço de compra em 2023 foi de %.3f e em 2024 foi de %.3f%n", precoCompra2023, precoCompra2024);
            System.out.printf("O índice de desvalorização foi de %.3f%n", indiceDesvalorizacao);
        }
    }

    double calculaIpva() {
        double calculo1 = (precoCompra2024 * 4);
        return calculo1 / 100;
    }

    void imprimeIpva() {
        System.out.printf("Valor do seu IPVA:R$%.3f%n", calculaIpva());
    }

    int calcularTempoDeUsoEmAnos() {
        return 2024 - anoFabricacao;
    }

    void imprimeTempoDeUso() {
        System.out.println("Tempo de uso do carro: " + calcularTempoDeUsoEmAnos());
    }

    String imprimeDadosDoCarro() {
        return System.out.printf("Dados do carro:%s%n%s%n%s%n%d%n%n", modelo, fabricante, cor, anoFabricacao).toString();

    }

    void imprimeSeparador() {
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");

    }
}
