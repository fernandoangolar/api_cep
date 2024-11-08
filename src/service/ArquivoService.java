package service;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import model.Endereco;
import record.EnderecoCep;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class ArquivoService {

    public void salvarEnderecoEmArquivo(List<Endereco> enderecos) {

        Gson gson =  new GsonBuilder()
                .setPrettyPrinting()
                .create();

        try (FileWriter escrita = new FileWriter("enderecos.json")) {
            escrita.write(gson.toJson(enderecos));
            escrita.close();
        } catch (IOException e) {
            System.out.println("Erro ao salvar arquivo: " + e.getMessage());;
        }
    }
}
