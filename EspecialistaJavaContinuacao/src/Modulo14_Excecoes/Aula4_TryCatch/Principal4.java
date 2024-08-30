package Modulo14_Excecoes.Aula4_TryCatch;

import Modulo14_Excecoes.Aula3_StackTrace_AnalisandoeInterpretandoExcecoes.com.algaworks.estoque.Produto4;

import java.util.Scanner;

public class Principal4 {
    public static void main(String[] args) {
        Produto4 produto4 = new Produto4("Aplle Watch");
        //produto4.ativar();
        produto4.adicionarEstoque(20);

        comprar(produto4);


    }

    private static void comprar(Produto4 produto4){

        Scanner scanner = new Scanner(System.in);
        do {
            try {
                System.out.print("Quantidade: ");
                int quantidade = scanner.nextInt();

                efetuarBaixaEstoque(produto4,quantidade);
                System.out.println("Compra finalizada");
                break;

            }catch (IllegalArgumentException e){
                System.out.println("Erro na compra: " + e.getMessage());
            }catch (IllegalStateException ise){
                System.out.println("Erro na compra: " + ise.getMessage());
                System.out.print("Deseja ativar o produto?");
                if (scanner.nextBoolean()){
                    produto4.ativar();
                }else {
                    System.out.println("OK.Compra não pode ser realizada");
                    break;
                }
            }

        }
        while (true);

    }

    private static void efetuarBaixaEstoque(Produto4 produto3, int quantidade){


            produto3.retirarEstoque(quantidade);
            System.out.printf("%d unidades retiradas do estoque.Estoque atual: %d%n",quantidade,produto3.getQuantidadeEstoque());


        }


    }



/*Try (tente executar o bloco) e caso lance a excessão capture ela (catch) e execute o bloco*/

