# Autenticação e Soma

Este é um projeto simples em Java que solicita ao usuário que crie uma senha, em seguida, pede dois números e, por fim, solicita a senha para autenticação. Se a senha estiver correta, o programa realiza a soma dos dois números e exibe o resultado.

## Funcionalidades

- Permite ao usuário criar uma senha para autenticação.
- Solicita ao usuário que insira dois números.
- Solicita ao usuário que insira a senha para autenticação.
- Compara a senha inserida com a senha criada anteriormente.
- Se a senha estiver correta, realiza a soma dos números fornecidos e exibe o resultado.

## Como Usar

1. Clone este repositório:

   ```bash
   git clone https://github.com/seu-usuario/poo-java
   ```

2. Compile os arquivos Java:

   ```bash
   javac Main.java Processamento.java
   ```

3. Execute o programa:

   ```bash
   java Main
   ```

4. Siga as instruções fornecidas para criar a senha, inserir os números e autenticar-se.

## Estrutura do Projeto

O projeto é dividido em dois arquivos:

1. **Main.java**: Este arquivo contém a classe principal do programa. Ele é responsável pela interação com o usuário e pela execução do fluxo principal do aplicativo.

2. **Processamento.java**: Este arquivo contém a classe `Processamento`, que encapsula a lógica para realizar a soma dos números e comparar as senhas. Ele fornece métodos estáticos para realizar essas operações.

## Utilização do Java

### Arquivos Separados

Em Java, é comum dividir o código em arquivos separados para organizar melhor a estrutura do projeto. Cada arquivo geralmente contém uma única classe, tornando mais fácil entender e modificar o código.

### Classes e Métodos Estáticos

Neste projeto, utilizamos métodos estáticos na classe `Processamento`. Métodos estáticos podem ser chamados sem criar uma instância da classe. Isso é útil quando a lógica do método não depende do estado de objetos da classe.

### Do-While Loop

O laço `do-while` é utilizado para solicitar repetidamente a senha ao usuário até que a senha correta seja inserida. O bloco de código dentro do laço é executado pelo menos uma vez, e a condição é verificada após a execução do bloco.
