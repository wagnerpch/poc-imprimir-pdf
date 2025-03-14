# POC Imprimir Pdf
POC: imprimir pdf com Thymeleaf e Flying Saucer

[![Static Badge](https://img.shields.io/badge/license-GNU-green)](https://github.com/wagnerchc/chess-system-java/blob/master/LICENSE)

# Sobre o projeto

Aplicação backend em Java 21 com Spring Boot.

Essa prova de conceito foi desenvolvida para testar Thymeleaf e Flying Saucer como alternativa ao JasperReports.

A solução apresenta um jeito simples e rápido de gerar relatórios em PDF usando templates em html com Thymeleaf.

# Tecnologias utilizadas

## Back-end

- Java 21
- Spring Boot Web
- Thymeleaf
- Flying Saucer

## Dependências:
- spring-boot-starter-web
- spring-boot-devtools
- h2
- lombok
- spring-boot-starter-test
- spring-boot-starter-thymeleaf
- thymeleaf-spring5
- flying-saucer-pdf-itext5
- itextpdf
- itext-core
- spring-boot-starter-data-jpa

# Como executar o projeto

## Back end

Pré-requisitos: Java

```bash
# clonar repositório
git clone https://github.com/wagnerpch/poc-imprimir-pdf

# acessar a pasta
cd poc-imprimir-pdf

# executar o projeto
./mvnw spring-boot:run
```

# Rotas

- Hello World = http://localhost:8080/pdf/generate?name=Wagner
- Lista de Usuários = http://localhost:8080/users/pdf

# Autor

Wagner Pereira Chequeleiro

https://www.linkedin.com/in/wagnerpch/
