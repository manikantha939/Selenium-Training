package authentication;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.Matchers;
import org.testng.Assert;
import org.testng.annotations.Test;

public class basicAuth {
    @Test
    public void base(){
        //way1
        RestAssured.baseURI="https://postman-echo.com/basic-auth";
        RequestSpecification requestSpecification=RestAssured.given();
        requestSpecification.auth().basic("postman","password");
        Response response=requestSpecification.get();

        System.out.println(response.getBody().asPrettyString());

        JsonPath jsonPath=response.jsonPath();
        String authenticated=jsonPath.getString("authenticated");

        Assert.assertEquals(authenticated,"true");
        Assert.assertEquals(response.statusCode(), 200);

        System.out.println("--------------------------------------------------");

        //way2
        RestAssured.given()
                    .auth().basic("postman","password")
                .when()
                    .get("https://postman-echo.com/basic-auth")
                .then()
                    .statusCode(200)
                    .body("authenticated", Matchers.equalTo(true));
    }
}
