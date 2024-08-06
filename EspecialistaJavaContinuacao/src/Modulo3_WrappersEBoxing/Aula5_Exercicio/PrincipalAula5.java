package Modulo3_WrappersEBoxing.Aula5_Exercicio;

public class PrincipalAula5 {
    public static void main(String[] args) {
        Televisor tv = new Televisor();

        // Não deveria mudar o volume e canal
        tv.mudarCanal(130);
        tv.mudarVolume(20);
        tv.separador();
        //Deveria mudar o volume e canal
        tv.mudarCanal(10);
        tv.mudarVolume(300);


    }
}
