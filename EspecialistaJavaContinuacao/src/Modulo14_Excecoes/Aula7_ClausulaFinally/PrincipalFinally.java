package Modulo14_Excecoes.Aula7_ClausulaFinally;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class PrincipalFinally {

    public static void main(String[] args) {
        Path arquivo = Path.of("C:\\Users\\Vicente\\Documents\\teste.txt");
        BufferedReader reader = null;



        try {
             reader = Files.newBufferedReader(arquivo);
            System.out.println(reader.readLine());

            reader.close();
        }catch (IOException e){
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());

        }finally {
            try {
                reader.close();
            }catch (IOException ex){
                System.out.println("Erro.Fechando o leitor de arquivo.");
            }

        }
    }
}
