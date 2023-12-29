# Web service
Esse projeto é uma aplicação robusta e eficiente desenvolvida para fornecer serviços web escaláveis e de alta performance. Utilizando a poderosa combinação do framework Spring Boot, a flexibilidade do Hibernate e a padronização do Java Persistence API (JPA).

Porta padrão do sistema localhost: 8080
# Exemplo de requisições

--- Procurar usuário por ID
- GET: ``http://localhost:8080/users/byId/1`` 
  ```
   {
    "id": 1,
    "name": "Maria Brown",
    "email": "maria@gmail.com",
    "phone": "988888888",
    "password": "123456"
    }

--- Adicionar usuário
- POST: ``http://localhost:8080/users/insert`` 
  ```
  {
  "name": "Bob Brown",
  "email": "bob@gmail.com",
  "phone": "977557755"
  } 
  
  NAME	   VALUE
  Location  http://localhost:8080/users/byId/3

--- Atualizar dados
- PUT(update) : ``http://localhost:8080/users/update/1`` 
  ```
  {
  "name": "Bob Brown",
  "email": "bob@gmail.com",
  "phone": "977557755"
  }

- DELETE: ``http://localhost:8080/users/delete/1`` (Apaga o usuário que pertence ao ID determinado)
- GET: ``http://localhost:8080/users/all`` (Mostra todos os usuários  cadastrados)

  # Gostaria de testar o sistema ?
Você pode utilizar ferramentas como o Postman ou o Insomnia para realizar testes de requisições HTTP na API.
