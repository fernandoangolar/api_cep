package service;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import model.Endereco;
import record.EnderecoCep;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class EnderecoService {

    public Endereco buscarEndereco(String busca) throws IOException, InterruptedException {

        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();

        String endereco = "https://viacep.com.br/ws/" + busca + "/json/";
        System.out.println(endereco);


        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();

        try {
            HttpResponse<String> response = HttpClient.newHttpClient()
                    .send(request, HttpResponse.BodyHandlers.ofString());
            String json = response.body();
            System.out.println(json);

            EnderecoCep enderecoCep = gson.fromJson(json, EnderecoCep.class);
            return new Endereco(enderecoCep);
        } catch (Exception e) {
            throw new RuntimeException("Não consegui obter o endereço a partir desse CEP...");
        }
    }
}
