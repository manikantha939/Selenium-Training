package GooglePlace.tests;

import GooglePlace.files.ReqPayload;
import GooglePlace.files.ReusableMethods;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import org.hamcrest.Matchers;
import org.testng.Assert;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class AddPlace {
    public static void main(String[] args) {
        RestAssured.baseURI = "https://rahulshettyacademy.com/";
        String reponse = given()
                .queryParam("key", "qaclick123")
                .header("Content-Type", "application/json")
                .body(ReqPayload.addPlace())
                .when()
                .post("maps/api/place/add/json")
                .then()
                .log().all()
                .assertThat().statusCode(200)
                .body("scope", equalTo("APP"))//Matchers.equalTo("APP")
                .header("Server", "Apache/2.4.52 (Ubuntu)")
                .extract().asString();
        System.out.println(reponse);
        JsonPath jsonPath = new JsonPath(reponse);
        String placeId = jsonPath.getString("place_id");
        System.out.println(placeId);

        System.out.println("-----------------------------------------------");

        //update place
        String newAddress="70 winter walk, USA";
        given()
                .log().all()
                .queryParam("key", "qaclick123")
                .header("contentType","application/json")
                .body("{\n" +
                        "\"place_id\":\""+placeId+"\",\n" +
                        "\"address\":\"70 winter walk, USA\",\n" +
                        "\"key\":\"qaclick123\"\n" +
                        "}")
                .when()
                .put("maps/api/place/update/json")
                .then()
                .assertThat()
                .log().all()
                .statusCode(200)
                .body("msg", Matchers.equalTo("Address successfully updated"));

        //get place

        String getPlaceResponse=given()
                .queryParam("place_id",placeId)
                .queryParam("key","qaclick123")
                .when()
                .get("maps/api/place/get/json")
                .then()
                .log().all()
                .assertThat()
                .statusCode(200)
                .body("name", Matchers.equalTo("Frontline house"))
                .extract().response().asString();
        JsonPath jsonPath1=ReusableMethods.rawToJson(getPlaceResponse);
        String actualAddress=jsonPath1.getString("address");
        System.out.println(actualAddress);
        Assert.assertEquals(actualAddress,newAddress);
    }
}
