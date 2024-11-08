# CEP API

A CEP API é uma aplicação em Java que realiza consultas de endereços com base em um arquivo JSON local de CEPs. Essa aplicação permite buscar endereços e lidar com exceções de CEP não encontrado, oferecendo uma solução simples para integração local de endereços.

## Funcionalidades

- **Consulta de Endereços**: Busca endereços pelo CEP utilizando um arquivo JSON (`enderecos.json`).
- **Exceção Customizada**: Gera exceções customizadas quando um CEP não é encontrado, facilitando o tratamento de erros.
- **Estrutura Modularizada**:
  - **Model**: Representação dos dados de endereço.
  - **Service**: Lógica de busca e manipulação de arquivos.
  - **Record**: Utiliza registro de dados para armazenamento temporário.

## Estrutura do Projeto

- `src/` - Contém o código-fonte:
  - `Main.java` - Ponto de entrada da aplicação.
  - `exception/` - Exceções personalizadas, incluindo `CepNaoEncontrado`.
  - `model/` - Modelo de dados `Endereco`.
  - `service/` - Serviços `ArquivoService` e `EnderecoService` para manipulação de dados.
  - `record/` - Contém registros específicos, como `EnderecoCep`.
- `enderecos.json` - Arquivo de dados contendo os endereços e CEPs para consulta.

## Tecnologias Utilizadas

- **Java** - Linguagem de programação principal.
- **JSON** - Formato de dados para armazenamento de endereços.

## Como Executar

1. Clone o repositório:
   ```bash
   git clone https://github.com/seu-usuario/cep_api.git
