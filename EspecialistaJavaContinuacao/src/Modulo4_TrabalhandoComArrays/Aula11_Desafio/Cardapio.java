package Modulo4_TrabalhandoComArrays.Aula11_Desafio;

import java.util.ArrayList;

public class Cardapio {

    ArrayList<ItemCardapio> itemCardapios = new ArrayList<>();

    void adicionarItem(ItemCardapio item) {
        itemCardapios.add(item);
    }

    void removerItem(int indice) {
        itemCardapios.remove(indice);
    }

    void imprimirItensCardapio(double precoMinimo, double precoMaximo) {
      for (ItemCardapio itemCardapio: itemCardapios){
          if (itemCardapio.possuiPrecoEntre(precoMinimo,precoMaximo)){
              itemCardapio.imprimir();
          }
      }



        }
    }

