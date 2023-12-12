# Aplicação de Blog

Esta é uma aplicação de blog simples construída com o Spring Boot.

## Primeiros Passos

Estas instruções irão orientá-lo sobre como configurar e executar a aplicação localmente para desenvolvimento e testes.

### Pré-requisitos

- Java 17 ou superior
- Maven

### Executando a Aplicação

- Execute a aplicação com o seguinte comando:
    
    ```bash
    mvn spring-boot:run
    ```


- Acesse a aplicação no seu navegador em http://localhost:8081.

### Dockerização da Aplicação 
- Se você desejar, pode dockerizar a aplicação. Certifique-se de ter o Docker instalado.

- Crie a imagem Docker usando o seguinte comando:

```bash
docker build -t nome-da-imagem .
 ```  

- Execute a imagem Docker em um container:

```bash
docker run -p 8081:8080 nome-da-imagem
```
- Acesse a aplicação em http://localhost:8081.

### Encerrando a Aplicação
Para encerrar a aplicação, pressione Ctrl + C no terminal onde ela está sendo executada.


## Construído Com 

*   Spring Boot - O framework web usado
  * Maven - Gerenciamento de dependências 
    * Thymeleaf - O motor de template
    *  PostgreSQL - O banco de dados 
    * Docker - A plataforma de containerização


## Autor

- **Adriana Borges Nogueira** 








