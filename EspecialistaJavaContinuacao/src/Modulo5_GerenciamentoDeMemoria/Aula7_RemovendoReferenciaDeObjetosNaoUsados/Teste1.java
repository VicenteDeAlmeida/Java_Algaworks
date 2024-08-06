package Modulo5_GerenciamentoDeMemoria.Aula7_RemovendoReferenciaDeObjetosNaoUsados;

public class Teste1 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente();
        Cliente cliente2 = new Cliente();

        cliente1.nome = "Ana";
        cliente2.nome = "Pedro";

        Pilha pilha = new Pilha();
        pilha.adicionar(cliente1);
        pilha.adicionar(cliente2);
        pilha.imprimirEstatisticas();

        Cliente clienteRetirado = pilha.retirar();
        System.out.println(clienteRetirado.nome);
        clienteRetirado = pilha.retirar();
        System.out.println(clienteRetirado.nome);
        pilha.imprimirEstatisticas();
    }
}
