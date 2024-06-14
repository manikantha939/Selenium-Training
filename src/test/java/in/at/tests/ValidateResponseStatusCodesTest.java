package in.at.tests;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class ValidateResponseStatusCodesTest {
    @Test
    public void ValidateSuccessResponseCode() {
        RestAssured.baseURI="https://fakestoreapi.com/products/1";
        RequestSpecification requestSpecification= RestAssured.given();
        Response response=requestSpecification.get();

        int statusCode = response.getStatusCode();
        System.out.println("Status Code ----> "+statusCode);

        Assert.assertEquals(statusCode, 200);

        //DSL
        given()
                .when()
                    .get("https://fakestoreapi.com/products/1")
                .then()
                    .statusCode(201);
    }


    @Test
    public void ValidateFailureResponseCode() {
        RestAssured.baseURI = "https://fakestoreapi.com/products/1";
        RequestSpecification requestSpecification = RestAssured.given();
        Response response = requestSpecification.get();

        int statusCode = response.getStatusCode();
        System.out.println("Status Code ----> " + statusCode);

        Assert.assertEquals(statusCode, 201);

        given()
                .when()
                    .get("https://fakestoreapi.com/products/1")
                .then()
                    .statusCode(201);
    }

}
