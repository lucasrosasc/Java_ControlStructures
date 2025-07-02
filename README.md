# Java Estruturas de Controle

<p align="center">
 <img src="./loops_java.png" alt="Imagem de Pinguim no topo de pirâmide"/>
</p>

![Java](https://img.shields.io/badge/Java-21-blue?logo=openjdk)
![Maven](https://img.shields.io/badge/Maven-3.9-red?logo=apachemaven)
![Docker](https://img.shields.io/badge/Docker-blue?logo=docker)
![JUnit5](https://img.shields.io/badge/JUnit-5-green?logo=junit5)

Este repositório contém uma coleção de programas básicos com estruturas de controle em Java, projetados com iniciantes em mente, que desejam fortalecer o entendimento de lógica de programação e de conceitos fundamentais.

Cada aplicação é executada em um ambiente isolado usando Docker, permitindo que você se concentre apenas no código, sem se preocupar com a configuração do ambiente Java local.


## Sobre o Projeto

Este projeto serve como um template e um campo de estudo para conceitos fundamentais de Java. Ele contém diferentes programas simples, cada um com sua própria finalidade, e é configurado para ser construído e executado de forma padronizada usando ferramentas modernas de desenvolvimento.

Os programas incluídos são:
* **CalculadoraTabuada:** Calcula a tabuada de um número fornecido pelo usuário.
* **CalculoImc:** Recebe o peso e a altura do usuário e retorna o IMC calculado e a situação da pessoa, conforme padrões internacionais de saúde.
* **Múltiplos de N:** Recebe um número, e o usuário pode inserir outros números. O programa continua aceitando inputs que sejam múltiplos do primeiro número inserido. Ao inserir um número que não seja múltiplo do primeiro, o programa retorna mensagem e é encerrado.
* **ParImpar:** Recebe um número, depois outro número maior. O usuário então decide se quer par ou ímpar. O programa retorna uma lista decrescente do número maior até o menor, exibindo os números pares ou ímpares nesse intervalo.

## 🎯 Objetivo

O foco principal é a prática da lógica de programação através da implementação de algoritmos básicos que utilizam as principais estruturas de controle do Java:

* **Condicionais:** `if/else`, `switch`
* **Laços de Repetição:** `for`, `while`, `do-while`

## 🛠️ Tecnologias Utilizadas

* **Java 21:** Versão LTS mais recente da linguagem.
* **Maven Wrapper:** Garante uma versão consistente do Maven para a construção do projeto.
* **JUnit 5:** Para a implementação de testes unitários.
* **Docker & Docker Compose:** Para criar imagens e executar os programas em contêineres.

## Pré-requisitos

Para executar este projeto, você precisará ter instalado em sua máquina:
* [Docker](https://www.docker.com/get-started)
* [Docker Compose](https://docs.docker.com/compose/install/) (geralmente já vem com o Docker Desktop)

> **Observação:** Não é necessário ter o Maven instalado localmente, pois o projeto utiliza o Maven Wrapper (`mvnw`).

## 🚀 Como Executar

Siga os passos abaixo para executar qualquer um dos programas.

**1. Clone o repositório:**
```sh
git clone [https://github.com/lucasrosasc/Java_ControlStructures.git](https://github.com/lucasrosasc/Java_ControlStructures.git)
```

**2. Navegue até o diretório do projeto:**
```sh
cd Java_ControlStructures
```

**3. Execute usando Docker Compose (Método Recomendado):**

O Docker Compose já está configurado com "atalhos" para cada programa. Este método irá construir a imagem Docker (se ela ainda não existir) e executar o programa desejado de forma interativa.
Para rodar um exercício, use o comando `docker compose run --rm <nome-do-servico>`. O nome do serviço corresponde ao nome da pasta do exercício (ex: `exercicio01`).
O comando `run` cria um container para o serviço, executa o programa Java e, graças à flag `--rm`, remove o container após a execução, mantendo seu ambiente limpo.

* **Para executar a Calculadora de Tabuada:**
    ```sh
    docker-compose run --rm tabuada
    ```

* **Para executar o Cálculo de IMC:**
    ```sh
    docker-compose run --rm imc
    ```

* **Para executar os outros programas:**
    ```sh
    docker-compose run --rm multiplos
    docker-compose run --rm parimpar
    ```

> O parâmetro `--rm` é uma boa prática que remove o contêiner após sua execução, mantendo seu ambiente limpo.

---

## Testes

O projeto está configurado com JUnit 5. Para rodar os testes unitários (se houver), utilize o Maven Wrapper:

```sh
# No Windows
./mvnw.cmd test

# No Linux ou macOS
./mvnw test
```
## 📂 Estrutura do Projeto

O projeto utiliza uma estrutura padrão do Maven, centralizando todo o código-fonte e facilitando a automação da compilação e execução com Docker.
```
├── .mvn/                   # Pasta do Maven Wrapper
├── src/
│   └── main/
│       └── java/
│           └── br/
│               └── com/
│                   └── controlStructs/
│                       ├── CalculadoraTabuada.java
│                       ├── CalculoImc.java
│                       ├── MultiplosN.java
│                       └── ParImpar.java
├── .dockerignore           # Arquivos a serem ignorados pelo Docker
├── .gitignore              # Arquivos a serem ignorados pelo Git
├── docker-compose.yml      # Arquivo de orquestração do Docker Compose
├── Dockerfile              # Receita para construir a imagem Docker
├── mvnw                    # Script do Maven Wrapper (Linux/macOS)
├── mvnw.cmd                # Script do Maven Wrapper (Windows)
├── pom.xml                 # Arquivo de configuração do projeto Maven
└── README.md               # Documentação do projeto (este arquivo)
```
-----

Feito com ❤️ por **Lucas Rosas**.

[LinkedIn](https://www.linkedin.com/in/lucas-rosas-da-cunha/) | [GitHub](https://github.com/lucasrosasc)
