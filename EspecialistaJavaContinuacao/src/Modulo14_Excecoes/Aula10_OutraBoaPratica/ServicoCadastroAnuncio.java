package Modulo14_Excecoes.Aula10_OutraBoaPratica;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ServicoCadastroAnuncio {

    private String codigo;
    private String anuncio;


    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getAnuncio() {
        return anuncio;
    }

    public void setAnuncio(String anuncio) {
        this.anuncio = anuncio;
    }

    public void cadastrar(String codigo,String descricao){
        Path arquivo = Path.of("C:\\Users\\Vicente\\Documents\\aner",codigo + ".txt");

        try {
            Files.writeString(arquivo,descricao);
        }catch (IOException e){
            throw new CadastroAnuncioException("Erro na escrita de arquivo de anúncio",e);

        }

    }
}
