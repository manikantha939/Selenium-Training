package authentication;

import in.at.POJOForSerialize.Location;
import in.at.POJOForSerialize.Serialize;
import io.restassured.RestAssured;

import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.given;

public class SerializeTest {
    public static void main(String[] args) {
        RestAssured.baseURI="https://rahulshettyacademy.com/";
        Serialize serialize = getSerialize();

        String response=given()
                .queryParam("key","qaclick123")
                .header("Content-Type","application/json")
                .body(serialize)
                .when()
                .log().all()
                .post("maps/api/place/add/json")
                .then().assertThat().statusCode(200).extract().response().asString();

        System.out.println(response);
    }

    private static Serialize getSerialize() {
        Serialize serialize=new Serialize();
        serialize.setAccuracy(50);
        serialize.setName("Frontline house");
        serialize.setPhone_number("(+91) 983 893 3937");
        serialize.setAddress("29, side layout, cohen 09");
        serialize.setWebsite("http://google.com");
        serialize.setLanguage("French-IN");
        List<String> myList=new ArrayList<String>();
        myList.add("shoe park");
        myList.add("shop");
        serialize.setTypes(myList);
        Location l=new Location();
        l.setLat(-38.383494);
        l.setLng(33.427362);
        serialize.setLocation(l);
        return serialize;
    }
}
