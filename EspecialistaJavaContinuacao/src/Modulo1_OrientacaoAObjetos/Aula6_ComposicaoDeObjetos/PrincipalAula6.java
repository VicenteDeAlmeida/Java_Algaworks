package Modulo1_OrientacaoAObjetos.Aula6_ComposicaoDeObjetos;

public class PrincipalAula6 {
    public static void main(String[] args) {
        CarroAula6 meuCarro = new CarroAula6();
        meuCarro.anoDeFabricacao = 2009;
        meuCarro.cor = "Preto";
        meuCarro.fabricante = "Honda";
        meuCarro.modelo = "HRV";
        System.out.println("MEU CARRO");
        System.out.printf("Modelo: %s%n",meuCarro.modelo);
        System.out.printf("Ano: %s%n",meuCarro.anoDeFabricacao);
        System.out.printf("Cor: %s%n",meuCarro.cor);
        System.out.printf("Fabricante: %s%n",meuCarro.fabricante);
        System.out.println("__________________________________________");
        System.out.println("Seu Carro");

        CarroAula6 seuCarro = new CarroAula6();
        seuCarro.anoDeFabricacao = 2022;
        seuCarro.cor = "Branco";
        seuCarro.fabricante = "BMW";
        seuCarro.modelo = "X6";
        System.out.printf("Modelo: %s%n",seuCarro.modelo);
        System.out.printf("Ano: %s%n",seuCarro.anoDeFabricacao);
        System.out.printf("Cor: %s%n",seuCarro.cor);
        System.out.printf("Fabricante: %s%n",seuCarro.fabricante);
    }
}
