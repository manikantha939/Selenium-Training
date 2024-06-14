package in.at.tests;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class ValidateResponseHeadersTest {
    @Test
    public void printAllHeaders() {
        RestAssured.baseURI="https://fakestoreapi.com/products/1";
        RequestSpecification requestSpecification= RestAssured.given();
        Response response=requestSpecification.get();

        Headers headers=response.getHeaders();
        for (Header header:headers){
            System.out.println(header.getName()+" ----> "+header.getValue());
        }

        //DSL
        given()
                .when()
                    .get("https://fakestoreapi.com/products/1")
                .then()
                    .log().headers();
    }

    @Test
    public void getSpecificHeader() {
        RestAssured.baseURI = "https://fakestoreapi.com/products/1";
        RequestSpecification requestSpecification = RestAssured.given();
        Response response = requestSpecification.get();

        System.out.println(response.getHeader("Content-Type"));
        System.out.println(response.getHeader("Connection"));
        System.out.println(response.getHeader("Server"));

        System.out.println("---------------------------------");

        Response response1=given()
                                .when()
                                    .get("https://fakestoreapi.com/products/1");

        System.out.println(response1.getHeader("Content-Type"));
        System.out.println(response1.getHeader("Connection"));
        System.out.println(response1.getHeader("Server"));
    }

    @Test
    public void validateResponseHeaders(){
        RestAssured.baseURI="https://fakestoreapi.com/products/1";
        RequestSpecification requestSpecification=RestAssured.given();
        Response response=requestSpecification.get();

        String contentType=response.getHeader("Content-Type");
        String connection=response.getHeader("Connection");
        String server=response.getHeader("Server");
        System.out.println(contentType);
        Assert.assertEquals(contentType, "application/json; charset=utf-8");

        System.out.println(connection);
        Assert.assertEquals(connection, "keep-alive");

        System.out.println(server);
        Assert.assertEquals(server, "cloudflare");

        //DSL
        given()
                .when()
                    .get("https://fakestoreapi.com/products/1")
                .then()
                    .header(contentType, "application/json; charset=utf-8")
                    .header(connection, "keep-alive")
                    .header(server, "cloudflare");
    }
}
