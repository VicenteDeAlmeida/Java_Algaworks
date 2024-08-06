package Modulo1_Fundamentos_Java.Aula9_ConversaoDeTiposPrimitivos_Casting;

public class ConversaoFloatParaDouble {
    public static void main(String[] args) {
        float taxa1 = 204.5F;
        double taxa2 = taxa1; /*Mesma situação da conversão de long para int*/
        System.out.println(taxa2);
    }
}
