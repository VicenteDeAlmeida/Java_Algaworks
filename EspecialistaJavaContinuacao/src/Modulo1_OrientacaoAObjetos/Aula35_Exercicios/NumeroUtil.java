package Modulo1_OrientacaoAObjetos.Aula35_Exercicios;

public class NumeroUtil {

    void maiorNumero(int numero1,int numero2){
        if (numero1 > numero2){
            System.out.println("Número 1 maior que número 2!!");
        }else {
            System.out.println("Número 2 maior que número 1!!");
        }
    }
    void maiorNumero (int numero1,int numero2,int numero3){
        if (numero1 >numero2 && numero1 > numero3){
            System.out.println("Número 1 maior!!");
        } else if (numero2 > numero1 && numero2 > numero3) {
            System.out.println("Número 2 maior!!");
        }else {
            System.out.println("Número 3 maior!!");
        }

    }
    void maiorNumero(double numero1,double numero2){
        if (numero1 > numero2){
            System.out.println("Número 1 maior que número 2!!");
        }else {
            System.out.println("Número 2 maior que número 1!!");
        }
    }
    void maiorNumero (double numero1,double numero2,double numero3){
        if (numero1 >numero2 && numero1 > numero3){
            System.out.println("Número 1 maior!!");
        } else if (numero2 > numero1 && numero2 > numero3) {
            System.out.println("Número 2 maior!!");
        }else {
            System.out.println("Número 3 maior!!");
        }

    }


}
