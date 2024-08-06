package Modulo1_OrientacaoAObjetos.Aula5_Desafio;

public class Executora {
    public static void main(String[] args) {
        Cachorro primeiroCachorro = new Cachorro();
        primeiroCachorro.nome = "Zeca";
        primeiroCachorro.raca = "Buldog";
        primeiroCachorro.idade = 10;
        primeiroCachorro.sexo = 'M';
        System.out.printf("O primeiro cachorro: %nNome: %s%nRaça: %s%nIdade: %d anos%nSexo: %c%n",primeiroCachorro.nome,primeiroCachorro.raca,
            primeiroCachorro.idade,primeiroCachorro.sexo);
        Cachorro segundoCachorro = new Cachorro();
        segundoCachorro.nome = "Deda";
        segundoCachorro.raca = "Vira Lata";
        segundoCachorro.idade = 2;
        segundoCachorro.sexo = 'F';
        System.out.printf("O segundo cachorro: %nNome: %s%nRaça: %s%nIdade: %d anos%nSexo: %c%n",segundoCachorro.nome,segundoCachorro.raca,
            segundoCachorro.idade,segundoCachorro.sexo);
    }
}
