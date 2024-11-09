package api.rest;

import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import static org.hamcrest.Matchers.equalTo;

import static io.restassured.RestAssured.given;

public class UsersAPITest {

    @Test
    public void getAllUsersAPI(){
        given()
                .when()
                .get("https://reqres.in/api/users")
                .then()
                .assertThat()
                .statusCode(200)
                .log().all();
    }

    @Test
    public void createUserAPI(){
        String jsonBody = "{\n" +
                "    \"name\":\"morpheus\",\n" +
                "    \"job\": \"leader\"\n" +
                "}";
        given()
                .contentType(ContentType.JSON)
                .body(jsonBody)
                .when()
                .post("https://reqres.in/api/users")
                .then()
                .assertThat()
                .statusCode(201)
                .body("name", equalTo("morpheus123"))
                .log().all();
    }
}
