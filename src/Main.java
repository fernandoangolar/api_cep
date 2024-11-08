import model.Endereco;
import record.EnderecoCep;
import service.ArquivoService;
import service.EnderecoService;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner leitura = new Scanner(System.in);

        String busca = "";

        List<Endereco> enderecos = new ArrayList<>();
        EnderecoService enderecoService = new EnderecoService();
        ArquivoService arquivoService = new ArquivoService();

        while (!busca.equalsIgnoreCase("sair")) {

            System.out.println("Digite o CEP para buscar: ");
            busca = leitura.nextLine();

            if (busca.equalsIgnoreCase("sair")) {
                break;
            }

            try {
                Endereco endereco = enderecoService.buscarEndereco(busca);
                enderecos.add(endereco);
                arquivoService.salvarEnderecoEmArquivo(enderecos);
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
                System.out.println("Finalizando a aplicação");
            }

        }
    }
}