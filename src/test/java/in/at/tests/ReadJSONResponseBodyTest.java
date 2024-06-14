package in.at.tests;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.Matchers;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class ReadJSONResponseBodyTest {
    @Test
    public void readJSONResponse(){
        //way 1
        RestAssured.baseURI="https://fakestoreapi.com/products/1";
        RequestSpecification requestSpecification= given();
        Response response=requestSpecification.get();

        String responseBody=response.getBody().asString();
        System.out.println(responseBody);

        System.out.println("-----------------------------------------------------------------");

        System.out.println(response.prettyPrint());

        //way 2
        given()
                .when()
                    .get("https://fakestoreapi.com/products/1")
                .then()
                    .log().body();
    }

    @Test
    public void readJSONResponseAsStringAndValidate(){
        //way 1
        RestAssured.baseURI="https://fakestoreapi.com/products/1";
        RequestSpecification requestSpecification= given();
        Response response=requestSpecification.get();

        String responseBody=response.getBody().asString();
        Assert.assertTrue(responseBody.contains("men's clothing"));

        //way 2
        String responseBody1= given()
                        .when()
                            .get("https://fakestoreapi.com/products/1")
                            .getBody().asString();

        Assert.assertTrue(responseBody.contains("men's clothing"));

    }

    @Test
    public void readJSONResponseAndValidateData(){
        RestAssured.baseURI="https://fakestoreapi.com/products/1";
        RequestSpecification requestSpecification= given();
        Response response=requestSpecification.get();

        JsonPath jsonPath=response.jsonPath();

        String category=jsonPath.getString("category");
        String rate=jsonPath.getString("rating.rate");
        Assert.assertEquals(category, "men's clothing");
        Assert.assertEquals(rate, "3.9");

        //way 2
        given()
                .when()
                    .get("https://fakestoreapi.com/products/1")
                .then()
                        .body("category", Matchers.equalTo("men's clothing"))
                        .body("rating.rate", equalTo("3.9"))
                        .body("rating.Count", equalTo("120"));
    }
}
