package Modulo14_Excecoes.Aula5_Capturando_Checked_Exceptions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**Aula sobre como capturar exceções checadas (exceções que somos obrigados a tratar)*/

public class ClasseExecutora {

    public static void main(String[] args) {

        Path arquivo = Path.of("C:\\Users\\Vicente\\Documents\\abc\\arquivoo.txt"); //Caminho errado para criação do arquivo
        try {
            Files.createFile(arquivo); //Se eu criar até não vai compilar,vai lançar um IOException que é uma excessão checada com obrigação de tratar
        } catch (IOException e) {
            System.out.println("Erro ao criar o arquivo: " + e.getMessage());

        }
    }


}
