package in.at.tests;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class PathParameter {
    @Test
    public void pathParameter(){
        //way1
        RestAssured.baseURI="https://api.github.com/repos/";
        String endPoint="{user}/{repo}";
        RequestSpecification requestSpecification=RestAssured.given();
        requestSpecification.header("Authorization", "Bearer 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");
        requestSpecification.pathParams("user","manikantha939");
        requestSpecification.pathParams("repo","GitDemo");
        Response response=requestSpecification.get(endPoint);
        System.out.println(response.getBody().asPrettyString());

        System.out.println("---------------------------------------------");

        //way2
        RestAssured.given()
                .pathParams("user","manikantha939")
                .pathParams("repo","GitDemo")
                .header("Authorization", "Bearer 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")
                .when()
                .baseUri("https://api.github.com/repos/")
                .get("{user}/{repo}")
                .then()
                .log().body();
    }
}
