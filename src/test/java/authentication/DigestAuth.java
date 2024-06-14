package authentication;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.Matchers;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DigestAuth {
    @Test
    public void digestAuth(){
        //way1
        RestAssured.baseURI="https://postman-echo.com/digest-auth";
        RequestSpecification requestSpecification=RestAssured.given();
        requestSpecification.auth().digest("postman","password");

        Response response=requestSpecification.get();

        JsonPath jsonPath=response.jsonPath();
        String authenticated=jsonPath.getString("authenticated");

        Assert.assertEquals(response.statusCode(), 200);
        Assert.assertEquals(authenticated, "true");

        System.out.println("-----------------------------------------------------");

        //way 2
        RestAssured.given()
                    .auth().digest("postman","password")
                .when()
                    .get("https://postman-echo.com/digest-auth")
                .then()
                .statusCode(200)
                .body("authenticated", Matchers.equalTo(true)).log().all();
    }
}
