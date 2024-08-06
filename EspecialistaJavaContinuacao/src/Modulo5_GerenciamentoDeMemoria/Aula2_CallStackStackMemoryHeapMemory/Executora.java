package Modulo5_GerenciamentoDeMemoria.Aula2_CallStackStackMemoryHeapMemory;
/*
Aula com explicação através de slides sobre como funciona o comportamento de alocação de metódos na Call stack (pilha de chamadas)
e as instansiações na memória heap
**/
public class Executora {
    public static void main(String[] args) {

        int a = 40;
        metodo1(a);
    }

    static void metodo1(int x){
        int z = x * 2;
        metodo2();
    }

    static void metodo2(){
        Produto produto = new Produto();
        produto.codigo = 10;
        produto.preco = 120.34;

    }
    /*Quando temos um método que chama outro método,temos o que chamamos de pilha de chamada,como nesse caso*/
}
