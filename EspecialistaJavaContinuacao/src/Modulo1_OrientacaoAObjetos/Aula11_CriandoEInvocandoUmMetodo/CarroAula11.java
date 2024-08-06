package Modulo1_OrientacaoAObjetos.Aula11_CriandoEInvocandoUmMetodo;

public class CarroAula11 {
    String fabricante;
    String modelo;
    String cor;
    int anoFabricacao;
    PessoaAula11 proprietario;

    void calcularValorRevenda() {
        /*Modelo báscio de criação de métodos*/
        System.out.printf("Calcular valor de revenda de: %s %d%n", modelo, anoFabricacao);
    }

    void imprimeSeparador(){
        System.out.println("#################################################################");
    }


}
