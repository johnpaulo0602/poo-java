# Projeto Finanças Pessoais

Este projeto é uma aplicação Java Swing para gerenciamento de finanças pessoais. Ele inclui funcionalidades como login, cálculo de economia, investimentos, questionários educacionais e mais. 

## Funcionalidades

### Login

A classe `ControladorTelaLogin` gere o processo de login. O usuário deve fornecer um nome de usuário e senha correspondentes aos armazenados na classe `BancoProjeto`. 

### Menu Principal

O menu principal permite navegar para diferentes partes do sistema:
- Sistema de Investimento
- Sistema de Economia
- Educação Financeira
- Questionário Financeiro

### Educação Financeira

Controlada pela classe `ControladorEducacao`, essa funcionalidade apresenta diferentes módulos educacionais sobre finanças pessoais.

### Questionário Financeiro

A classe `ControladorQuestao` exibe questões relacionadas a finanças e avalia as respostas fornecidas pelos usuários, fornecendo feedback sobre o desempenho.

### Cálculo de Economia

A classe `ControladorTelaCalculo` permite que os usuários insiram dados sobre seus gastos mensais e calcula o saldo restante, exibindo se o saldo é positivo ou negativo.

### Investimentos

Controlada pela classe `ControladorTelaInvestimento`, esta funcionalidade calcula o retorno de diferentes tipos de investimentos baseados em economias do usuário.

## Como Executar

1. **Compilação**: Compile o projeto utilizando um IDE Java (como NetBeans, IntelliJ IDEA ou Eclipse) ou via linha de comando.
2. **Execução**: Execute a classe `FinancasPessoa` para iniciar a aplicação.
3. **Login**: Utilize as credenciais padrão (nome: `unidesc`, senha: `unidesc`) para acessar o sistema.
4. **Navegação**: Utilize o menu principal para acessar diferentes módulos do sistema.

## Dependências

- Java Development Kit (JDK) 8 ou superior.
- IDE Java ou ferramenta de linha de comando para compilação.

## Licença

Este projeto está licenciado sob a [MIT License](LICENSE).

---

Esta aplicação foi desenvolvida como um exercício educacional para gerenciar finanças pessoais e promover educação financeira.