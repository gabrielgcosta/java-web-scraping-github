# java-web-scraping-github
Esse é um projeto Java, que tem como objetivo realizar um web scraping de um repositório do git, para que possa retornar as linguagens que foram utilizadas no repositório em questão, e o percentual que essa linguagem representa no repositório como um todo.

Para o desenvolvimento desse projeto, foi utilizado o Java 21.0.2, e o framework Spring Boot/Maven. Para realizar o web scraping, foi utilizada a biblioteca JSoup.

**Request:**

Para realizar a requisição na api, basta acionar a rota /git-info?rep={{repositorio}} utilizando o método GET.

Um exemplo da utilização da rota: /git-info?rep=gabrielgcosta/api-series-laravel

**Resposta:**

A rota retorna um json da seguinte forma:

![image](https://github.com/gabrielgcosta/java-web-scraping-github/assets/42680760/6853c52a-d8b8-4447-9f67-187ff8e009e3)


-----------------------------------------------------------

This is a Java project aimed at performing web scraping on a Git repository to retrieve the programming languages used in that repository and the percentage each language represents in the overall repository.

The development of this project utilized Java 21.0.2 and the Spring Boot/Maven framework. The JSoup library was employed for web scraping.

**Request:**

To make a request to the API, simply trigger the /git-info?rep={{repository}} route using the GET method.

An example of using the route: /git-info?rep=gabrielgcosta/api-series-laravel

**Response:**

The route returns a JSON in the following format:

![image](https://github.com/gabrielgcosta/java-web-scraping-github/assets/42680760/6853c52a-d8b8-4447-9f67-187ff8e009e3)
