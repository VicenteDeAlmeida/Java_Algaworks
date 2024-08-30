package Modulo14_Excecoes.Aula8_Intelijj_ExcecoesNaFerramentaDeDebug;

public class PrincipalAula8 {
    public static void main(String[] args) {

        try {
            System.out.println("Teste");
        }catch (RuntimeException e){
            System.out.println(e.getMessage());
        }
    }
}
/*Aula simples de como lançar um exceção pela ferramenta de debug do intellij
* Colocar o debug
* Clicar com o direito e em throw exception
* Inserir a exceção
* Seguir com o debug e verificar*/