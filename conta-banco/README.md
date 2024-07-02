<h2>Descrição do Projeto </h2>


### Sistema Bancário Básico


Este projeto implementa um sistema bancário simples em Java. O objetivo do projeto é criar uma interface interativa de console que permita aos usuários inserir informações básicas sobre uma conta bancária e exibir essas informações formatadas.

### Estrutura do Projeto

O projeto consiste em uma única classe entradas localizada no pacote dados. Esta classe contém atributos para armazenar informações da conta bancária e um método para interagir com o usuário por meio do console.

### Funcionalidades

 - Atributos da Classe `entradas`
 -  `int numero`: Armazena o número da conta bancária.
 -  `String agencia`: Armazena o número da agência bancária.
 - `String nomeCliente`: Armazena o nome do cliente.
 -  `double saldo`: Armazena o saldo da conta.

## Fluxo do Programa
1. Inicialização:
- O método menu é invocado, iniciando a interação com o usuário.

2. Entrada de Dados:
- O sistema solicita ao usuário que insira seu nome, número da agência, número da conta e saldo.

3. Exibição de Dados:
- Após receber os dados do usuário, o sistema exibe uma mensagem formatada confirmando a criação da conta e detalhando as informações fornecidas.

4. Encerramento:
- O método encerra a execução e fecha o scanner.
## Uso do Programa
Para utilizar o programa, um usuário precisa apenas iniciar a execução da classe que contém o método `menu`. 
O sistema guiará o usuário através das etapas necessárias para inserir suas informações bancárias e visualizar a mensagem de confirmação.
 
