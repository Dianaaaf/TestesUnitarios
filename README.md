# Projeto: Controle de Usuários com Testes Unitários

## Tecnologias Utilizadas
- Java 11
- Spring Boot
- Spring Web
- Spring Data JPA
- MariaDB
- JUnit 5
- Mockito

## Explicação do Projeto
O projeto é uma API simples para controle de usuários. Contém as operações de:
- Listar todos os usuários (GET /usuarios)
- Criar um novo usuário (POST /usuarios)

Para a atividade, foram implementados testes unitários utilizando JUnit e Mockito para o controlador de usuários.

## Como Rodar os Testes
**Clone o projeto:**
```bash
git clone <repo-url>
cd usuarios
```

**Execute os testes:**
```bash
./mvnw test
```
Os testes devem fazer as seguintes validações:
- A listagem de usuários
- A criação de um usuário


Caso deseje mais requisições para os testes, como atualizar ou deletar usuários, os mesmos devem ser adicionados em `UsuarioController` e `UsuarioService`.