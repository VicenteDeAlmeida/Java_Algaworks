package Modulo3_WrappersEBoxing.Aula1_UsandoClassesWrapper;

public class Principal2 {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();

        System.out.printf("Idade: %d%n",cliente.idade);/*aqui como não declarei nada em idade a saída vai ser null,pois eu declarei
        esse atributo com uma classe wrapper,Se fosse um tipo primitivo retornaria 0*/
        System.out.printf("Renda mensal: %d%n ",cliente.rendaMensal);



    }
}
