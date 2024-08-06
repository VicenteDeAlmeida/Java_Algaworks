package Modulo1_Fundamentos_Java.Aula8_TiposPrimitivosContinuacao;
/*É tipo que armazena números com casas decimais.Possui 32 bytes de armazenamento e uma precisão de +/- 6 casas
 * decimais*/
public class TipoFloat {
    public static void main(String[] args) {
        float taxa = 1_294.93F;/*É necessário o F no final para a conversão para Float,senão o Java entende que é Double e
        não compila*/

        System.out.println("A taxa é de " + taxa);
    }
}
