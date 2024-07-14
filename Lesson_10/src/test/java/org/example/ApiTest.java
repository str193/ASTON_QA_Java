package org.example;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ApiTest {
    private static final String URL = "https://postman-echo.com";

    @Test
    public void testGetRequest1() {
        Response response = RestAssured.get(URL + "/get");

        Assert.assertEquals(response.getStatusCode(), 200);
        System.out.println("Response GET_1 : " + response.getBody().asString());
    }

    @Test
    public void testPostRequest1() {
        Response response = RestAssured
                .given()
                .body("none")
                .when()
                .post(URL + "/post")
                .then()
                .statusCode(200)
                .extract()
                .response();

        System.out.println("Response POST_1: " + response.getBody().asString());
    }

    @Test
    public void testPostRequest2() {
        Response response = RestAssured
                .given()
                .body("x-www-from-urlencoded")
                .multiPart("foo1", "bar1")
                .multiPart("foo2", "bar2")
                .when()
                .post(URL + "/post")
                .then()
                .statusCode(200)
                .extract()
                .response();

        System.out.println("Response POST_2: " + response.getBody().asString());
    }

    @Test
    public void testPutRequest1() {
        String requestBody = "This is expected to be sent back as part of response body.";

        Response response = RestAssured
                .given()
                .header("Content-type", "application/json")
                .body(requestBody)
                .when()
                .put(URL + "/put")
                .then()
                .statusCode(200)
                .extract().response();


        System.out.println("Response PUT_1: " + response.getBody().asString());
    }

    @Test
    public void testPatchRequest1() {
        String requestBody = "requestBody";

        Response response = RestAssured
                .given()
                .header("Content-Type", "multipart/form-data")
                .multiPart("file", "")
                .multiPart("", requestBody)
                .when()
                .patch(URL + "/patch")
                .then()
                .statusCode(200)
                .extract().response();


        System.out.println("Response PATCH_1: " + response.getBody().asString());
    }

    @Test
    public void testDeleteRequest() {
        Response response = RestAssured.delete(URL + "/delete");

        Assert.assertEquals(response.getStatusCode(), 200);
        System.out.println("DELETE Response: " + response.getBody().asString());
    }
}
