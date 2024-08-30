package Modulo14_Excecoes.Aula10_OutraBoaPratica;

public class Principal {
    public static void main(String[] args) {
        ServicoCadastroAnuncio servicoCadastroAnuncio = new ServicoCadastroAnuncio();
        servicoCadastroAnuncio.cadastrar("123","Teste");

        System.out.println("Anúncio Cadastrado");
    }
}
