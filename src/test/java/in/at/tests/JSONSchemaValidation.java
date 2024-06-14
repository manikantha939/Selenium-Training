package in.at.tests;

import io.restassured.RestAssured;
import io.restassured.module.jsv.JsonSchemaValidator;
import org.testng.annotations.Test;

public class JSONSchemaValidation {
    @Test
    public void validateJSONSchema(){
        //need to add json-schema-validator dependency
        RestAssured.given()
                .when()
                    .get("https://fakestoreapi.com/products/1")
                .then()
                    .assertThat()
                    .body(JsonSchemaValidator.matchesJsonSchemaInClasspath("FakeStoreAPIJSONSchemaForSingleProduct.json"));

        System.out.println("--------------------------------------------------------------------------------------");

        RestAssured.given()
                .when()
                    .get("https://fakestoreapi.com/products")
                .then()
                    .assertThat()
                    .body(JsonSchemaValidator.matchesJsonSchemaInClasspath("FakeStoreAPIJSONSchemaForAllProducts.json"));

    }
}
