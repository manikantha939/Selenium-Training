package in.at.tests;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RestAssuredAPITest {
    public static void main(String[] args) {
        // Way 1
//        RestAssured.baseURI="https://fakestoreapi.com/products";
//        RequestSpecification requestSpec=RestAssured.given();
//        Response response=requestSpec.get();
//        System.out.println(response.prettyPrint());

//        System.out.println("--------------------------------------------");

        // Way 2
//        RestAssured.baseURI="https://fakestoreapi.com/products";
//        RequestSpecification requestSpec= given();
//        Response response=requestSpec.request(Method.GET);
//        System.out.println(response.prettyPrint());
//
//        System.out.println("--------------------------------------------");

        // Way 3 DSL
//        RestAssured.given()
//                .when()
//                    .get("https://fakestoreapi.com/products")
//                .then()
//                    .log().all();
    }

}
