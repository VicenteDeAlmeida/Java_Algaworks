package Modulo1_Fundamentos_Java.Aula9_ConversaoDeTiposPrimitivos_Casting;

public class ConversaoDoubleParaFloat {
    public static void main(String[] args) {
        double peso1 = 20.5;
        float peso2 = (float) peso1; /*Mesma situação a atribuição de int para long*/
        System.out.println(peso2);
    }
}
