package in.at.tests;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class QueryParameter {
    @Test
    public void queryParameter(){
        //way1
        RestAssured.baseURI="https://api.github.com/search/repositories";
        RequestSpecification requestSpecification=RestAssured.given();
        requestSpecification.header("Authorization","Bearer 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");
        requestSpecification.queryParam("q","topic:java");
        requestSpecification.queryParam("page","1");
        requestSpecification.queryParam("per_page","2");
        Response response=requestSpecification.get();
        System.out.println(response.getBody().asPrettyString());

        System.out.println("---------------------------------------------");

        //way2
        RestAssured.given()
                    .header("Authorization","Bearer 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")
                    .queryParam("q","topic:java")
                    .queryParam("page","1")
                    .queryParam("per_page","2")
                .when()
                    .get("https://api.github.com/search/repositories")
                .then()
                .log().body();
    }
}
