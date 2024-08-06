package Modulo1_Fundamentos_Java.Aula11_PromocaoAritmetica;

public class PromocaoAritmetica1 {
    public static void main(String[] args) {
        long x = 10;
        float y = 9.34F;
        float z = x * y;
        System.out.println("Sempre que tivermos uma operação com ponto flutuante (float ou double) o resultado deverá ser " +
                "sempre em ponto flutuante "+ z);

        long a = 500;
        double b = 4.78;
        double r = a * b;

        System.out.println("Outro exemplo agora com double "+ r);



    }
}
