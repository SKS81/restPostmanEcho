package ru.netology;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.junit.jupiter.api.Test;

class testPostmanEcho {

    @Test
    void shouldTestMyData() {
        given()
                .baseUri("https://postman-echo.com")
                .contentType("text/plain; charset=UTF-8")
                .body("Сделаем мир лучше!")
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("data", equalTo("Сделаем мир лучше!"))
        ;
    }
}