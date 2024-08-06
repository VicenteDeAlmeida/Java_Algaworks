package Modulo1_Fundamentos_Java.Aula1_TrabalhandoComVariaveis;

public class AulaVariaveisBoasPraticas {
    public static void main(String[] args) {
        System.out.println("Sempre declarar uma variável por linha,não é recomendado pela convenção da oracle declarar variáveis na mesma linha" +
                "como foi mostrado na aula anterior na classe AulaVariaveis");
        int idadeVi = 30;
        int idadeLe = 23;
        int total = idadeLe + idadeVi;
        System.out.println("Total: "+ total);

        System.out.println("Outra boa prática é usar sempre nome de variável com lowerCamelCase: Ex: idadeVi,minhaIdade...");

    }
}
