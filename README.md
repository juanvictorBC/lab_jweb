# Lab JWeb
Este projeto foi desenvolvido para exemplificar o uso de tecnologias web utilizando Java com Spring Boot, JSP (JavaServer Pages) e Servlets. O objetivo é construir uma aplicação web simples para aprender os fundamentos do desenvolvimento de sistemas com Java para web.

## Tecnologias Utilizadas
- Java com Spring Boot: Framework para construção da aplicação backend.
- JSP (JavaServer Pages): Tecnologia para criar páginas dinâmicas no frontend.
- Servlets: Para controle das requisições HTTP.
- Maven: Gerenciamento de dependências e execução do projeto.
- H2 Database: Banco de dados embutido para persistência de dados.
 
## Funcionalidades

- Exibição de páginas dinâmicas com JSP.
- Controle de sessões para autenticação do usuário.
- Cadastro e listagem de usuários com dados armazenados no banco de dados H2.
- Exclusão de registros.

  
## Como Rodar o Projeto

1. Clone o repositório:

```
git clone https://github.com/juanvictorBC/lab_jweb.git
```
2. Importe o projeto na sua IDE: Se você estiver utilizando o IntelliJ IDEA, Eclipse, ou outra IDE Java, basta importar o projeto como um projeto Maven.

3. Configure o banco de dados:
- O projeto já está configurado para usar o H2 como banco de dados embutido. O banco de dados será inicializado automaticamente na primeira execução.
Compile e execute o projeto: Se você estiver usando o Maven:
```
mvn clean install
mvn spring-boot:run
```
5. Acesse a aplicação:

- O servidor será iniciado em http://localhost:8080.
- Você pode acessar as páginas dinâmicas e interagir com o sistema diretamente no navegador.

## Endpoints da Aplicação

- GET /users: Retorna a lista de usuários cadastrados.
- POST /users: Realiza o cadastro de um novo usuário.
- GET /login: Página de login para autenticação de usuários.
- POST /login: Autentica o usuário.
- GET /logout: Realiza o logout do sistema.
  
## Exemplo de Requisição POST para Cadastro de Usuário
```
{
   "username": "usuario123",
   "password": "senha123"
}
```
## Licença
Este projeto está licenciado sob a MIT License - consulte o arquivo LICENSE para mais detalhes.
