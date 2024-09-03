# ServicoTelefonia - Verificação de Serviços Contratados

Este projeto é uma aplicação Java que permite ao usuário verificar se um serviço específico está contratado por um cliente. O programa solicita ao usuário que informe um serviço e o nome do cliente com os serviços contratados, e então verifica se o serviço informado está na lista de serviços do cliente.

## Funcionalidades Principais

1. **Entrada do Serviço a ser Verificado:** O programa solicita ao usuário que insira um número correspondente ao serviço desejado (1 para móvel, 2 para fixa, 3 para banda larga, 4 para TV).

2. **Entrada dos Dados do Cliente:** O programa solicita o nome do cliente e os serviços contratados, separados por vírgula.

3. **Verificação de Serviços Contratados:** O programa verifica se o serviço informado está na lista de serviços contratados pelo cliente.

4. **Exibição do Resultado:** O programa exibe se o serviço está ou não contratado pelo cliente.

5. **Tratamento de Exceções:** O programa lida com entradas inválidas e exibe mensagens de erro apropriadas.

## Passo a Passo do Projeto

### Passo 1: Coletar Dados do Serviço
O programa solicita que o usuário insira um número correspondente ao serviço desejado:
- `1` para móvel
- `2` para fixa
- `3` para banda larga
- `4` para TV

### Passo 2: Coletar Dados do Cliente
O programa solicita que o usuário insira o nome do cliente e os serviços contratados, separados por vírgula.

### Passo 3: Verificar Serviço
O programa verifica se o serviço informado está presente na lista de serviços do cliente. Se estiver, exibe uma mensagem indicando que o serviço está contratado. Caso contrário, exibe uma mensagem indicando que o serviço não está contratado.

### Passo 4: Exibir o Resultado
O programa exibe o status do serviço (se está ou não contratado) e o nome do cliente.

### Passo 5: Tratamento de Exceções
O programa lida com exceções, como entradas inválidas ou erros na verificação dos dados, e exibe mensagens de erro apropriadas.

## Tecnologias Utilizadas

- **Java:** Linguagem de programação utilizada para desenvolver a aplicação.
- **Scanner (java.util.Scanner):** Pacote utilizado para capturar entradas do usuário via console.

## Autor

- **Nome:** Lucas Degrande