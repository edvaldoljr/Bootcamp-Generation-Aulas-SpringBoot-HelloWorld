# Atividade Spring Boot: Controlador RESTful

## Descrição

Esta atividade consiste em desenvolver um controlador simples utilizando o framework Spring Boot. O controlador expõe três endpoints que retornam mensagens específicas. O objetivo é entender a configuração básica e a utilização de anotações no desenvolvimento de APIs RESTful com Spring Boot.

## Estrutura do Projeto

O projeto é composto por um controlador principal que está localizado no pacote `com.generation.task.controller`.

### Controlador: `Taks01Controller`

#### Endpoints

1. **Hello World**

   - **URL:** `/task01/welloworld`
   - **Método HTTP:** GET
   - **Descrição:** Retorna uma mensagem simples "Hello World!!".

   ```java
   @GetMapping("/welloworld")
   public String WelloWorld() {
       return "Hello World!!";
   }
   ```

2. **BSMs da Generation Brasil**

   - **URL:** `/task01/bsn`
   - **Método HTTP:** GET
   - **Descrição:** Retorna uma lista das Business and Soft Skills (BSMs) da Generation Brasil.

   ```java
   @GetMapping("/bsn")
   public String BsmGeneration() {
       return "Mentalidade de Crescimento (Growth Mindset)\n" +
               "Responsabilidade Pessoal (Personal Responsibility)\n" +
               "Orientação ao Futuro (Future Orientation)\n" +
               "Comunicação (Communication)\n" +
               "Trabalho em Equipe (Teamwork)\n" +
               "Pensamento Crítico (Critical Thinking)\n" +
               "Resolução de Problemas (Problem Solving)\n" +
               "Orientação para Resultados (Results Orientation)\n" +
               "Gerenciamento de Tempo (Time Management)\n" +
               "Adaptabilidade (Adaptability)\n" +
               "Autoconfiança (Self-Confidence)\n" +
               "Ética e Integridade (Ethics and Integrity)";
   }
   ```

3. **Objetivos da Semana**

   - **URL:** `/task01/semanaObj`
   - **Método HTTP:** GET
   - **Descrição:** Retorna uma mensagem com os objetivos da semana, focando em três habilidades específicas.

   ```java
   @GetMapping("/semanaObj")
   public String semanaObj() {
       return "Meus objetivos da semana consiste em aprimorar meus conhecimentos nas BSN'S: " +
               "Comunicação (Communication)\n" +
               "Trabalho em Equipe (Teamwork)\n" +
               "Pensamento Crítico (Critical Thinking)\n";
   }
   ```

## Requisitos

- Java 8 ou superior
- Spring Boot 2.5.4 ou superior
- Maven

## Instruções para Execução

1. **Clone o repositório:**

   ```shell
   clone <URL_DO_REPOSITORIO>
   cd <NOME_DO_REPOSITORIO>
   ```

2. **Compile e execute o projeto:**

   ```shell
   mvn clean install
   mvn spring-boot:run
   ```

3. **Acesse os endpoints:**

   - Hello World: http://localhost:8080/task01/welloworld
   - BSMs da Generation Brasil: http://localhost:8080/task01/bsn
   - Objetivos da Semana: http://localhost:8080/task01/semanaObj

# ⭐️ **Deixe um Star** ⭐️



Obrigado por conferir meu repository! É muito gratificante saber que alguém está interessado no meu trabalho. Se você gostou do que viu, deixar um star seria uma grande ajuda no meu crescimento e me motivaria a continuar fazendo projetos. O apoio de pessoas como você é fundamental para que eu possa seguir evoluindo e produzindo conteúdos cada vez melhores. Obrigado mais uma vez e espero que você possa acompanhar meus futuros projetos!