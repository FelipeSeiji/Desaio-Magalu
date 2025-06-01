# 📦 Desafio Magalu - Sistema de Notificações

Este projeto foi desenvolvido como parte de um **desafio técnico proposto pela Magazine Luiza (Magalu)**. A aplicação consiste em um sistema de gerenciamento e envio de notificações por diferentes canais (e-mail, SMS, push, etc.), utilizando **Java**, **Spring Boot**, **Maven** e **Docker**.

---

## 🚀 Tecnologias Utilizadas

- Java 17
- Spring Boot
- Maven
- Docker / Docker Compose
- Spring Data JPA
- H2 Database (banco em memória para testes)
- JUnit 5 (testes automatizados)

---

## 📁 Estrutura do Projeto

```bash
Desafio-Magalu/
├── docker/                      # Configuração Docker
├── src/
│   ├── main/
│   │   ├── java/com/desafiomagalu/desafiomagalu/
│   │   │   ├── DTO/             # Data Transfer Objects (NotificationDTO)
│   │   │   ├── Service/         # Lógica de negócios (NotificationService)
│   │   │   ├── config/          # Carregamento inicial de dados (DataLoader)
│   │   │   ├── controller/      # Endpoints REST (NotificationController)
│   │   │   ├── domain/          # Modelo de domínio
│   │   │   │   ├── channel/     # Entidades de canal de notificação
│   │   │   │   ├── notification/# Entidade Notification
│   │   │   │   └── status/      # Entidade de Status
│   │   │   ├── repository/      # Interfaces JPA
│   │   │   └── DesafiomagaluApplication.java # Classe principal
│   │   └── resources/
│   │       └── application.properties        # Configurações da aplicação
│   └── test/java/com/desafiomagalu/desafiomagalu/
│       └── DesafiomagaluApplicationTests.java
├── pom.xml                      # Gerenciador de dependências
