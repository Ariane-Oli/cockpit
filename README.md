# 🚀 Cockpit Backend

## 📝 Descrição

O **Cockpit Backend** é uma API RESTful construída em **Java 21** e **Spring Boot 3.5.3**, que gerencia o status de serviços e equipamentos, fornecendo uma interface paginada e filtrada para facilitar consultas eficientes e organizadas.

---

## 🎯 Objetivo

Facilitar a consulta e o monitoramento dos serviços de forma paginada, com filtros dinâmicos por nome e status, garantindo alta performance e organização dos dados.

---

## 🛠️ Tecnologias Utilizadas

- Java 21 🧡
- Spring Boot 3.5.3 🌱
- MySQL 8.x 🐬
- Maven ⚙️
- Lombok (para reduzir boilerplate) 💡
- Arquitetura Hexagonal (Ports & Adapters) 🏗️

---

## ⚙️ Como Funciona

1. **Entrada:** Recebe requisições HTTP contendo filtros e parâmetros de paginação.
2. **Processamento:** A lógica de negócio busca os dados no banco, aplica filtros e gera uma resposta paginada.
3. **Saída:** Retorna um JSON contendo:
    - Lista dos serviços da página solicitada
    - Número da página atual
    - Tamanho da página
    - Total de elementos
    - Total de páginas

---

## 🏛️ Arquitetura

O projeto é estruturado em camadas para maior organização e manutenção:

- **Adapters:** Implementações de entrada (controllers, DTOs) e saída (repositórios, mappers).
- **Ports:** Interfaces que definem contratos entre camadas.
- **Use Cases:** Lógica de negócio principal.
- **Domain:** Modelos e regras de negócio.

---

## 🔥 Principais Funcionalidades

- Consulta de serviços por nome e status com filtros flexíveis.
- Paginação manual eficiente usando streams Java.
- Resposta padronizada e genérica com `PaginatedResponse<T>`.
- Uso de Lombok para gerar automaticamente builders e getters/setters.

---

