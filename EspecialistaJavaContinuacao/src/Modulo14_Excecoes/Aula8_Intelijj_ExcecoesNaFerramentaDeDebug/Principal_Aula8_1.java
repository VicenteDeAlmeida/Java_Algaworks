package Modulo14_Excecoes.Aula8_Intelijj_ExcecoesNaFerramentaDeDebug;

public class Principal_Aula8_1 {
    public static void main(String[] args) {

        int idade = 17;

        try {
            if (idade < 18){
                throw new IllegalArgumentException("Menor de idade");
            }
        }catch (RuntimeException e){
            System.out.println(e.getMessage());
        }

    }
}